 
package Controller;

import ApiFunction.ApiDanhmuc;
import ApiFunction.ApiGiaophieu;
import ApiFunction.ApiHamgiaophieu;
import DanhmucModel.DmCitylist;
import DanhmucModel.XacminhModel;
import DaoDanhmuc.XacminhDAO;
import Entities.ChitietgiaodichModel;
import Entities.UserModel;
import Entities.VwKshbHosonvchinhaAll;
import Entities.VwTondongNvAllWeb;
import Funtion.Login.FunctionLog;
import Global.ConstantCodes;
import Global.CookieBean;
import Global.RepeatPaginator;
import Global.SessionBean;
import static Global.SessionBean.getSession;
import com.google.gson.Gson;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

 
@Named(value = "hoibaoManagedBean")
@SessionScoped
public class HoibaoManagedBean implements Serializable {

    private String giatritimkiem;
    private  List<ChitietgiaodichModel> chitietgiaodichModels=new ArrayList<>();
    private  ChitietgiaodichModel chitietgiaodichModel=new  ChitietgiaodichModel();
    private RepeatPaginator paginator;
    private  List<VwTondongNvAllWeb> listnvtondong= new ArrayList<>();
    private  String tennvchitra ;
    private  List<DmCitylist> dscity=ConstantCodes.mmcitylist;
    private   UserModel userModel=SessionBean.getUseriNFOR();
    private List<VwKshbHosonvchinhaAll>  listhskiemtranvall= new ArrayList<VwKshbHosonvchinhaAll>();
    private List<VwKshbHosonvchinhaAll> listhskiemtranv= new ArrayList<>();
    private VwKshbHosonvchinhaAll hosonvchinhaAll = new VwKshbHosonvchinhaAll();
  /**
   * 
   * @return 
   */  
    
  public String  chuyentrangkshoibaochinhanh( ) {
  
   // this.showthongtinnv();
    return "success1";
    
  }
    
    
     public   String chuyentrangdshoibao(String dk ,String ktao) {
        chitietgiaodichModel= new ChitietgiaodichModel();
        //UserModel userModel=SessionBean.getUseriNFOR();
        String chinhanh=userModel.getHomeBranch();
        String userid=userModel.getUserId();         
        ApiDanhmuc af=new ApiDanhmuc();
        chitietgiaodichModels = new ArrayList<>();
        listnvtondong= new ArrayList<VwTondongNvAllWeb>();
        
           switch (dk) 
           {
            case "C": 
            {         
           listnvtondong=af.dsdondongchitiet(chinhanh, userid, "");
           if(listnvtondong.size()==0){
              // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, listhskiemtranv.size(), ""));  
           }
           else{
           for (int i = 0; i < listnvtondong.size(); i++) {
          
           chitietgiaodichModel = new ChitietgiaodichModel();
           chitietgiaodichModel.setSttrecord(i+1);
           chitietgiaodichModel.setSocttuythan(listnvtondong.get(i).getSoCtTuythan());
           chitietgiaodichModel.setDotnhantien(listnvtondong.get(i).getIdQlqDottg());    
           chitietgiaodichModel.setMakhachhang(listnvtondong.get(i).getIdKhachhangtt());
           chitietgiaodichModel.setTendoitac(listnvtondong.get(i).getTenDoitac());
           chitietgiaodichModel.setHoten(listnvtondong.get(i).getHoten()); 
           chitietgiaodichModel.setSobn(listnvtondong.get(i).getSobn().toString()); 
           chitietgiaodichModel.setManguoinhan(listnvtondong.get(i).getMaNguoinhan()); 
           chitietgiaodichModel.setLydoxacminh(listnvtondong.get(i).getNoidungxmmobile()); 
           chitietgiaodichModel.setNguoigoi(listnvtondong.get(i).getNguoigoi()); 
           chitietgiaodichModel.setSotiengoi(listnvtondong.get(i).getSotiengoi()); 
           chitietgiaodichModel.setTygia(listnvtondong.get(i).getTygia()); 
           chitietgiaodichModel.setThanhtien(listnvtondong.get(i).getThanhtien()); 
           chitietgiaodichModel.setLoaitien(listnvtondong.get(i).getIdLoaitienchitra()); 
           chitietgiaodichModel.setDiachi(listnvtondong.get(i).getDiachi()); 
           chitietgiaodichModel.setSodienthoai(listnvtondong.get(i).getDienthoai());
           chitietgiaodichModel.setSophieu(listnvtondong.get(i).getSophieu());
           chitietgiaodichModel.setChinhanh(listnvtondong.get(i).getIdChinhanh());
           chitietgiaodichModel.setStt(listnvtondong.get(i).getStt());
           chitietgiaodichModel.setIdnvchitrachuyen("novalue");   
           String dasdas=listnvtondong.get(i).getIdNvChitra();
           chitietgiaodichModel.setIdnvchitra(listnvtondong.get(i).getIdNvChitra());
           chitietgiaodichModels.add(chitietgiaodichModel);
          
           }
           }
             break;
            }

           }
           
           paginator = new RepeatPaginator(chitietgiaodichModels);

        
        return ktao ;

    }   
     
