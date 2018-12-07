 
package Controller;

import ApiFunction.ApiDao.ApiTongdongallnv;
import ApiFunction.ApiDao.Apidmquanlyimagetoday;
import ApiFunction.ApiFun;
import ApiFunction.ApiKhachHangDao;
import ConnectBean.ConnectionProvider;
import static ConnectBean.Provider.*;
import DanhmucModel.Dsfileimagetoday;
import DanhmucModel.ImageUploadToday;
import EntitiesBean.*;
import LocalFuntionGlobal.FunctionLocal;
import Global.SessionBean;
import LocalFuntionGlobal.HamUserAll;
import LocalModel.ImageUploadModel;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.event.ComponentSystemEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import DatabaseDao.DmquanlyimageDao;
import DatabaseDao.ImageDao;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import org.primefaces.model.CroppedImage;
import Image.*;
import LocalFuntionGlobal.Hamimage;
import LocalModel.Customer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

 
@Named(value = "chinhamainManagedBean")
@SessionScoped
public class ChinhamainManagedBean  implements Serializable {

    // Khai bao List
    private  List<Dsfileimagetoday> dsTranSac = new ArrayList<>();
    private  List<VwTransactionListWeb> dsTranSacWeb = new ArrayList<>();
    private  List<GiaytoList> dsgiayto = new ArrayList<>(); 
    private  List<VwDsUploadImagehbWeb> dsUploadImagehbWebs = new ArrayList<>();
    private  List<VwDmQuanlydotImagetongWeb> dmQuanlydotImagetongWebs = new ArrayList<>();
    private  List<VwDmQuanlydotimagectietWeb> dmQuanlydotimagectietWebs = new ArrayList<>();
    List<String> dsfile= new ArrayList();
    List<ImageUploadModel> imageUploadList= new ArrayList<>();
    // Khai bao Model.
    
    private  VwTransactionListWeb tranSacWeb = new VwTransactionListWeb();
    private  VwDsUploadImagehbWeb vwDsUploadImagehbWeb = new VwDsUploadImagehbWeb();
    private KieuhoiList kieuhoiList = new KieuhoiList();
    private TransactionList transactionList= new TransactionList();
    private KieuhoiListPK kieuhoiListPK= new KieuhoiListPK();
    private String debugstring ;
    
    //Khai bao bien don
    
    private String loaitkdulieu=null ;
    private UploadedFile file;
    private Boolean ishoibaofile=false;
    private String loaihb ;
    private String dotbn=null;
    private Integer fileno;
    private Boolean isupdatesoct=true;
    private Boolean loaiscan=false;
    private CroppedImage croppedImage;
    private String newImageName;
    private InputStream filedrop;
    private Boolean showbut=true;
    private Boolean showbutxacnhan=true;
    private String sobnerror=null;
    
    
    
  public void  crop() throws IOException {
      String  rootpathimage="D:\\home\\imagehoibao\\01072017\\";
      InputStream sourceimage = new FileInputStream(rootpathimage+"IMG_1380"+".jpg");  
 
       BufferedImage imagedrop=FunctionLocal.dropFileImage(sourceimage,"jpg","B");
      // BufferedImage blackiamge=fn.processImage(imagedrop, 0, 0, 140, 0);   
        //Xuat file ra thu muc . 
       HamUserAll hamUserAll= new HamUserAll();
       Boolean kq1 = hamUserAll.storeImageServer(imagedrop, "IMG_1380.jpg",1); 
      
    }
        
  
    