    public void capnhatcmnd(ChitietgiaodichModel bn) throws SQLException {
       
          XacminhModel  xacminh= new  XacminhModel();
          String userid=bn.getIdnvchitra();
         // String idchinhanh=bn.getChinhanh();
         if (!bn.getSocttuythan().equalsIgnoreCase(""))
          {     
                ApiGiaophieu q= new  ApiGiaophieu();
                String kq=q.capnhatsocmnd(bn);
               
            // Lay thong tin cookie theo username .
                this.chuyentrangdshoibao("C",null);
            
                
          if(kq.equalsIgnoreCase("F"))
          {   
           //this.tennvchitra=null;
           //xacminh=null;
              
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật không thành công", ""));
              
          }
          else{
               
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật  thành công", ""));
             
          }
          }
          else{
                this.tennvchitra=null;
                xacminh=null;
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "CMND không thể trống.", ""));
     
          }  
        
    } 
   
      
     
     public void locdulieudshoso(String dk) throws UnsupportedEncodingException {
         
         chitietgiaodichModels=new ArrayList<>();
         chitietgiaodichModel= new ChitietgiaodichModel();
         FunctionLog functionLog = new FunctionLog();
       
         List<VwTondongNvAllWeb> ketquatam= new ArrayList<>();
         
         if (listnvtondong.size()>0){
             
            if (dk.equalsIgnoreCase("ALL")) 
            {
                String kqkt=functionLog.checkrestausfocookie("reloaddata1") ;
                if(kqkt==null)
                {   CookieBean beancook= new CookieBean();
                    beancook.setCookie("reloaddata1","Y", 60 * 1  );  
                    this.chuyentrangdshoibao("C",null);
                    return;
                }
                else
                {
                    ketquatam= listnvtondong;
                }
              
                
               // ketquatam= listnvtondong;
            }
            else {

                for (VwTondongNvAllWeb listchinhanh1 : listnvtondong) {
                    String chuoitk = listchinhanh1.getSobn().toString();
                    if ( chuoitk.substring(chuoitk.length()-dk.length()).contains(dk) ) {
                        ketquatam.add(listchinhanh1);
                    }

                }
                
                
            }
 
            for (int i = 0; i < ketquatam.size(); i++) {
                    chitietgiaodichModel = new ChitietgiaodichModel();
                    chitietgiaodichModel.setTendoitac(ketquatam.get(i).getTenDoitac());
                    chitietgiaodichModel.setHoten(ketquatam.get(i).getHoten());
                    chitietgiaodichModel.setSobn(ketquatam.get(i).getSobn().toString());
                    chitietgiaodichModel.setManguoinhan(ketquatam.get(i).getMaNguoinhan());
                    chitietgiaodichModel.setLydoxacminh(ketquatam.get(i).getNoidungxmmobile());
                    chitietgiaodichModel.setNguoigoi(ketquatam.get(i).getNguoigoi());
                    chitietgiaodichModel.setSotiengoi(ketquatam.get(i).getSotiengoi());
                    chitietgiaodichModel.setTygia(ketquatam.get(i).getTygia());
                    chitietgiaodichModel.setThanhtien(ketquatam.get(i).getThanhtien());
                    chitietgiaodichModel.setLoaitien(ketquatam.get(i).getIdLoaitienchitra());
                    chitietgiaodichModel.setDiachi(ketquatam.get(i).getDiachi());
                    chitietgiaodichModel.setSodienthoai(ketquatam.get(i).getDienthoai());
                    chitietgiaodichModel.setSocttuythan(ketquatam.get(i).getSoCtTuythan());
                    chitietgiaodichModel.setSophieu(ketquatam.get(i).getSophieu());
                    chitietgiaodichModel.setChinhanh(ketquatam.get(i).getIdChinhanh());
                    chitietgiaodichModel.setStt(ketquatam.get(i).getStt());
                    chitietgiaodichModel.setDotnhantien(ketquatam.get(i).getIdQlqDottg());    
                    chitietgiaodichModel.setMakhachhang(ketquatam.get(i).getIdKhachhangtt());
                    chitietgiaodichModels.add(chitietgiaodichModel);
                
           }
                  
               
            }
         else{
             
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Không có hồ sơ.", ""));
      
             
         }
         
      
         paginator = new RepeatPaginator(chitietgiaodichModels);
        
         
     }
    
     
    public void capnhatchuyenhoso(ChitietgiaodichModel bn) throws SQLException {
       
          XacminhModel  xacminh= new  XacminhModel();
          String userid=bn.getIdnvchitra();
          //String idchinhanh=SessionBean.getChinhanhId();
         if (!bn.getSocttuythan().equalsIgnoreCase(""))
          {     
 
                ApiHamgiaophieu q= new  ApiHamgiaophieu();
                String khoa=bn.getChinhanh()+"@"+bn.getSobn();
                String chuoikhoa=userid+"@"+bn.getSocttuythan();
                String kq=q.capnhatchuyenhsvehoiso(khoa, chuoikhoa);
                q.close();
          if(kq.equalsIgnoreCase("T"))
          {   
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Chuyển   thành công", ""));
              this.chuyentrangdshoibao("C",null);
              
          }
          else{
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Chuyển không thành công", ""));
       
          }
          }
          else{
                this.tennvchitra=null;
                xacminh=null;
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "CMND không thể trống.", ""));
     
          }  
        
    } 
       
 public void capnhatxacminhdate(ChitietgiaodichModel bn) throws SQLException {
       
          XacminhModel  xacminh= new  XacminhModel();
          String userid=bn.getIdnvchitra();
          String idchinhanh=bn.getChinhanh();
          
         if (!bn.getLydoxacminh().equalsIgnoreCase("") )
          {     
                xacminh.setSobiennhan(bn.getSobn());
                xacminh.setSocmnd(bn.getSocttuythan());
                xacminh.setId_chinhanh(idchinhanh);
                xacminh.setNvchitra(userid);
                xacminh.setLydoxm(bn.getLydoxacminh());
                xacminh.setSophieu(bn.getSophieu());
                xacminh.setStt(bn.getStt().intValue());
                XacminhDAO q= new XacminhDAO();
                String kq=q.updatexacminhtodate(xacminh,"", userid);
                
          if(kq.equalsIgnoreCase("T"))
          {   
      
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Xác minh   thành công", ""));
              this.chuyentrangdshoibao("C",null);
          }
          else{
              
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, kq, ""));
       
          }
          }
          else{
                this.tennvchitra=null;
                xacminh=null;
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Lý do xác minh không thể trống.", ""));
     
          }  
        
    } 
 
 
   public void  showthongtinnv() {
      try {
          HttpSession session = getSession();
          UserModel userModel =(UserModel) session.getAttribute("g_useInfor");
          String userid = userModel.getUserId();
          String chinhanh=userModel.getHomeBranch();
          if(session==null)
          {
              
          }
          else{
              userid=userModel.getUserId();
              chinhanh=userModel.getHomeBranch();
          }
          Gson gson= new Gson();
          listhskiemtranv = null;
          listhskiemtranv = new ArrayList<>();
          hosonvchinhaAll=new VwKshbHosonvchinhaAll();
         // listhskiemtranv = HoibaoManagedBean.dsthongkenhanvien(chinhanh);
          listhskiemtranv = ApiDanhmuc.dsthongkenhanvien(chinhanh, userid, "") ;
          //String kq= gson.toJson(listhskiemtranv.get(0));
      //   hosonvchinhaAll = gson.fromJson(listhskiemtranv.get(0)., VwKshbHosonvchinhaAll.class) ;
        //  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy" + listhskiemtranv.size(), ""));

      } catch (Exception e) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Không có hồ sơ", ""));

      }
  
  }
   
      public String chuyentrangchitiet(String dk) {
      /*String chinhanh=SessionBean.getChinhanhId();
        String userid=SessionBean.getUserId();         
        chitietgiaodichModels = new ArrayList<>();
        
        List<VwTondongNvAllWeb> listnvtondong= new ArrayList<VwTondongNvAllWeb>();
  
           switch (dk) 
           {
            case "C": 
            {
           listnvtondong=HamUserAll.dsdondongchitiet(chinhanh, userid, "");
           for (int i = 0; i < listnvtondong.size(); i++) {
           chitietgiaodichModel = new ChitietgiaodichModel();
           chitietgiaodichModel.setTendoitac(listnvtondong.get(i).getTenDoitac());
           chitietgiaodichModel.setHoten(listnvtondong.get(i).getHoten()); 
           chitietgiaodichModel.setSobn(listnvtondong.get(i).getSobn().toString()); 
           chitietgiaodichModel.setManguoinhan(listnvtondong.get(i).getMaNguoinhan()); 
           chitietgiaodichModel.setLydoxacminh(listnvtondong.get(i).getNoidungxmmobile()); 
           chitietgiaodichModel.setNguoigoi(listnvtondong.get(i).getNguoigoi()); 
           chitietgiaodichModel.setSotiengoi(listnvtondong.get(i).getSotiengoi()); 
           chitietgiaodichModel.setTygia(listnvtondong.get(i).getTygia()); 
           chitietgiaodichModel.setThanhtien(listnvtondong.get(i).getThanhtien()); 
           chitietgiaodichModel.setLoaitien(listnvtondong.get(i).getIdLoaitienchitra()); 
           chitietgiaodichModel.setDiachi(listnvtondong.get(i).getDiachi()); 
           chitietgiaodichModel.setSodienthoai(listnvtondong.get(i).getDienthoai());
           chitietgiaodichModel.setSocttuythan(listnvtondong.get(i).getSoCtTuythan());
           chitietgiaodichModels.add(chitietgiaodichModel);
           }
             break;
            }
          
          case "B": 
            {
           listnvtondong=HamUserAll.dsdondongchitiet(chinhanh, userid, "");
           for (int i = 0; i < listnvtondong.size(); i++) {
              VwTondongNvAllWeb allWeb=new VwTondongNvAllWeb();
              allWeb=listnvtondong.get(i);
              if(allWeb.getNoidungxmmobile()!=null)
              {
                   chitietgiaodichModel = new ChitietgiaodichModel();
                   chitietgiaodichModel.setTendoitac(allWeb.getTenDoitac());
                   chitietgiaodichModel.setHoten(allWeb.getHoten()); 
                   chitietgiaodichModel.setSobn(allWeb.getSobn().toString()); 
                   chitietgiaodichModel.setManguoinhan(allWeb.getMaNguoinhan()); 
                   chitietgiaodichModel.setLydoxacminh(allWeb.getNoidungxmmobile()); 
                   chitietgiaodichModel.setSodienthoai(listnvtondong.get(i).getDienthoai());
                   chitietgiaodichModel.setSocttuythan(listnvtondong.get(i).getSoCtTuythan());
                   chitietgiaodichModels.add(chitietgiaodichModel);
              }
           }
             break;  
            }
           case "D": 
            {
           listnvtondong=HamUserAll.dsdondongdkienchitiet(chinhanh, userid, dk);
           for (int i = 0; i < listnvtondong.size(); i++) {
              VwTondongNvAllWeb allWeb=new VwTondongNvAllWeb();
               allWeb=listnvtondong.get(i);
               chitietgiaodichModel = new ChitietgiaodichModel();
               chitietgiaodichModel.setTendoitac(listnvtondong.get(i).getTenDoitac());
               chitietgiaodichModel.setHoten(listnvtondong.get(i).getHoten());
               chitietgiaodichModel.setSobn(listnvtondong.get(i).getSobn().toString());
               chitietgiaodichModel.setManguoinhan(listnvtondong.get(i).getMaNguoinhan());
               chitietgiaodichModel.setLydoxacminh(listnvtondong.get(i).getNoidungxmmobile());
               chitietgiaodichModel.setNguoigoi(listnvtondong.get(i).getNguoigoi());
               chitietgiaodichModel.setSotiengoi(listnvtondong.get(i).getSotiengoi());
               chitietgiaodichModel.setTygia(listnvtondong.get(i).getTygia());
               chitietgiaodichModel.setThanhtien(listnvtondong.get(i).getThanhtien());
               chitietgiaodichModel.setLoaitien(listnvtondong.get(i).getIdLoaitienchitra());
               chitietgiaodichModel.setDiachi(listnvtondong.get(i).getDiachi());
               chitietgiaodichModel.setSodienthoai(listnvtondong.get(i).getDienthoai());
               chitietgiaodichModel.setSocttuythan(listnvtondong.get(i).getSoCtTuythan());
               chitietgiaodichModels.add(chitietgiaodichModel);
           }
              break;
            } 
             
           case "E": 
            {
           listnvtondong=HamUserAll.dsdondongdkienchitiet(chinhanh, userid, dk);
           for (int i = 0; i < listnvtondong.size(); i++) {
              VwTondongNvAllWeb allWeb=new VwTondongNvAllWeb();
               allWeb=listnvtondong.get(i);
               chitietgiaodichModel = new ChitietgiaodichModel();
               chitietgiaodichModel.setTendoitac(listnvtondong.get(i).getTenDoitac());
               chitietgiaodichModel.setHoten(listnvtondong.get(i).getHoten());
               chitietgiaodichModel.setSobn(listnvtondong.get(i).getSobn().toString());
               chitietgiaodichModel.setManguoinhan(listnvtondong.get(i).getMaNguoinhan());
               chitietgiaodichModel.setLydoxacminh(listnvtondong.get(i).getNoidungxmmobile());
               chitietgiaodichModel.setNguoigoi(listnvtondong.get(i).getNguoigoi());
               chitietgiaodichModel.setSotiengoi(listnvtondong.get(i).getSotiengoi());
               chitietgiaodichModel.setTygia(listnvtondong.get(i).getTygia());
               chitietgiaodichModel.setThanhtien(listnvtondong.get(i).getThanhtien());
               chitietgiaodichModel.setLoaitien(listnvtondong.get(i).getIdLoaitienchitra());
               chitietgiaodichModel.setDiachi(listnvtondong.get(i).getDiachi());
               chitietgiaodichModel.setSodienthoai(listnvtondong.get(i).getDienthoai());
               chitietgiaodichModel.setSocttuythan(listnvtondong.get(i).getSoCtTuythan());
               chitietgiaodichModels.add(chitietgiaodichModel);
           }
             break;  
            }  
                
           case "F": 
            {
            List<VwGiaodichHoibaomobileNvall> hoibaomobileNvall= new ArrayList<VwGiaodichHoibaomobileNvall>();
            hoibaomobileNvall=HamUserAll.dshoibaochitiet(chinhanh, userid, dk);
           for (int i = 0; i < hoibaomobileNvall.size(); i++) {
              VwGiaodichHoibaomobileNvall allWeb=new VwGiaodichHoibaomobileNvall();
               allWeb=hoibaomobileNvall.get(i);
               chitietgiaodichModel = new ChitietgiaodichModel();
               chitietgiaodichModel.setTendoitac(hoibaomobileNvall.get(i).getTenDoitac());
               chitietgiaodichModel.setHoten(hoibaomobileNvall.get(i).getHoten());
               chitietgiaodichModel.setSobn(hoibaomobileNvall.get(i).getSobn().toString());
               chitietgiaodichModel.setManguoinhan(hoibaomobileNvall.get(i).getMaNguoinhan());
               chitietgiaodichModel.setLydoxacminh(hoibaomobileNvall.get(i).getNoidungxmmobile());
               chitietgiaodichModel.setNguoigoi(hoibaomobileNvall.get(i).getNguoigoi());
               chitietgiaodichModel.setSotiengoi(hoibaomobileNvall.get(i).getSotiengoi());
               chitietgiaodichModel.setTygia(hoibaomobileNvall.get(i).getTygia());
               chitietgiaodichModel.setThanhtien(hoibaomobileNvall.get(i).getThanhtien());
               chitietgiaodichModel.setLoaitien(hoibaomobileNvall.get(i).getIdLoaitienchitra());
               chitietgiaodichModel.setDiachi(hoibaomobileNvall.get(i).getDiachi());
               chitietgiaodichModel.setSodienthoai(hoibaomobileNvall.get(i).getDienthoai());
               chitietgiaodichModel.setSocttuythan(hoibaomobileNvall.get(i).getSoCtTuythan());
               chitietgiaodichModels.add(chitietgiaodichModel);
           }
             break;  
            }  

           }

        return "chitiethosokiemtra" + "?faces-redirect=true";
*/
      return null;

    }   
  
    
 
    public String getGiatritimkiem() {
        return giatritimkiem;
    }

    public void setGiatritimkiem(String giatritimkiem) {
        this.giatritimkiem = giatritimkiem;
    }

    public List<ChitietgiaodichModel> getChitietgiaodichModels() {
        return chitietgiaodichModels;
    }

    public void setChitietgiaodichModels(List<ChitietgiaodichModel> chitietgiaodichModels) {
        this.chitietgiaodichModels = chitietgiaodichModels;
    }

    public ChitietgiaodichModel getChitietgiaodichModel() {
        return chitietgiaodichModel;
    }

    public void setChitietgiaodichModel(ChitietgiaodichModel chitietgiaodichModel) {
        this.chitietgiaodichModel = chitietgiaodichModel;
    }

    public List<VwTondongNvAllWeb> getListnvtondong() {
        return listnvtondong;
    }

    public void setListnvtondong(List<VwTondongNvAllWeb> listnvtondong) {
        this.listnvtondong = listnvtondong;
    }

    public String getTennvchitra() {
        return tennvchitra;
    }

    public void setTennvchitra(String tennvchitra) {
        this.tennvchitra = tennvchitra;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public List<DmCitylist> getDscity() {
        return dscity;
    }

    public void setDscity(List<DmCitylist> dscity) {
        this.dscity = dscity;
    }

    public List<VwKshbHosonvchinhaAll> getListhskiemtranvall() {
        return listhskiemtranvall;
    }

    public void setListhskiemtranvall(List<VwKshbHosonvchinhaAll> listhskiemtranvall) {
        this.listhskiemtranvall = listhskiemtranvall;
    }

    public List<VwKshbHosonvchinhaAll> getListhskiemtranv() {
        return listhskiemtranv;
    }

    public void setListhskiemtranv(List<VwKshbHosonvchinhaAll> listhskiemtranv) {
        this.listhskiemtranv = listhskiemtranv;
    }

    public VwKshbHosonvchinhaAll getHosonvchinhaAll() {
        return hosonvchinhaAll;
    }

    public void setHosonvchinhaAll(VwKshbHosonvchinhaAll hosonvchinhaAll) {
        this.hosonvchinhaAll = hosonvchinhaAll;
    }
 
    
 
    
    public HoibaoManagedBean() {
      
       
        
    }
//        @PostConstruct
//        public void init() { 
//         chitietgiaodichModels=new ArrayList<ChitietgiaodichModel>();
// 
//         for (int i = 0; i < 50; i++) {
//            chitietgiaodichModel = new ChitietgiaodichModel();
//            chitietgiaodichModel.setSttrecord(i);
//            chitietgiaodichModel.setChinhanh("003"+String.valueOf(i));
//            chitietgiaodichModel.setHoten("NGUYEN HUU TAM CHAU"+String.valueOf(i));
//            chitietgiaodichModels.add(chitietgiaodichModel);
//        } 
//            paginator = new RepeatPaginator(chitietgiaodichModels);
//        }
//    
     public RepeatPaginator getPaginator() {
        return paginator;
    }
     
    
}