  public void kiemtragiaodich(VwDmQuanlydotimagectietWeb dmQuanlydotimagectietWe,String sobn){

     VwDmQuanlydotimagectietWeb tclass= new VwDmQuanlydotimagectietWeb();
             isupdatesoct=false;
     vwDsUploadImagehbWeb=new VwDsUploadImagehbWeb();
      int stt=dmQuanlydotimagectietWebs.indexOf(dmQuanlydotimagectietWe);
      tclass=dmQuanlydotimagectietWe;
      VwDsUploadImagehbWeb imagehbWeb=new VwDsUploadImagehbWeb();
      imagehbWeb= HamUserAll.getbiennhanfromsobn2018(dmQuanlydotimagectietWe.getSobn().toString());
      if( imagehbWeb.getIdChinhanh()!=null){
          
          vwDsUploadImagehbWeb.setHoten(imagehbWeb.getHoten());
          vwDsUploadImagehbWeb.setIdNvChitra(imagehbWeb.getIdNvChitra());
          vwDsUploadImagehbWeb.setMaNguoinhan(imagehbWeb.getMaNguoinhan());
          vwDsUploadImagehbWeb.setSotiengoi(imagehbWeb.getSotiengoi());
          vwDsUploadImagehbWeb.setIdCtTuythan(imagehbWeb.getIdCtTuythan());
          vwDsUploadImagehbWeb.setSoCtTuythan(imagehbWeb.getSoCtTuythan());
          vwDsUploadImagehbWeb.setDachitra(imagehbWeb.getDachitra());
          vwDsUploadImagehbWeb.setBiennhanC(imagehbWeb.getBiennhanC());
          vwDsUploadImagehbWeb.setSobn(imagehbWeb.getSobn());

          
          String dct=imagehbWeb.getBiennhanC().toString();
          tclass.setIdNvChitra(imagehbWeb.getIdNvChitra());
          tclass.setSoCtTuythan(imagehbWeb.getSoCtTuythan());
          tclass.setHoten(imagehbWeb.getHoten());
          dmQuanlydotimagectietWebs.set(stt, tclass);
          if (dct.equalsIgnoreCase("Y") )
          {
             isupdatesoct=true;
          }
          else
          {
             isupdatesoct= false;
          }
          
          if (imagehbWeb.getSoCtTuythan()!=null) 
          {
            this.timtheoloaigiayto(dmQuanlydotimagectietWe) ;
          }
          
      }
    
}    
    
    
  public void showthongtindaxnhoibao(){

     //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Infosdsdsdsdsdsdsdsds", "PrimeFaces Rocks."));
    // Lay thong tin . 
      String userid =SessionBean.getUserId();
      dmQuanlydotImagetongWebs=HamUserAll.dshoibaodaxacnhan("Y");
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+dmQuanlydotImagetongWebs.size(), ""));
     
    
}        
    
  public void showthongtinxnhoibao(){

     //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Infosdsdsdsdsdsdsdsds", "PrimeFaces Rocks."));
    // Lay thong tin . 
      String userid =SessionBean.getUserId();
      dmQuanlydotImagetongWebs=HamUserAll.dshoibaodaxacnhan("N");
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+dmQuanlydotImagetongWebs.size(), ""));
  
    
}  
  
    public void  deletebnchuaduyet(VwDmQuanlydotimagectietWeb dmQuanlydotimagectietWeb) throws SQLException {
        
        String khoa=dmQuanlydotimagectietWeb.getKhoa().toString();
        //String soct=dmQuanlydotimagectietWeb.getSoCtTuythan().toString();
        //String sobiennhan=dmQuanlydotimagectietWeb.getSobn().toString();
     
        DmquanlyimageDao dao=new DmquanlyimageDao();
        String kq=dao.deletebnchuaduyet(khoa, "001", null, null, "Y");
        if (kq.equalsIgnoreCase("T"))  
        {
             dmQuanlydotimagectietWebs.remove(dmQuanlydotimagectietWeb);
             dmQuanlydotImagetongWebs=null;
              FacesMessage message = new FacesMessage("Xóa thành công . "  , "" );
              FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
        else{
            
               FacesMessage message = new FacesMessage("Xóa không thành công . " +kq, "" );
               FacesContext.getCurrentInstance().addMessage(null, message);
            
        }
 

   }  
 
    
   public void  xacnhandotbn(VwDmQuanlydotImagetongWeb dmQuanlydotImagetongWeb) throws SQLException {
       

       if(dmQuanlydotImagetongWeb.getDeserror().equalsIgnoreCase("SUSS"))
       {
            String dotbn=dmQuanlydotImagetongWeb.getIdcode();
           

             DmquanlyimageDao dao=new DmquanlyimageDao();
             String kq=dao.updatebiennhantheodothb(dotbn);
             
            if (kq.equalsIgnoreCase("T"))  
            {    List<VwDmQuanlydotimagectietWeb>   dshoibaoct= new ArrayList<>();
                 dshoibaoct=HamUserAll.dshoibaochitiet2018(dmQuanlydotImagetongWeb.getIdcode(), dmQuanlydotImagetongWeb.getIderror());
                 
                 FacesMessage message = new FacesMessage("Xác nhận  thành công . "  , "" );
                 FacesContext.getCurrentInstance().addMessage(null, message);
                 this.showthongtinhoibao();

            }
             else{

                   FacesMessage message = new FacesMessage("Xác nhận không thành công . " +kq, "" );
                   FacesContext.getCurrentInstance().addMessage(null, message);

            }
       }
       else{
           
            
                   FacesMessage message = new FacesMessage("Hồ sơ chưa hoàn thành không thể xác nhận ." );
                   FacesContext.getCurrentInstance().addMessage(null, message);
           
       }
       
      
     
  

   }  
     
    
        
  public void  rexacnhanthongtinerror(VwDmQuanlydotimagectietWeb dmQuanlydotimagectietWeb) throws SQLException {
       
        String khoa=dmQuanlydotimagectietWeb.getKhoa().toString();
        String soct=dmQuanlydotimagectietWeb.getSoCtTuythan().toString();
        String sobn=dmQuanlydotimagectietWeb.getSobn().toString();
 
        String makhachhang=dmQuanlydotimagectietWeb.getMakhachhang();
        if (makhachhang.equalsIgnoreCase("NOVALUE") )
         {
             //Tao khach hang moi
                // Tim lai bang so CMND .    
             ApiKhachHangDao apiKhachHangDao= new ApiKhachHangDao();
             Customer khachhangmodel= new Customer();
             List<Customer> listkh = new ArrayList<>();
             listkh=apiKhachHangDao.getListCustomerCMND(dmQuanlydotimagectietWeb.getSoCtTuythan());
             try {
                khachhangmodel=listkh.get(0);
                makhachhang=khachhangmodel.getCustomerCode();
            } catch (Exception e) {
                 try {
                     //Tao khach hang  .
                     khachhangmodel.setCustomerCode("");
                     khachhangmodel.setFullname(dmQuanlydotimagectietWeb.getHoten());
                     khachhangmodel.setDateOfBirth("");
                     khachhangmodel.setGender("1");
                     khachhangmodel.setJobCode("null");
                     khachhangmodel.setCityId("null");
                     khachhangmodel.setDistrictId("null");
                     khachhangmodel.setAddress("null");
                     khachhangmodel.setLongitude(0);
                     khachhangmodel.setLatitude(0);
                     
                     khachhangmodel.setIdCardNumber(dmQuanlydotimagectietWeb.getSoCtTuythan());
                     khachhangmodel.setIdCardTypeCode(dmQuanlydotimagectietWeb.getIdCtTuythan());
                     khachhangmodel.setPlaceOfIssue(dmQuanlydotimagectietWeb.getIdnoicap());
                     DateFormat dateFormat;
                     dateFormat=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                     khachhangmodel.setDateOfIssue(dateFormat.format(dmQuanlydotimagectietWeb.getNgaycap()) );
                     khachhangmodel.setIsHasBackImage(false);
                     khachhangmodel.setIsHasBackImage(false);
                     khachhangmodel.setCurrencyCode("null");
                     khachhangmodel.setAmount(0);
                     String[] dsdienthoai= new String[1];
                     dsdienthoai[0]="";
                     khachhangmodel.setPhones(dsdienthoai);
                     khachhangmodel.setUsername("null");
                     khachhangmodel.setInfoStatus(1);
                     khachhangmodel.setIdCardFrontImage("");
                     khachhangmodel.setIdCardBackImage("");
                     String kq=apiKhachHangDao.updatekhachhang(khachhangmodel);
                 } catch (IOException ex) {
                     Logger.getLogger(ChinhamainManagedBean.class.getName()).log(Level.SEVERE, null, ex);
                      
                 }
 
         }
     
        DmquanlyimageDao dao=new DmquanlyimageDao();
        String kq=dao.updatebiennhanerror(khoa,dmQuanlydotimagectietWeb.getIdCtTuythan(), soct,sobn,"Y",dmQuanlydotimagectietWeb.getNgaycap(),dmQuanlydotimagectietWeb.getMakhachhang());
        if (kq.equalsIgnoreCase("T"))  
        {    
        
            dmQuanlydotimagectietWebs.remove(dmQuanlydotimagectietWeb);
                
            FacesMessage message = new FacesMessage("Xác nhận  thành công . "  , "" );
           FacesContext.getCurrentInstance().addMessage(null, message);
         

        }
        else{
            
               FacesMessage message = new FacesMessage("Xác nhận không thành công . " +kq, "" );
               FacesContext.getCurrentInstance().addMessage(null, message);
            
        }
  

   } 
  }
  
     
    
   public void  capnhatcmnd(VwDmQuanlydotimagectietWeb dmQuanlydotimagectietWeb) throws SQLException {
    
       // Ma khach hang bi trong thi se tim trong bang khach hang . Neu chua co se tao khach hang moi .
        String makhachhang=dmQuanlydotimagectietWeb.getMakhachhang();
        VwDmQuanlydotimagectietWeb tclass=new VwDmQuanlydotimagectietWeb();
        tclass  =dmQuanlydotimagectietWeb;     
        
        if (makhachhang.equalsIgnoreCase("NOVALUE"))
        {
              // Tim lai bang so CMND .    
             ApiKhachHangDao apiKhachHangDao= new ApiKhachHangDao();
             Customer khachhangmodel= new Customer();
             List<Customer> listkh = new ArrayList<>();
             listkh=apiKhachHangDao.getListCustomerCMND(dmQuanlydotimagectietWeb.getSoCtTuythan());
             try {
                khachhangmodel=listkh.get(0);
                makhachhang=khachhangmodel.getCustomerCode();
            } catch (Exception e) {
                 try {
                     //Tao khach hang  .
                     khachhangmodel.setCustomerCode("");
                     khachhangmodel.setFullname(dmQuanlydotimagectietWeb.getHoten());
                     khachhangmodel.setDateOfBirth("");
                     khachhangmodel.setGender("1");
                     khachhangmodel.setJobCode("null");
                     khachhangmodel.setCityId("null");
                     khachhangmodel.setDistrictId("null");
                     khachhangmodel.setAddress("null");
                     khachhangmodel.setLongitude(0);
                     khachhangmodel.setLatitude(0);
                     
                     khachhangmodel.setIdCardNumber(dmQuanlydotimagectietWeb.getSoCtTuythan());
                     khachhangmodel.setIdCardTypeCode(dmQuanlydotimagectietWeb.getIdCtTuythan());
                     khachhangmodel.setPlaceOfIssue(dmQuanlydotimagectietWeb.getIdnoicap());
                     DateFormat dateFormat;
                     dateFormat=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                     khachhangmodel.setDateOfIssue(dateFormat.format(dmQuanlydotimagectietWeb.getNgaycap()) );
                     khachhangmodel.setIsHasBackImage(false);
                     khachhangmodel.setIsHasBackImage(false);
                     khachhangmodel.setCurrencyCode("null");
                     khachhangmodel.setAmount(0);
                     String[] dsdienthoai= new String[1];
                     dsdienthoai[0]="";
                     khachhangmodel.setPhones(dsdienthoai);
                     khachhangmodel.setUsername("null");
                     khachhangmodel.setInfoStatus(1);
                     khachhangmodel.setIdCardFrontImage("");
                     khachhangmodel.setIdCardBackImage("");
                     String kq=apiKhachHangDao.updatekhachhang(khachhangmodel);
                 } catch (IOException ex) {
                     Logger.getLogger(ChinhamainManagedBean.class.getName()).log(Level.SEVERE, null, ex);
                      
                 }
                 
                
            }
             
        }
        tclass.setMakhachhang(makhachhang);
        DmquanlyimageDao dao=new DmquanlyimageDao();
        String kq=dao.updatettkhtodate(tclass, "Y");
        if (kq.equalsIgnoreCase("T"))  
        {
            
            // Cap nhat khach hang
             dmQuanlydotimagectietWebs.remove(dmQuanlydotimagectietWeb);
             FacesMessage message = new FacesMessage("Xác nhận  thành công . "  , "" );
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
        else{
            
               FacesMessage message = new FacesMessage("Xác nhận không thành công . " +kq, "" );
               FacesContext.getCurrentInstance().addMessage(null, message);
            
        }
 

   }  
   
    
  public String  kiemtrabiennhan(VwDmQuanlydotImagetongWeb dmQuanlydotImagetongWeb) {
        
        
        dmQuanlydotimagectietWebs=new ArrayList<>();
        dmQuanlydotimagectietWebs=HamUserAll.dshoibaochitiet2018(dmQuanlydotImagetongWeb.getIdcode(), dmQuanlydotImagetongWeb.getIderror());
       
       
       
       
      if(dmQuanlydotImagetongWeb.getIderror().equalsIgnoreCase("ERROR"))
      {
          return "dshshoibaonvchinharexacnhanerror" + "?faces-redirect=true";
      }
      else if (dmQuanlydotImagetongWeb.getDeserror().equalsIgnoreCase("XM"))
      {
        
           return "dshshoibaonvchinhakiemtraxm" + "?faces-redirect=true";
       
      }
      else{
          
          return "dshshoibaonvchinhakiemtra" + "?faces-redirect=true";
          
      }
      
    
}   

 public String  kiemtrabiennhanupload(VwDmQuanlydotImagetongWeb dmQuanlydotImagetongWeb) {
        
        
        dmQuanlydotimagectietWebs=new ArrayList<>();
        dmQuanlydotimagectietWebs=HamUserAll.dshoibaochitiet(dmQuanlydotImagetongWeb.getIdcode(), dmQuanlydotImagetongWeb.getIderror());
     
      if (dmQuanlydotImagetongWeb.getDeserror().equalsIgnoreCase("XM"))
      {
        
           return "dshshoibaonvchinhakiemtraxm" + "?faces-redirect=true";
       
      }
      else if (dmQuanlydotImagetongWeb.getDeserror().equalsIgnoreCase("ERROR")){
                return "dshsxacnhanthongtinimage"+ "?faces-redirect=true";
                
                }
      else{
          
          return "dshshoibaonvchinhakiemtra" + "?faces-redirect=true";
          
      }
        
     
      
    
}   
      
  
    
 public void showthongtinhbdahoanthanh(){
    
     //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Infosdsdsdsdsdsdsdsds", "PrimeFaces Rocks."));
    // Lay thong tin . 
      this.showbutxacnhan=true;
      String userid =SessionBean.getUserId();
      dmQuanlydotImagetongWebs=HamUserAll.dstheonhanvienmobile2018(userid,"Y");
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+dmQuanlydotImagetongWebs.size(), ""));
     
    
}     
    
 public void showthongtinhoibao(){

     //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Infosdsdsdsdsdsdsdsds", "PrimeFaces Rocks."));
    // Lay thong tin . 
      this.showbutxacnhan=false;
      dmQuanlydotImagetongWebs= new ArrayList<>();
      String userid =SessionBean.getUserId();
      dmQuanlydotImagetongWebs=HamUserAll.dstheonhanvienmobile2018(userid,"N");
     // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+dmQuanlydotImagetongWebs.size(), ""));
     
    
}  
 
     
 public void showthongtinhoibaomobile(){

     //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Infosdsdsdsdsdsdsdsds", "PrimeFaces Rocks."));
    // Lay thong tin . 
      dmQuanlydotImagetongWebs= new ArrayList<>();
      String userid =SessionBean.getUserId();
      dmQuanlydotImagetongWebs=HamUserAll.dshoibaotheonhanvien(userid,"N");
     // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+dmQuanlydotImagetongWebs.size(), ""));
     
    
} 
 
   public String  taodoihoibao() {
    
      String device=SessionBean.getDeviceName();
      String userid=SessionBean.getUserId();
      if (device.equalsIgnoreCase("Desktop")  )
      {
          ishoibaofile=false;
          imageUploadList=new ArrayList<>();
          DateFormat df = new SimpleDateFormat("MMddyyyyHHmm");
          Date today = Calendar.getInstance().getTime();        
          dotbn = df.format(today);
          fileno=0;
          imageUploadList=new ArrayList<>();
          return "dshshoibaonvchinhact"+ "?faces-redirect=true";
          
      }
      else{
      
           FacesMessage message = new FacesMessage("Đăng nhập trên máy tính mới sử dụng được chức năng này" ,"" );
           FacesContext.getCurrentInstance().addMessage(null, message);
           return null;
          
      
      }
    
}
    
    public String  chuyentrangnvchinha() {

          return "indexchinha" + "?faces-redirect=true";

}
    
  public String  chuyentrang(String namepage) {
    
      
        return namepage + "?faces-redirect=true"; 
          
      
}    
    
    
    public String  taodotchuphinh() {
      
      String device=SessionBean.getDeviceName();
      String userid=SessionBean.getUserId();
      String chinhanh=SessionBean.getChinhanhId();
      String hbmobile=SessionBean.getHbmobile();
     /* if (device.equalsIgnoreCase("Desktop")  )
      {
           FacesMessage message = new FacesMessage("Đăng nhập bằng điện thoại mới sử dụng được chức năng này" ,"" );
           FacesContext.getCurrentInstance().addMessage(null, message);
          return null;
          
      }*/
      //else{
    
          
      if (  hbmobile.equalsIgnoreCase("Y") && chinhanh.contains("003")  )
      { 
          ishoibaofile=false;
          imageUploadList=new ArrayList<>();
          DateFormat df = new SimpleDateFormat("MMddyyyyHHmm");
          Date today = Calendar.getInstance().getTime();        
          dotbn = df.format(today);
          fileno=0;
          imageUploadList=new ArrayList<>();
          return "uploadimagechuphinh" + "?faces-redirect=true";
      }
      else{       
           FacesMessage message = new FacesMessage("Bạn chưa được phân quyền sử dụng chức năng này" ,"" );
           FacesContext.getCurrentInstance().addMessage(null, message);
          return null;
          
      }
      //}
    
}
    
     public String  taoxacminhgiaodich() {
    
          String device=SessionBean.getDeviceName();
      
          
          ishoibaofile=false;
          imageUploadList=new ArrayList<>();
          DateFormat df = new SimpleDateFormat("MMddyyyyHHmm");
          Date today = Calendar.getInstance().getTime();        
          dotbn = df.format(today);
          fileno=0;
         
          return "capnhatxacminhmobile";
          
     
    
}
 
    public String xacnhanxacminhgd() throws SQLException{
        kieuhoiListPK=new KieuhoiListPK();
        kieuhoiListPK.setIdChinhanh(tranSacWeb.getIdChinhanh());
        kieuhoiListPK.setSophieu(tranSacWeb.getSophieu());
        kieuhoiListPK.setStt(tranSacWeb.getStt());
        String userid= SessionBean.getUserId();
        boolean kq =capnhatxacminh(kieuhoiListPK, userid);
        return "gdhschinhanhanvientrongngay" + "?faces-redirect=true";
    }
    
    
     public boolean capnhatxacminh(KieuhoiListPK  kieuhoiListIdcode,String userid) throws SQLException{
         
        // kieuhoiListPK= new KieuhoiListPK();
         //kieuhoiListPK.setIdChinhanh(tranSacWeb.getIdChinhanh());
       //  kieuhoiListPK.setSophieu(tranSacWeb.getSophieu());
        // kieuhoiListPK.setStt(tranSacWeb.getStt());
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEKH);
        EntityManager entitymanager = emfactory.createEntityManager();
        //KhachhangttList khachhangttList = new KhachhangttList();
        //Lấy khóa của bảng IMAGE_CAPTCHA - Đây là hành động bắt buộc khi cập nhật bảng trên JPA
        try {
            /* Update entity */
                kieuhoiList = entitymanager.find(KieuhoiList.class, kieuhoiListIdcode);
		entitymanager.getTransaction().begin();
                kieuhoiList.setXacminh("Y");
                kieuhoiList.setGhichu(tranSacWeb.getGhichu());
                kieuhoiList.setNgayXacminh(new java.sql.Date(System.currentTimeMillis()));
                kieuhoiList.setIdNvXacminh(userid);
                kieuhoiList.setBiennhan("N");
                kieuhoiList.setMgCode("MG");
                
		entitymanager.getTransaction().commit();
               // entitymanager.close();
  
                return true;
                //return "gdhschinhanhanvientrongngay" + "?faces-redirect=true";
         } catch (Exception e) {
                return  false;
                        
       }
      
     
        
        
    } 
    
    
     public void capnhatgiaodichdahoibao(){
         
        // Lay user , chinhanh hien hanh .
         String userid=SessionBean.getUserId();
         String chinhanh=SessionBean.getChinhanhId();
         
        // Cap nhat bang kieu hoi .
         try {
         kieuhoiListPK=new KieuhoiListPK();
         kieuhoiListPK.setIdChinhanh(tranSacWeb.getIdChinhanh());
         kieuhoiListPK.setSophieu(tranSacWeb.getSophieu());
         kieuhoiListPK.setStt(tranSacWeb.getStt());
         boolean kq=false;
         if(tranSacWeb.getSoCtTuythan()!=null){
                kq = this.capnhatdahoibaokieuhoi(kieuhoiListPK, userid);
         }
         else{
             
               FacesMessage message = new FacesMessage("Số giấy tờ trống không thể xác nhận !!!" ,"" );
               FacesContext.getCurrentInstance().addMessage(null, message);
             
         }
      
           
         if (kq==true){
             
             boolean kq1=capnhatdahoibaotransaction(tranSacWeb.getIdCode());
             
         }
         
         this.showallgiaodich();

         } catch (Exception e) {
         }

         
         
     }
    
    
    
  private boolean capnhatdahoibaokieuhoi(KieuhoiListPK  kieuhoiListIdcode,String userid) throws SQLException{
         
        // kieuhoiListPK= new KieuhoiListPK();
         //kieuhoiListPK.setIdChinhanh(tranSacWeb.getIdChinhanh());
       //  kieuhoiListPK.setSophieu(tranSacWeb.getSophieu());
        // kieuhoiListPK.setStt(tranSacWeb.getStt());
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEKH);
        EntityManager entitymanager = emfactory.createEntityManager();
        //KhachhangttList khachhangttList = new KhachhangttList();
        //Lấy khóa của bảng IMAGE_CAPTCHA - Đây là hành động bắt buộc khi cập nhật bảng trên JPA
        try {
            /* Update entity */
                kieuhoiList = entitymanager.find(KieuhoiList.class, kieuhoiListIdcode);
		entitymanager.getTransaction().begin();
                kieuhoiList.setDahoibao('Y');
                kieuhoiList.setIdNvHoibao(userid);
                kieuhoiList.setSoCtTuythan(this.tranSacWeb.getSoCtTuythan());
                kieuhoiList.setIdMobiHb("Y");
                kieuhoiList.setNgayMobiHb(new java.sql.Date(System.currentTimeMillis()));
                kieuhoiList.setNgayChitraTrue(new java.sql.Date(System.currentTimeMillis()));
		entitymanager.getTransaction().commit();
               // entitymanager.close();
  
                return true;
                //return "gdhschinhanhanvientrongngay" + "?faces-redirect=true";
         } catch (Exception e) {
                return  false;
                        
       }
      
     
        
        
    }   
      
    private boolean capnhatdahoibaotransaction(String trancIdcode){
        
        String userid=SessionBean.getUserId();
        TransactionList tranSac= new TransactionList();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
        EntityManager entitymanager = emfactory.createEntityManager();
         try {
            /* Update entity */
  
                tranSac = entitymanager.find(TransactionList.class,trancIdcode);
		entitymanager.getTransaction().begin();
                tranSac.setDahoibao("Y");
                tranSac.setDachitra("Y");
                tranSac.setSoCtTuythan(this.tranSacWeb.getSoCtTuythan());
                tranSac.setIdDataHoiso("Y");
                tranSac.setDateDataHoiso(new java.sql.Date(System.currentTimeMillis()));
		entitymanager.getTransaction().commit();
               // entitymanager.close();
                return true;
                //return "gdhschinhanhanvientrongngay" + "?faces-redirect=true";
         } catch (Exception e) {
              return false ;
       }
        
    }  
    
    /* 
    ======================================================================
     Upload Image .
     Upload Image vào hệ thống  . 
    */
    
      public String chuyentrangdshshoibaonvchinhact(VwDsUploadImagehbWeb uploadImagehbWeb){
        //dsgiayto=FunctionLocal.laydsgiayto();
          vwDsUploadImagehbWeb=new VwDsUploadImagehbWeb();
          vwDsUploadImagehbWeb=uploadImagehbWeb;
        return "dshshoibaonvchinhact" + "?faces-redirect=true";
      
    }  
   
 
      

 public  void showfiletemp()
 {
         //Lay thong tin ve file . 
         String userid=SessionBean.getUserId();
         DateFormat df = new SimpleDateFormat("MMddyyyy");
         Date today = Calendar.getInstance().getTime();        
         String reportDate = df.format(today);
         String duongdanimage=Xulyimage.layduongdanimage("win");
         String daungancach=Xulyimage.laydauNgancach("win");
         String pathimage=duongdanimage+"imagetemp"+daungancach+reportDate+daungancach+userid;
         
         dsTranSac= new ArrayList<>();
         File file = new File(pathimage);      
         String[] myFiles;    
         if(file.isDirectory()){
           myFiles = file.list();
           for (int i=0; i<myFiles.length; i++) {
               Dsfileimagetoday d= new Dsfileimagetoday();
               File myFile = new File(file, myFiles[i]); 
               String name=myFile.getName();
               String khoaname=name.substring(0, name.length()-4);
               Apidmquanlyimagetoday a=new Apidmquanlyimagetoday();
               ApiTongdongallnv apiTongdongallnv=new ApiTongdongallnv();
               if(!khoaname.contains("ER"))
               {
               // Lay thong tin . 
               DmQuanlyimageToday dmQuanlyimageToday = new DmQuanlyimageToday();
               VwTondongNvAllWeb tondongNvAllWeb = new VwTondongNvAllWeb();
               dmQuanlyimageToday=a.find(DmQuanlyimageToday.class , khoaname);
               tondongNvAllWeb=apiTongdongallnv.find(VwTondongNvAllWeb.class, khoaname);
               if(tondongNvAllWeb != null)
               {   // Ho so da ton tai .
                   
                   if(dmQuanlyimageToday!=null)
                   {
                       d.setKhoa(khoaname);
                       d.setPathfile(pathimage+daungancach+myFile.getName());
                       d.setSoCtTuythan(dmQuanlyimageToday.getSoCtTuythan());
                       d.setIdCtTuythan(dmQuanlyimageToday.getIdCtTuythan());
                       d.setSobn(dmQuanlyimageToday.getSobn());
                       d.setGhichu("Đọc được mã vạch-Hồ sơ đã có trong hệ thống");
                       d.setTrangthai(dmQuanlyimageToday.getTrangthai() );
                       d.setMaNguoinhan(dmQuanlyimageToday.getMaNguoinhan());
                       d.setHoten(tondongNvAllWeb.getHoten());
                       d.setIderror("N");
                   }
                   else
                   {
                           // Ho so chua ton tai da ton tai .
                          // Ho so da ton tai .
                       apiTongdongallnv=apiTongdongallnv.find(ApiTongdongallnv.class, khoaname);
                       d.setKhoa(khoaname);
                       d.setPathfile(pathimage+daungancach+myFile.getName());
                       d.setSoCtTuythan(dmQuanlyimageToday.getSoCtTuythan());
                       d.setIdCtTuythan(dmQuanlyimageToday.getIdCtTuythan());
                       d.setSobn(dmQuanlyimageToday.getSobn());
                       d.setGhichu("Đọc được mã vạch-Hồ sơ mới ");
                       d.setTrangthai(dmQuanlyimageToday.getTrangthai() );
                       d.setMaNguoinhan(dmQuanlyimageToday.getMaNguoinhan());
                       d.setHoten(tondongNvAllWeb.getHoten()); 
                        d.setIderror("N");
                   }
                    dsTranSac.add(d);
               }
               else{
                   
                       d.setKhoa(khoaname);
                       d.setPathfile(pathimage+daungancach+myFile.getName());
                       d.setGhichu("Nhân viên không giữ hồ sơ này");
                       d.setIderror("T");
 
               }

               }
               else{
               d.setKhoa(khoaname);
               d.setPathfile(pathimage+daungancach+myFile.getName());
               d.setIderror("Y");
               d.setGhichu("Hồ sơ không đọc được mã vạch");
                   
               }
           }
        }
     
 }
 
  public void handlefilechuphinhupload(FileUploadEvent event) throws IOException, NotFoundException, ChecksumException, FormatException, ClassNotFoundException, SQLException    {
  
      //   Lấy thông tin file .
        
        FunctionLocal fn=new FunctionLocal();
        ImageUploadToday imageUploadToday=new ImageUploadToday();
        String userid=SessionBean.getUserId();
        String chinhanhid=SessionBean.getChinhanhId();
        String hethong=SessionBean.getSystemMobile();

        UploadedFile filein=event.getFile();    
        String str = filein.getFileName();
        String ext = str.substring(str.lastIndexOf('.'), str.length());
   
        long filesize=filein.getSize();
        BufferedImage imagedrop = null ;
        Float chiso=0.5f;
        String filepath = null;
        String duongdangoc = null;
        String daucach = null;
        String maso = null;
      //  debugstring="712";
           // Xu ly file .
        BufferedImage originalImage    = ImageIO.read(filein.getInputstream());
        imagedrop=FunctionLocal.resizeImage(originalImage, originalImage.getType(), 500, 1250);
         // Tao thu muc  .
       // debugstring="712";
        duongdangoc=Hamimage.layduongdanimage(hethong);
      //  debugstring="712";
        daucach =Hamimage.laydauNgancach(hethong);
        // Lay ma vach.
        maso=HamUserAll.scanBarcode(filein.getInputstream(),ext);
    
      //  debugstring="717"+duongdangoc+daucach;
  
        if(maso!="reader error")
        {
             // Duong dan lay file
             filepath=duongdangoc+"imagetemp"+daucach+maso+ext;
             String kq;
            // Xuat file theo duong dan  .
             File f = new File(filepath); 
             if((f.exists() && !f.isDirectory())) { 
              //Neu chua ton tai thi tao .
                   f.delete();
                   kq=Hamimage.comperssionfileimage(imagedrop, filepath,chiso );
             }
              else{
                   kq=Hamimage.comperssionfileimage(imagedrop, filepath,chiso );
             }
            // Lay du lieu model file upload . 
              imageUploadToday.setKhoa(maso);
              imageUploadToday.setHinhbn(filepath);
              imageUploadToday.setIdchinhanh(chinhanhid);
              imageUploadToday.setUserid(userid);
              imageUploadToday.setIderror("N");
              imageUploadToday.setDotbn(dotbn);
 
        }
        else{
           // Duong dan lay file
             filepath=duongdangoc+"imagetemp"+daucach+"ER"+str ;
             
              String kq=null;
            // Xuat file theo duong dan  .
             File f = new File(filepath); 
             if(f.exists() && !f.isDirectory()) 
             {      
                f.delete();
                   kq=Hamimage.comperssionfileimage(imagedrop, filepath,chiso );
             }
             else{
                   kq=Hamimage.comperssionfileimage(imagedrop, filepath,chiso );
             }
             debugstring=filepath+kq;
             if(kq.equalsIgnoreCase("T"))
             {   
              imageUploadToday.setKhoa("ER"+str);
              imageUploadToday.setHinhbn(filepath);
              imageUploadToday.setIdchinhanh(chinhanhid);
              imageUploadToday.setUserid(userid);
              imageUploadToday.setIderror("Y");
              imageUploadToday.setDotbn(dotbn); 
             }
          
             
           
        }
          // debugstring="766"+filepath;
           String kqupload= uploadimagetoday(filepath,imageUploadToday);
           //debugstring="771"+kqupload;
        if (kqupload.equalsIgnoreCase("T"))
            {
             if(imageUploadToday.getIderror().equalsIgnoreCase("N"))
             {
              FacesMessage message = new FacesMessage(filepath+ "Có mã vạch ,cập nhật thành công");
              FacesContext.getCurrentInstance().addMessage(null, message);
             }
             else{
                FacesMessage message = new FacesMessage(maso+ "Không đọc được mã vạch,cập nhật thành công");
                FacesContext.getCurrentInstance().addMessage(null, message);
                 
             }
             }
            else{
                
               FacesMessage message = new FacesMessage(maso+ "cập nhật thất bại"+kqupload);
               FacesContext.getCurrentInstance().addMessage(null, message); 
                
            }
 
    }  
 
 public void handlefilload2018(FileUploadEvent event) throws IOException, NotFoundException, ChecksumException, FormatException, ClassNotFoundException, SQLException    {
  
      //   Lấy thông tin file .
        
        FunctionLocal fn=new FunctionLocal();
        ImageUploadToday imageUploadToday=new ImageUploadToday();
        String userid=SessionBean.getUserId();
        String chinhanhid=SessionBean.getChinhanhId();
        String hethong=SessionBean.getSystemMobile();

        UploadedFile filein=event.getFile();    
        String str = filein.getFileName();
        String ext = str.substring(str.lastIndexOf('.'), str.length());
   
        long filesize=filein.getSize();
        BufferedImage imagedrop = null ;
        Float chiso=0.5f;
        String filepath = null;
        String duongdangoc = null;
        String daucach = null;
        String maso = null;
      //  debugstring="712";
           // Xu ly file .
        BufferedImage originalImage    = ImageIO.read(filein.getInputstream());
        imagedrop=FunctionLocal.resizeImage(originalImage, originalImage.getType(), 500, 1250);
         // Tao thu muc  .
       // debugstring="712";
        duongdangoc=Hamimage.layduongdanimage(hethong);
      //  debugstring="712";
        daucach =Hamimage.laydauNgancach(hethong);
        // Lay ma vach.
        maso=HamUserAll.scanBarcode(filein.getInputstream(),ext);
    
       String iderror="N";
       String khoa=null;
  
        if(maso!="reader error")
        {    
            
              filepath=duongdangoc+"imagetemp"+daucach+maso+ext;
              khoa="ER"+str;
              
        }

        else{
          
              filepath=duongdangoc+"imagetemp"+daucach+"ER"+str ;
              iderror="Y";
              khoa=maso;
 
        }
        
                    // Lay du lieu model file upload . 
              imageUploadToday.setKhoa(khoa);
              imageUploadToday.setHinhbn(filepath);
              imageUploadToday.setIdchinhanh(chinhanhid);
              imageUploadToday.setUserid(userid);
              imageUploadToday.setIderror(iderror);
              imageUploadToday.setDotbn(dotbn);
        
          // debugstring="766"+filepath;
           String kqupload= uploadimagetoday(filepath,imageUploadToday);
           //debugstring="771"+kqupload;
        if (kqupload.equalsIgnoreCase("T"))
            {
             if(imageUploadToday.getIderror().equalsIgnoreCase("N"))
             {
              FacesMessage message = new FacesMessage(filepath+ "Có mã vạch ,cập nhật thành công");
              FacesContext.getCurrentInstance().addMessage(null, message);
             }
             else{
                FacesMessage message = new FacesMessage(maso+ "Không đọc được mã vạch,cập nhật thành công");
                FacesContext.getCurrentInstance().addMessage(null, message);
                 
             }
             }
            else{
                
               FacesMessage message = new FacesMessage(maso+ "cập nhật thất bại"+kqupload);
               FacesContext.getCurrentInstance().addMessage(null, message); 
                
            }
 
    }  
      
         
   public String handleFileUpload(FileUploadEvent event) throws IOException, ClassNotFoundException, SQLException, NotFoundException, ChecksumException, FormatException {
        
        String chinhanh=SessionBean.getChinhanhId();
        UploadedFile filein=event.getFile();  
        String str = filein.getFileName();
        String ext = str.substring(str.lastIndexOf('.'), str.length());
        /* Neu file tiff phai convert */
        String maso=HamUserAll.scanBarcode(filein.getInputstream(),ext);
        ImageUploadModel imageUploadModel= new ImageUploadModel();
        if (maso !=null && !maso.equalsIgnoreCase("reader error") )
        {           
            // Lay thong tin bien nhan .
            VwDsUploadImagehbWeb imagehbWeb= HamUserAll.getchitietgdformnvandsobn2018(maso,"B");
 
            // Tim thong tin  tu ma so tra ve . 
            
             boolean kq= uploadmutilimage(filein,maso,"N",dotbn,ext,imagehbWeb);
          
            if (kq)
            {
          
         
            FacesMessage message = new FacesMessage(maso+ "cập nhật thành công");
            FacesContext.getCurrentInstance().addMessage(null, message);
            }
            else{
                
               FacesMessage message = new FacesMessage(maso+ "cập nhật thất bại");
               FacesContext.getCurrentInstance().addMessage(null, message); 
                
            }
            

        }
        else{

            boolean kq=  uploadmutilimage(filein,"ER"+dotbn+str,"Y",dotbn,ext,null);
            FacesMessage message = new FacesMessage(maso+ "không có mã vạch hoặc không đọc được dữ liệu");
            FacesContext.getCurrentInstance().addMessage(null, message);
            
        }

        return "dshshoibaonvchinha" + "?faces-redirect=true";
      
      
    }  
    
    
       public String handleFileXacminh(FileUploadEvent event) throws IOException, ClassNotFoundException, SQLException, NotFoundException, ChecksumException, FormatException {
        
        String userid=SessionBean.getUserId();
        UploadedFile filein=event.getFile();    
        String str = filein.getFileName();
        String ext = str.substring(str.lastIndexOf('.'), str.length());
        long filesize=filein.getSize();
        /* Neu file tiff phai convert */

        String maso=HamUserAll.scanBarcode(filein.getInputstream(),ext);
        ImageUploadModel imageUploadModel= new ImageUploadModel();
        if (maso !=null && !maso.equalsIgnoreCase("reader error") )
        {
            
            //  imageUploadModel.setKhoa(maso);
            //  imageUploadModel.setHinh(filein.getInputstream());
            // imageUploadList.add(imageUploadModel);
            // Tim thong tin  tu ma so tra ve . 
             boolean kq= uploadmutilimage(filein,maso,"N",dotbn,ext,null);
          
           // imageUploadList.add(imageUploadModel);
            if (kq)
            {
                
            BufferedImage origina = ImageIO.read(filein.getInputstream());  
          //  HamUserAll hamUserAll= new HamUserAll();
        //    Boolean kq1 = hamUserAll.storeImageServer(origina, maso,1);      
           // imageUploadModel
            FacesMessage message = new FacesMessage(maso+ "cập nhật thành công");
            FacesContext.getCurrentInstance().addMessage(null, message);
            }
            else{
                
               FacesMessage message = new FacesMessage(maso+ "cập nhật thất bại");
               FacesContext.getCurrentInstance().addMessage(null, message); 
                
            }
            

        }
        else{
            
            //imageUploadModel.setKhoa("error"+imageUploadList.size()+1);
            //imageUploadList.add(imageUploadModel);
            // Tao hinh tren Server . 
            
          //  BufferedImage origina = ImageIO.read(filein.getInputstream());  
         //   HamUserAll hamUserAll= new HamUserAll();
        //    Boolean kq1 = hamUserAll.storeImageServer(origina, userid+str,2);  
            
            boolean kq=  uploadmutilimage(filein,"ER"+dotbn+str,"Y",dotbn,ext,null);
            FacesMessage message = new FacesMessage(maso+ "không có mã vạch hoặc không đọc được dữ liệu");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
        

        return "dshshoibaonvchinha" + "?faces-redirect=true";
      
      
    }    
    
    
     public boolean uploadmutilimage( UploadedFile filein,String maso,String iderror,String dotbnhan,String duoifile,VwDsUploadImagehbWeb imagehbWeb) throws IOException, ClassNotFoundException, SQLException   {
 
       
            InputStream inputStream= filein.getInputstream() ;
       
              // Tao hinh tren Server . 
                
                
           // String maso=FunctionLocal.scanBarcode(filein.getInputstream());
            String chinhanh=SessionBean.getChinhanhId();
                     
            String userid=SessionBean.getUserId();
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            con.setAutoCommit(true);
            
            try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO KHOUT.DM_QUANLYIMAGE_TODAY(KHOA,DOTBN,FILENO,MARKER_ID,ID_DOITAC,ID_CHINHANH,SOPHIEU,STT,SOBN,IDERROR,DATE_MODIFIED,HINH_BN,SO_CT_TUYTHAN,ID_CT_TUYTHAN,ID_NV_CHITRA,FILEPATH) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            String khoa=null;
           if (iderror.equalsIgnoreCase("N")){
 
            if(imagehbWeb.getIdChinhanh() !=null){
                
                // Insert Image tren 17 
                
                
                khoa=imagehbWeb.getIdChinhanh().toString()+maso;
                ps.setString(5,imagehbWeb.getIdDoitac()); 
                ps.setString(6,imagehbWeb.getIdChinhanh()); 
                ps.setString(7,imagehbWeb.getSophieu());
                ps.setInt(8,imagehbWeb.getStt().intValue());
                ps.setString(9, imagehbWeb.getSobn().toString()); 
                ps.setString(10, iderror); 
               
                
                 // Tao hinh tren Server . 
                //HamUserAll hamUserAll= new HamUserAll();
                //Boolean kq = hamUserAll.storeImageServer(inputStream, khoa);

                ps.setString(1,khoa);
                ps.setBinaryStream(12, inputStream,300000);
                ps.setString(2,userid+dotbnhan);
                ps.setInt(3,fileno+1);
                ps.setString(4,userid);    
                Date d= new  Date();
                ps.setDate(11, new java.sql.Date(d.getTime())); 
                ps.setString(13,imagehbWeb.getSoCtTuythan());
                ps.setString(14,imagehbWeb.getIdCtTuythan());
                ps.setString(15,imagehbWeb.getIdNvChitra());
                ps.setString(16, imagehbWeb.getSobn().toString());
                ps.executeUpdate();
                ps.close();
               // con.commit();
              //  con.close();
               
                
                
            /*     ApiFun apiFun= new ApiFun();
                 Boolean kq=apiFun.uploadimage(imagehbWeb.getSobn().toString(), inputStream);
                 if (kq !=true)
                 {
                     VwDmQuanlydotimagectietWeb vdqw= new VwDmQuanlydotimagectietWeb();
                     vdqw.setKhoa(khoa );
                     vdqw.setSobn(imagehbWeb.getSobn());
                     this.reuploadImagetoServer(vdqw);
                 }
              */
                 return true;
            }
          else{
               
               FacesMessage message = new FacesMessage("Khong ton tai ho so nay !!");
               FacesContext.getCurrentInstance().addMessage(null, message);
               return false;
                
            } 
            
           }
           //Error . 
           else{
               
                khoa= maso;
                ps.setString(5,""); 
                ps.setString(6,""); 
                ps.setString(7,"");
                ps.setInt(8,0);
                ps.setString(9,""); 
                ps.setString(10, "Y"); 
                Date d= new  Date();
                ps.setDate(11, new java.sql.Date(d.getTime())); 
                ps.setString(1,maso);
                ps.setBinaryStream(12, inputStream,200000);
                ps.setString(13,"");
                ps.setString(14,"");
                ps.setString(15,"");
                ps.setString(2,"ER"+userid+dotbnhan);
                ps.setInt(3,1);
                ps.setString(4,userid);    
               ps.setString(16, "");
                ps.executeUpdate();
                ps.close();
            //    con.commit();
 
          
            }

             return true;
             
         } catch (Exception e) {
             

             FacesMessage message = new FacesMessage(e.getMessage());
             FacesContext.getCurrentInstance().addMessage(null, message);
             
             return false;
         }

 
 
    }
    
    
     public String uploadimage() throws IOException, ClassNotFoundException, SQLException, NotFoundException, ChecksumException, FormatException   {
         
          //  String str = filein.getFileName();
          //  String ext = str.substring(str.lastIndexOf('.'), str.length());
            InputStream inputStream=FunctionLocal.convertFiletoInputstream(file.getInputstream(),"");
            String maso=HamUserAll.scanBarcode(file.getInputstream(),"");
            String chinhanh=SessionBean.getChinhanhId();
            String userid=SessionBean.getUserId();
            Connection con = ConnectionProvider.getCon();
            con.setAutoCommit(false);
             
            PreparedStatement ps = con.prepareStatement("INSERT INTO kh.DM_QUANLY_IMAGE(KHOA,HINH_BN,DOTBN,FILENO,MARKER_ID,id_doitac,ID_CHINHANH,SOBN) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, vwDsUploadImagehbWeb.getIdCode());
            ps.setBinaryStream(2, inputStream, (int) file.getSize());
            ps.setString(3,vwDsUploadImagehbWeb.getIdNvChitra()+vwDsUploadImagehbWeb.getSobn());
            ps.setInt(4,1);
            ps.setString(5,userid); 
            ps.setString(6,vwDsUploadImagehbWeb.getIdDoitac()); 
            ps.setString(7,chinhanh); 
            ps.setString(8, maso); 
 
            ps.executeUpdate();
            ps.close();
            con.commit();
           // con.close();
          //  out.println("Photo Added Successfully. <p> <a href='listphotos'>List Photos </a>");
            return "dshshoibaonvchinha" + "?faces-redirect=true";
 
 
    }
     
      public static List<VwDmQuanlydotImagetongWeb> dstheonhanvienmobile2018(String user,String trangthai) {
        
        try {
            
            List<VwDmQuanlydotImagetongWeb> dsKq=new ArrayList<>();
       
            ConnectionProvider.reconnectdbastatic();
            Connection con=ConnectionProvider.getCon();
            
            // Tạo một câu SQL có 1 tham số (?)
            String  sql = "select * from KHOUT.VW_DM_QUANLYDOT_IMAGETONG_WEB WHERE MARKER_ID=? AND KIEMTRA=?";
            
            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);
            
            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            pstm.setString(1, user);
            pstm.setString(2, trangthai);
            
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) { 
              VwDmQuanlydotImagetongWeb dataClass = new VwDmQuanlydotImagetongWeb();
              dataClass.setIdcode(rs.getString("IDCODE"));
              dataClass.setMarkerId(rs.getString("MARKER_ID"));
              dataClass.setIderror(rs.getString("IDERROR"));
              dataClass.setDotbn(rs.getString("DOTBN"));
              dataClass.setDateModified(rs.getDate("DATE_MODIFIED"));
              dataClass.setShs(rs.getBigDecimal("SHS"));
              dataClass.setKiemtra(rs.getString("KIEMTRA"));
              dataClass.setDeserror(rs.getString("DESERROR"));
              dsKq.add(dataClass);
            }
            pstm.close();
            return dsKq;
            
        } catch (SQLException ex) {

             Logger.getLogger(HamUserAll.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
         
 
    }
     
    
  public VwDsUploadImagehbWeb getchitietgdformnvandsobn(Number maso,String nv){
    /*  VwDsUploadImagehbWeb giaodich=new VwDsUploadImagehbWeb();
      //String chinhanh=maso.substring(0, 3);//SessionBean.getChinhanhId();
     // String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
          try {
              
              //Tao Query .
           Query query = null;
 
           query=entitymanager.createQuery("SELECT v FROM  VwDsUploadImagehbWeb v WHERE v.sobn = :maso  ");         
         
           query.setParameter("maso",   maso.longValue() );  
     
           giaodich=(VwDsUploadImagehbWeb) query.getSingleResult();              
          } catch (Exception e) {
              String kq=null;
          }
      
      
      return giaodich;
      */
    return null;
 
      }
    
     
     
     
    
     // Hiện thông tin các giao dịch cần theo điều kiện. 
     public void showdsgiaodichhb(){
        
      String chinhanh=SessionBean.getChinhanhId();
      String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      this.loaitkdulieu="00001";
      switch(this.loaitkdulieu)
      {
          case "00001":
      {
           query=entitymanager.createQuery("SELECT v FROM  VwDsUploadImagehbWeb v ");
         //  query.setParameter("nvchitra", userid);     
         //  query.setParameter("chinhanh", chinhanh);  
           break;
      }
         case "00002":
      {
           query=entitymanager.createQuery("SELECT v FROM  VwDsUploadImagehbWeb v WHERE v.idChinhanh=:chinhanh AND v.idNvChitrad=:nvchitra");
           query.setParameter("nvchitra", userid);     
           query.setParameter("chinhanh", chinhanh);    
           break;
      } 
      }
      
    
      dsUploadImagehbWebs=query.getResultList(); 
      entitymanager.close();
      
    }
     
     
    private  String uploadImagebiennhan(VwDsUploadImagehbWeb gdDao ,InputStream is )  {
        Connection con = ConnectionProvider.getCon();
        try {
            
            String sql = "INSERT INTO KH.IMAGE_XNDOITAC( KHOA, MA_NGUOINHAN,HINH_BN ) VALUES ( ?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            
            pre.setString(1, gdDao.getIdCode());
            pre.setBlob(3, is);
            pre.setString(2,gdDao.getMaNguoinhan());
          
            pre.executeUpdate();
            //  System.out.println("Inserting Successfully!");
            pre.close();
 
   //  FUNCTION  INS_QUANLY_IMAGE_WEB (KHOA_IM varchar2,iimage varchar2,userid varchar2,dct_dc varchar2,ngaybn_dc date,bn_dc varchar2,maso varchar2,hinh_up BLOB) RETURN VARCHAR2 ;

         /*   String ketqua;
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? :=KH.PKS_INSERT.INS_QUANLY_IMAGE_WEB(?,?,?,?,?,?,?,?)}";
            //PreparedStatement stm = con.prepareStatement(fnCall);
          //   pre = con.prepareStatement(sql);
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(9, Types.BLOB);
            stm.setString(2, gdDao.getIdCode());
            stm.setString(3, "");
            stm.setBlob(4, is);
            stm.setString(5, "");
            stm.setDate(6, null);
            stm.setDate(7, null);
            stm.setString(8, gdDao.getMaNguoinhan());
            stm.setBlob(9, is,100);
            stm.execute();
           // ketqua = (String) stm.get;
            stm.close();*/
            return "T";//ketqua;

        } catch (SQLException ex) {

          //  Bean.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return "";

        }

    }

      
    /*
    ---------------------------------------------------------------------
    */
      public  String  capnhathsmobile() throws SQLException{
              kieuhoiListPK= new KieuhoiListPK();
         
              this.capnhatgiaodichdahoibao();
              
          return "gdhschinhanhanvientrongngay" + "?faces-redirect=true";
 
    }   
      
     public String chuyentrangxacminh(){
        dsgiayto=FunctionLocal.laydsgiayto();
        return "capnhatxacminhmobile" + "?faces-redirect=true";
      
    }  
    
     public String chuyentranghsmobile(){
        dsgiayto=FunctionLocal.laydsgiayto();
        return "capnhathsmobile" + "?faces-redirect=true";
      
    }
   
    public void showallgiaodich(){
        
      dsTranSacWeb.clear();
      String chinhanh=SessionBean.getChinhanhId();
      String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createNamedQuery("VwTransactionListWeb.findByNhanvinvaTrangthai");
      query.setParameter("idNvChitra", userid);      
      dsTranSacWeb=query.getResultList(); 
      entitymanager.close();
      
    }
    
      public String chuyentranggdchuagoikhach(){
          
          
            return "dsdagiaophieuchuagoikhach" + "?faces-redirect=true";
          
      }
    
    
    
    
    public String chuyentranghosochinhatrongngay(){
           this.postalltransac();
           this.showallgiaodich();
           return "gdhschinhanhanvientrongngay" + "?faces-redirect=true";
        
    }
    
   public String chuyentrangdshshoibaonvchinha(){
           //this.postalltransac();
        //   this.showallgiaodich();
           return "dshshoibaonvchinha" + "?faces-redirect=true";
        
    }
   
      public String chuyentrangxacnhanhoibao(){
          //this.postalltransac();
          // this.showallgiaodich();
           return "dshshhoibaoxacnhanhoibao" + "?faces-redirect=true";
        
    }
    
    
   public void postalltransac(){

           // Tao Entity .
      String userid=SessionBean.getUserId();
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      Query query = null;
      query=entitymanager.createNamedQuery("VwGiaodichMobileImportWeb.findByIdNvChitra");
      query.setParameter("idNvChitra", userid); 
      List<VwGiaodichMobileImportWeb> dshosochoimp=query.getResultList(); 
     // entitymanager.close();
      
    
      for (int i = 0; i < dshosochoimp.size(); i++) {
          VwGiaodichMobileImportWeb giaodichMobileImportWeb=new VwGiaodichMobileImportWeb();
          TransactionList transactionList=new TransactionList();  
          giaodichMobileImportWeb=dshosochoimp.get(i); 
          transactionList.setIdCode(giaodichMobileImportWeb.getIdCode());
          transactionList.setIdDotData(giaodichMobileImportWeb.getIdDotData());           
          transactionList.setSobn(giaodichMobileImportWeb.getSobn().toString());
          transactionList.setHoten(giaodichMobileImportWeb.getHoten());
          transactionList.setMaNguoinhan(giaodichMobileImportWeb.getMaNguoinhan());
          transactionList.setNguoigoi(giaodichMobileImportWeb.getNguoigoi());
          transactionList.setIdLoaitienchitra(giaodichMobileImportWeb.getIdLoaitienchitra());
          transactionList.setIdLoaitiengoi(giaodichMobileImportWeb.getIdLoaitienchitra());
          transactionList.setIdNvChitra(giaodichMobileImportWeb.getIdNvChitra());
          transactionList.setIdChinhanh(giaodichMobileImportWeb.getIdChinhanh());
          transactionList.setSotiengoi(giaodichMobileImportWeb.getSotiengoi());
          BigDecimal tygia=giaodichMobileImportWeb.getTygia() ;
          if (tygia!=null){
              transactionList.setTygia(giaodichMobileImportWeb.getTygia().longValue());
              transactionList.setThanhtien(giaodichMobileImportWeb.getThanhtien().longValue());
          }  
          transactionList.setDachitra(giaodichMobileImportWeb.getDachitra().toString());
          transactionList.setDahoibao("N");
          transactionList.setXacminh("N");
          transactionList.setIdDataHoiso("N");
          transactionList.setGhichuGoi(giaodichMobileImportWeb.getGhichuGoi());
          transactionList.setDienthoai(giaodichMobileImportWeb.getDienthoai());
          transactionList.setDiachi(giaodichMobileImportWeb.getDiachi());
          transactionList.setSophieu(giaodichMobileImportWeb.getSophieu());
          transactionList.setStt(giaodichMobileImportWeb.getStt());
         // Insert du lieu
          //boolean kq =inserttunggiaodich(transactionList);
          entitymanager.getTransaction().begin();
          entitymanager.persist(transactionList);
          entitymanager.getTransaction().commit();
      }
      
     
      entitymanager.close();
      // Insert vao he transacionlist .
       
      
      
   }
   
   public  boolean inserttunggiaodich(TransactionList transactionList){
       
           // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
        // Cap nhat.
 
               entitymanager.getTransaction().begin();      
               entitymanager.persist(transactionList);
               entitymanager.getTransaction().commit();
               entitymanager.close();
                return true;
 
   }
   
      
     public String uploadimagetoday( String filepath,ImageUploadToday   uploadToday ) throws IOException, ClassNotFoundException, SQLException   {
 
           // Lay thong tin tu file path  . 
           
            VwDsUploadImagehbWeb imagehbWeb=new VwDsUploadImagehbWeb();
            ImageUploadModel imageUploadModel= new ImageUploadModel();   
            String ghichu =null;
            // Lay hinh tu server hinh tren Server . 
            InputStream is = null;
            //debugstring="dong 1370"+filepath;
            File file=new File(filepath);
            if(file.exists())
            {    
                BufferedImage image = ImageIO.read(file);
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(image, "jpg", os);
                is = new ByteArrayInputStream(os.toByteArray());
            }
            
            Connection con = ConnectionProvider.getCon();
            if(con==null)
            {
              ConnectionProvider.reconnectdbastatic();
              con = ConnectionProvider.getCon();
              //con.setAutoCommit(false);
            }
            PreparedStatement ps = con.prepareStatement("INSERT INTO KHOUT.DM_QUANLYIMAGE_TODAY(KHOA,DOTBN,FILENO,MARKER_ID,ID_DOITAC,ID_CHINHANH,SOPHIEU,STT,SOBN,IDERROR,DATE_MODIFIED,HINH_BN,SO_CT_TUYTHAN,ID_CT_TUYTHAN,ID_NV_CHITRA,FILEPATH) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
 
            String khoa=null;
           if (uploadToday.getIderror().equalsIgnoreCase("N")){
            
           //  imagehbWeb= HamUserAll.dshoibaochitiet2018(uploadToday.getKhoa());
            
            if(imagehbWeb.getIdChinhanh() !=null){
               try {
                   
                khoa=imagehbWeb.getIdChinhanh().toString()+uploadToday.getKhoa();
                ps.setString(5,imagehbWeb.getIdDoitac()); 
                ps.setString(6,imagehbWeb.getIdChinhanh()); 
                ps.setString(7,imagehbWeb.getSophieu());
                ps.setInt(8,imagehbWeb.getStt().intValue());
                ps.setString(9, imagehbWeb.getSobn().toString()); 
                ps.setString(10, uploadToday.getIderror()); 
                
                 // Tao hinh tren Server . 
                //HamUserAll hamUserAll= new HamUserAll();
                //Boolean kq = hamUserAll.storeImageServer(inputStream, khoa);

                ps.setString(1,khoa);
                ps.setBinaryStream(12, is,100000);
                ps.setString(2,uploadToday.getUserid()+uploadToday.getDotbn());
                ps.setInt(3,1);
                ps.setString(4,uploadToday.getUserid());    
                Date d= new  Date();
                ps.setDate(11, new java.sql.Date(d.getTime())); 
                ps.setString(13,imagehbWeb.getSoCtTuythan());
                ps.setString(14,imagehbWeb.getIdCtTuythan());
                ps.setString(15,imagehbWeb.getIdNvChitra());
                ps.setString(16,filepath);
                ps.executeUpdate();
                ps.close();
                con.commit();
 
               } catch (Exception e) {
                   return e.getMessage();
              }
          

            }
            

           
          else{
               

               return "Khong co du lieu";
                
            } 
            
           }
           //Error . 
           else{
            
            con = ConnectionProvider.getCon();
            if(con==null)
            {
              ConnectionProvider.reconnectdbastatic();
              con = ConnectionProvider.getCon();
             // con.setAutoCommit(false);
            }
               try {
                debugstring="dong 1429";
                khoa=imageUploadModel.getKhoa() ;
                ps.setString(5,""); 
                ps.setString(6,""); 
                ps.setString(7,"");
                ps.setInt(8,0);
                ps.setString(9,""); 
                ps.setString(10, "Y"); 
                Date d= new  Date();
                ps.setDate(11, new java.sql.Date(d.getTime())); 
                ps.setString(1,filepath);
                ps.setBinaryStream(12, is,200000);
                ps.setString(13,"");
                ps.setString(14,"");
                ps.setString(15,uploadToday.getUserid());
                ps.setString(2,"ER"+uploadToday.getUserid()+uploadToday.getDotbn());
                ps.setInt(3,1);
                ps.setString(16,filepath);
                ps.setString(4,uploadToday.getUserid());    
                ps.executeUpdate();
                ps.close();
                con.commit();
               // con.close();
                
               } catch (Exception e) {
                   return e.getMessage();
               }
         
 
          
            }
 
             return "T";
             
        
 
 
    }
    
   
   
     public void isResetWhenPageLoad(ComponentSystemEvent event){

     
           
   
      } 
     
   public void timtheoloaigiayto(VwDmQuanlydotimagectietWeb vdqw) {
       
         // Lay thong tin khach hang . 
          VwDmQuanlydotimagectietWeb tclass=new VwDmQuanlydotimagectietWeb();
          tclass=vdqw;      
          int stt=dmQuanlydotimagectietWebs.indexOf(vdqw);
          ApiKhachHangDao apiKhachHangDao= new ApiKhachHangDao();
          Customer khachhangmodel= new Customer();
          List<Customer> listkh = new ArrayList<>();
          listkh=apiKhachHangDao.getListCustomerCMND(vdqw.getSoCtTuythan());
             try {
              khachhangmodel=listkh.get(0);
              tclass.setNgaycap(khachhangmodel.getDateOfIssueDateValue());
              tclass.setIdnoicap(khachhangmodel.getPlaceOfIssue());
              tclass.setMakhachhang(khachhangmodel.getCustomerCode());
              dmQuanlydotimagectietWebs.set(stt, tclass);
             } catch (Exception e) {
              tclass.setMakhachhang("NOVALUE");
              dmQuanlydotimagectietWebs.set(stt, tclass);
             }
 
    }
      public void reuploadImagetoServer(VwDmQuanlydotimagectietWeb vdqw) {
        try {
            ImageDao dao= new ImageDao();
            //String kq=dao.checkimagefromServer(vdqw.getSobn().toString());
            String kq="F";
            if (kq.equalsIgnoreCase("f"))
            {
              String kqupload=dao.uploadImageFromBlob(vdqw.getKhoa(),vdqw.getSobn().toString());  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChinhamainManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
   
     
        public List<String> getDsfile() {
        return dsfile;
    }

    // Get/Set .
    public void setDsfile(List<String> dsfile) {
        this.dsfile = dsfile;
    }

    public List<VwDsUploadImagehbWeb> getDsUploadImagehbWebs() {
        return dsUploadImagehbWebs;
    }

    public void setDsUploadImagehbWebs(List<VwDsUploadImagehbWeb> dsUploadImagehbWebs) {
        this.dsUploadImagehbWebs = dsUploadImagehbWebs;
    }

    public VwDsUploadImagehbWeb getVwDsUploadImagehbWeb() {
        return vwDsUploadImagehbWeb;
    }


   public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    } 
    
    
  
    
    
    public String getLoaitkdulieu() {
        return loaitkdulieu;
    }

    public void setLoaitkdulieu(String loaitkdulieu) {
        this.loaitkdulieu = loaitkdulieu;
    }
       
    
    public void setVwDsUploadImagehbWeb(VwDsUploadImagehbWeb vwDsUploadImagehbWeb) {
        this.vwDsUploadImagehbWeb = vwDsUploadImagehbWeb;
    }

    public VwTransactionListWeb getTranSacWeb() {
        return tranSacWeb;
    }

    public List<GiaytoList> getDsgiayto() {
        return dsgiayto;
    }

    public void setDsgiayto(List<GiaytoList> dsgiayto) {
        this.dsgiayto = dsgiayto;
    }
    
    
    public void setTranSacWeb(VwTransactionListWeb tranSacWeb) {
        this.tranSacWeb = tranSacWeb;
    }

    public List<VwTransactionListWeb> getDsTranSacWeb() {
        return dsTranSacWeb;
    }

    public void setDsTranSacWeb(List<VwTransactionListWeb> dsTranSacWeb) {
        this.dsTranSacWeb = dsTranSacWeb;
    }

    public List<Dsfileimagetoday> getDsTranSac() {
        return dsTranSac;
    }

    public void setDsTranSac(List<Dsfileimagetoday> dsTranSac) {
        this.dsTranSac = dsTranSac;
    }

    public Boolean getIshoibaofile() {
        return ishoibaofile;
    }

    public void setIshoibaofile(Boolean ishoibaofile) {
        this.ishoibaofile = ishoibaofile;
    }

    public List<ImageUploadModel> getImageUploadList() {
        return imageUploadList;
    }

    public void setImageUploadList(List<ImageUploadModel> imageUploadList) {
        this.imageUploadList = imageUploadList;
    }

    public String getLoaihb() {
        return loaihb;
    }

    public void setLoaihb(String loaihb) {
        this.loaihb = loaihb;
    }

    public List<VwDmQuanlydotImagetongWeb> getDmQuanlydotImagetongWebs() {
        return dmQuanlydotImagetongWebs;
    }

    public void setDmQuanlydotImagetongWebs(List<VwDmQuanlydotImagetongWeb> dmQuanlydotImagetongWebs) {
        this.dmQuanlydotImagetongWebs = dmQuanlydotImagetongWebs;
    }

    public List<VwDmQuanlydotimagectietWeb> getDmQuanlydotimagectietWebs() {
        return dmQuanlydotimagectietWebs;
    }

    public void setDmQuanlydotimagectietWebs(List<VwDmQuanlydotimagectietWeb> dmQuanlydotimagectietWebs) {
        this.dmQuanlydotimagectietWebs = dmQuanlydotimagectietWebs;
    }

    public Boolean getIsupdatesoct() {
        return isupdatesoct;
    }

    public void setIsupdatesoct(Boolean isupdatesoct) {
        this.isupdatesoct = isupdatesoct;
    }

    public CroppedImage getCroppedImage() {
        return croppedImage;
    }

    public void setCroppedImage(CroppedImage croppedImage) {
        this.croppedImage = croppedImage;
    }

    public String getNewImageName() {
        return newImageName;
    }

    public void setNewImageName(String newImageName) {
        this.newImageName = newImageName;
    }

    public InputStream getFiledrop() {
        return filedrop;
    }

    public void setFiledrop(InputStream filedrop) {
        this.filedrop = filedrop;
    }

    public Boolean getShowbut() {
        return showbut;
    }

    public void setShowbut(Boolean showbut) {
        this.showbut = showbut;
    }

    public String getDebugstring() {
        return debugstring;
    }

    public void setDebugstring(String debugstring) {
        this.debugstring = debugstring;
    }

    public String getSobnerror() {
        return sobnerror;
    }

    public void setSobnerror(String sobnerror) {
        this.sobnerror = sobnerror;
    }

    public Boolean getShowbutxacnhan() {
        return showbutxacnhan;
    }

    public void setShowbutxacnhan(Boolean showbutxacnhan) {
        this.showbutxacnhan = showbutxacnhan;
    }
    
     
    
    public ChinhamainManagedBean() {
        
        
        
    }
    
}
