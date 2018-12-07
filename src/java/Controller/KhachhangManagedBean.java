 
package Controller;

import LocalFuntionGlobal.FunctionLocal;
import EntitiesBean.*;
import Global.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static ConnectBean.Provider.*;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import ApiFunction.ApiDao.*;
import DatabaseDao.KhachhangDao;
import Entities.*;
import LocalModel.VwTkttBiennhanMaster;

 
@Named(value = "khachhangManagedBean")
@SessionScoped
public class KhachhangManagedBean implements Serializable {


// Khai bao bien .
    // Danh sách khách hàng,giao dich .
    private List<VwXemdulieutkkhMaster> dskh;
    private List<VwXemdulieutkkhMaster> dskhfilter;
    private List<VwTkttBiennhanMaster> dsgd;
    private List<VwXemdulieutkMaster> dsgdfilter;
    private List<DistrictList> dsquanhuyen; 
    private List<CityList> dscity ;
    private List<CityList> dscityselect ;
    private List<GiaytoList> dsgiayto ;
    private List<VwDsNhnavienctWeb> dsNhnavienctWebs;
    private List<VwDshosoGiaophieuTodayWeb> dshosoGiaophieuTodayWebs=new ArrayList<VwDshosoGiaophieuTodayWeb>();
    
            
    // Chi tiết khách hàng
    private VwKhachhangttListWeb khachhangct=new VwKhachhangttListWeb();
    private VwXemdulieutkkhMaster chitietkhachhang=new VwXemdulieutkkhMaster();
    private VwKhachhangttListWeb khachhangtrung=new VwKhachhangttListWeb();
    private KhachhangttList khachhangttList= new KhachhangttList();
    private VwDsgiaodichBosungttMb giaodichct=new VwDsgiaodichBosungttMb() ;
    private VwXemdulieutkMaster chitietbn=new VwXemdulieutkMaster() ;
    private VwDsNhnavienctWeb dsNhnavienctWeb=new VwDsNhnavienctWeb();
    private KieuhoiList kieuhoiList = new KieuhoiList();
    private KieuhoiListPK kieuhoiListPK= new KieuhoiListPK();
    private VwDshosoGiaophieuTodayWeb giaodichchuaxacnhan=new VwDshosoGiaophieuTodayWeb() ;
    
    private String makhachhangtk  ;
    private String dktimkiemchuagoikhach;
    private String sobntk =null ;
    private String loaitk=null  ;
    private String loainvct=null;
    private Boolean khoasobn;
    private Boolean isDisKhtrung=true;
    private Boolean isDisxoakh=true;
    private String loaitkdulieu="00001";
 
    
    public void resetvalue() throws SQLException{
        
        dsNhnavienctWeb=new VwDsNhnavienctWeb() ;
        dsNhnavienctWebs= new ArrayList<>();
        dskh=new ArrayList<>();
        dsgd=new ArrayList<>();
        dsquanhuyen=new ArrayList<>();
        isDisKhtrung=true;
        khachhangtrung=new VwKhachhangttListWeb();
        giaodichct=new VwDsgiaodichBosungttMb();
        sobntk=null;
        
        
    }
    
     public  String  capnhatttgdich() throws SQLException{
        String userid=SessionBean.getUserId();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEKH);
        EntityManager entitymanager = emfactory.createEntityManager();
        //KhachhangttList khachhangttList = new KhachhangttList();
        //Lấy khóa của bảng IMAGE_CAPTCHA - Đây là hành động bắt buộc khi cập nhật bảng trên JPA
        try {
            /* Update entity */
                kieuhoiListPK.setIdChinhanh(giaodichct.getIdChinhanh());
                kieuhoiListPK.setSophieu(giaodichct.getSophieu());
                kieuhoiListPK.setStt(giaodichct.getStt());
                kieuhoiList = entitymanager.find(KieuhoiList.class,  kieuhoiListPK);
		entitymanager.getTransaction().begin();
                kieuhoiList.setSoCtTuythan(this.giaodichct.getSoCtTuythan());
                kieuhoiList.setIdCtTuythan(this.giaodichct.getIdCtTuythan());
                kieuhoiList.setIdNvChitra(this.giaodichct.getIdNvChitra());
                kieuhoiList.setCallkh("Y");
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date ngayhienhanh= new  Date();
                String datefm=df.format(ngayhienhanh);
                Date date2 = df.parse (datefm);
                kieuhoiList.setNgaycallnoname(date2);
                kieuhoiList.setNhanviencallnoname(userid);
                kieuhoiList.setIdKhachhangtt(this.khachhangct.getIdKhachhang());
                kieuhoiList.setNgaycap(this.khachhangct.getNgaycap());
                kieuhoiList.setIdNoicap(this.giaodichct.getIdNoicap());
		//System.out.println("Employee after updation :- " + khachhangttList);     
		entitymanager.getTransaction().commit();
                entitymanager.close();
                resetvalue();
                return "timkiemkhachhang" + "?faces-redirect=true";
         } catch (Exception e) {
                
             return null;
       }
      
       
        
        
    }   
     
     
    
     public void laysogiaytogangd() {

        String magiayto = this.giaodichct.getIdCtTuythan();
        switch (magiayto) {
            case "001":
                 this.giaodichct.setSoCtTuythan(khachhangct.getSochungminh());
                 this.giaodichct.setNgaycap(khachhangct.getNgaycapCmnd());
                 this.giaodichct.setIdNoicap(khachhangct.getIdNoicapcmnd());
                break;
            case "002":
                this.giaodichct.setSoCtTuythan(khachhangct.getGiayPlx());
                      this.giaodichct.setNgaycap(khachhangct.getNgaycapGplx());
                  this.giaodichct.setIdNoicap(khachhangct.getIdNoicapgplx());
                break;
            case "003":
                 this.giaodichct.setSoCtTuythan(khachhangct.getPassport());
                  this.giaodichct.setNgaycap(khachhangct.getNgaycapPassport());
                  this.giaodichct.setIdNoicap(khachhangct.getIdNoicappassport());
                break;        
            default:
                break;
        }

    }
    
   public  void  timgiaodich(){
      // String abc="123"; 
         String idchinhanh=SessionBean.getChinhanhId();
          giaodichct= new VwDsgiaodichBosungttMb();
          EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
          EntityManager entitymanager = emfactory.createEntityManager();
          Query query = null;
          query = entitymanager.createQuery("SELECT d FROM VwDsgiaodichBosungttMb d WHERE d.sobn  = :sobn AND d.idChinhanh=:idchinhanh  " );
         // query=entitymanager.createNamedQuery("VwDsgiaodichBosungttMb.findBySobn");
          Long sob=Long.parseLong(sobntk);
          query.setParameter("sobn", sob);
          query.setParameter("idchinhanh", idchinhanh);
        //  dsgd=query.getResultList();
          dsgd= query.getResultList();
         if (dsgd.size()==0)
      {
           FacesMessage message = new FacesMessage("Không có hồ sơ mã số này" ,"" );
           FacesContext.getCurrentInstance().addMessage(null, message);
      }
         else{
           
         if (dsgd.size()==1){
             
             giaodichct=(VwDsgiaodichBosungttMb) query.getSingleResult();
             
         }
         
         }
         
          
    }  
   
    public  void  timgiaodichchuagoikhach(){
     // String abc="123";
     dshosoGiaophieuTodayWebs=null;
     giaodichchuaxacnhan = new VwDshosoGiaophieuTodayWeb();
     EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
     EntityManager entitymanager = emfactory.createEntityManager();
     Query query = null;
     loaitk="00001";

     
       switch (this.loaitk){
                 case "00001" : 
                     query = entitymanager.createQuery("SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.sobn=:sobn");
                     break;
                 case "00002" : 
                     query = entitymanager.createQuery("SELECT v FROM VwDshosoGiaophieuTodayWeb v WHERE v.sobn=:sobn");
                     break;    

                       } 
     // query=entitymanager.createNamedQuery("VwDsgiaodichBosungttMb.findBySobn");
     Long sob = Long.parseLong(dktimkiemchuagoikhach);
     query.setParameter("sobn", sob);
     //  dsgd=query.getResultList();
     
     try {
         dshosoGiaophieuTodayWebs = query.getResultList();
     } catch (Exception e) {
     }
           
   
    }  
   
     
    
    public  String xacnhankhachhang() throws SQLException{
        
        String userid=SessionBean.getUserId();
        String chinhanh=SessionBean.getChinhanhId();
        dscity=FunctionLocal.laydscity();
        dsquanhuyen=FunctionLocal.dsquanhuyen(khachhangct.getThanhphoThuongtru());
        this.timgiaodich();
        if(dsgd.size()>0)
        {
        dsgiayto=FunctionLocal.laydsgiayto();
//        dsNhnavienctWeb=FunctionLocal.layttuserdangnhap(userid, chinhanh);
        if(giaodichct.getIdDiadiemchitra().equalsIgnoreCase("TQ")){
            loainvct="N";
        }
        else{
            
            loainvct="Y";
        }
       // loainvct=dsNhnavienctWeb.getUsercn();
        dsNhnavienctWebs=FunctionLocal.laydsNVCHITRA(loainvct, chinhanh);
        giaodichct.setIdCtTuythan("001");
        giaodichct.setSoCtTuythan(khachhangct.getSochungminh());
        giaodichct.setNgaycap(khachhangct.getNgaycapCmnd());
        giaodichct.setIdNoicap(khachhangct.getIdNoicapcmnd());
        giaodichct.setIdNvChitra(userid);
        
        return "chitietkhachhang" + "?faces-redirect=true";
        }
        else{
            
            return null;
        }
        
    } 
    
     public  void laydsquanhuyen() throws SQLException{
       
         dsquanhuyen=FunctionLocal.dsquanhuyen(khachhangct.getThanhphoThuongtru());
    } 
      
     public  void laydsnhanvienct() throws SQLException{
         String chinhanh=SessionBean.getChinhanhId();
         String userid=SessionBean.getUserId();
         dsNhnavienctWebs=FunctionLocal.laydsNVCHITRA(loainvct, chinhanh);
       //  giaodichct.setIdNvChitra(userid);
         
    } 
     
    public  String  chuyentrangsuakhachhang(VwXemdulieutkkhMaster khachhangsua) throws SQLException{
        // Kiem tra khach hang trung co ton tai khong , neu co lay thong tin kh trung .
       ApiKhachhang apiKhachhang= new ApiKhachhang();
        chitietkhachhang= new VwXemdulieutkkhMaster();
        chitietkhachhang=khachhangsua;
 
        return "suakhachhang" + "?faces-redirect=true";
  
        
    } 
    
    
    public  String  xoathongtin() throws SQLException{
       
        
      boolean kq = false ; //this.batloicmnd(khachhangct);
      
      if (dskh.size()>1){
          // Phai co 2 gia tri tro len moi duoc xoa
          isDisxoakh=true;
          kq=true;
          
      }
      else{
          
          kq=true;
          
      }
      
       if(kq)
       {
        khachhangttList= new  KhachhangttList();
        String userid=SessionBean.getUserId();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEKH);
        EntityManager entitymanager = emfactory.createEntityManager();
        //KhachhangttList khachhangttList = new KhachhangttList();
        //Lấy khóa của bảng IMAGE_CAPTCHA - Đây là hành động bắt buộc khi cập nhật bảng trên JPA
        try {
            /* Update entity */
                khachhangttList = entitymanager.find(KhachhangttList.class, khachhangct.getIdKhachhang());
		entitymanager.getTransaction().begin();
                khachhangttList.setDuyet("D");    
                SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
                 
                khachhangttList.setGhichu("XoaKH-"+userid+"-"+ dt.format(new Date()));
                khachhangttList.setIdRecordtam("Y");
                khachhangttList.setIdValidity("C");
		//System.out.println("Employee after updation :- " + khachhangttList);     
		entitymanager.getTransaction().commit();
                entitymanager.close();
                Boolean kq1=dskh.remove(khachhangct);
                //resetvalue();
                return null;
         } catch (Exception e) {
                
             return null;
       }
     
        
       }   
       
       else{
          FacesMessage message = new FacesMessage("Khách hàng này đã tồn tại với mã khách hàng!!!"+khachhangtrung.getIdKhachhang() ,"" );
          FacesContext.getCurrentInstance().addMessage(null, message); 
          return null;     
       }
       
        
        
    }   
    
    
 
   
   

    
    public  void timkhachhang(String loaitimk,String giatritk){

        ApiTimkiemDao apiTimkiemDao=new ApiTimkiemDao();
         List<VwXemdulieutkkhMaster>  list= new ArrayList<>();
        String userid=SessionBean.getUserId();
        Boolean kq =apiTimkiemDao.timkhachhang(userid, giatritk, loaitimk, "003");
        if(kq){
            
            dskh=apiTimkiemDao.dskhachhang(userid);
            dskhfilter=dskh;
            List<VwXemdulieutkMaster> ds=apiTimkiemDao.showthongtin(userid);
            dsgdfilter=ds;
        }
         if (dskh.size()>1){
             
              isDisxoakh=false;
         }
         else{
             
              isDisxoakh=true;
             
         }
     
      
       
  
        
    }
    
    
    public void dsgiaodichgoikhach(){
          dshosoGiaophieuTodayWebs=null;
          String userid=SessionBean.getUserId();
          EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
          EntityManager entitymanager = emfactory.createEntityManager();
          Query query=null;
          query=entitymanager.createNamedQuery("VwDshosoGiaophieuTodayWeb.findByIdNvChitra");
          query.setParameter("idNvChitra",userid);
          dshosoGiaophieuTodayWebs=query.getResultList();
 
    }
    
    
    public  String chuyentranggdchuagoikhach(){
       this.loaitk=null;
       this.dsgiaodichgoikhach();
       return "dsdagiaophieuchuagoikhach" + "?faces-redirect=true";
    }
    public  void capnhatthongtinkh(int loaiupdate,VwXemdulieutkkhMaster khachhang){
       //Tao thong tin cap nhat
        KhachhangDao apiKhachhang= new KhachhangDao();
        Boolean kq=apiKhachhang.capnhatthongtinkh(loaiupdate, khachhang);
        
    }
    
    public  String chuyentrangkhachhangfromgiaodich(){
        
       sobntk=giaodichchuaxacnhan.getSobn().toString();
      // this.khoasobn=true;
       loaitk="00001";
       makhachhangtk=giaodichchuaxacnhan.getDienthoai();
      
        //Boolean kq =apiTimkiemDao.timkhachhang(userid, giatritk, loaitimk, "003");
      
       return "timkiemkhachhang" + "?faces-redirect=true";
    }

     public  String chuyentrangtaokhachhang() throws SQLException{
       // Gan so lieu  .
       isDisKhtrung=true; 
      
       if(khachhangct!=null)
       {
       khachhangct= new VwKhachhangttListWeb();
       khachhangct.setHo(giaodichchuaxacnhan.getHoten());
       khachhangct.setTen(giaodichchuaxacnhan.getHoten());
       khachhangct.setDidong1(giaodichchuaxacnhan.getDienthoai());
       khachhangct.setSonhaThuongtru(giaodichchuaxacnhan.getDiachi());
       khachhangct.setThanhphoThuongtru(giaodichchuaxacnhan.getIdCity());
       khachhangct.setQuanThuongtru(giaodichchuaxacnhan.getIdDistrict());
       }
       if(khachhangct.getThanhphoThuongtru()!=null){
           
            this.laydsquanhuyen();
       }
       dscity=FunctionLocal.laydscity();
       return "taokhachhang" + "?faces-redirect=true";
    }
     
     
     public  void ktcmnd() {
         
         boolean batloi=this.batloicmnd(khachhangct);
         if (batloi==false)   
         {
         isDisKhtrung=false; 
          FacesMessage message = new FacesMessage("Khách hàng này đã tồn tại với mã khách hàng!!!"+khachhangtrung.getIdKhachhang() ,"" );
          FacesContext.getCurrentInstance().addMessage(null, message); 
         }
         else{
             FacesMessage message = new FacesMessage("Chưa có khách hàng này trong hệ thống" ,"" );
             FacesContext.getCurrentInstance().addMessage(null, message);
             
         }
        
    }
     
     
     public  String  insertkhachhang() throws SQLException{
        String userid=SessionBean.getUserId();
        boolean batloi=this.batloicmnd(khachhangct);
         
       if (batloi)
       {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEKH);
        EntityManager entitymanager = emfactory.createEntityManager();
        //KhachhangttList khachhangttList = new KhachhangttList();
        //Lấy khóa của bảng IMAGE_CAPTCHA - Đây là hành động bắt buộc khi cập nhật bảng trên JPA
        try {
            /* Update entity */
               // khachhangttList = entitymanager.find(KhachhangttList.class, khachhangct.getIdKhachhang());
		entitymanager.getTransaction().begin();
                khachhangttList.setHo(this.khachhangct.getHo());
                khachhangttList.setTen(this.khachhangct.getTen());
                String hoten =this.khachhangct.getHo()+" "+this.khachhangct.getTen() ;
		khachhangttList.setHoten(hoten);
                khachhangttList.setNamsinh(this.khachhangct.getNamsinh());
                khachhangttList.setGioitinh(this.khachhangct.getGioitinh());
                khachhangttList.setSochungminh(this.khachhangct.getSochungminh());
                khachhangttList.setNgaycapCmnd(this.khachhangct.getNgaycapCmnd());
                khachhangttList.setIdNoicapcmnd(this.khachhangct.getIdNoicapcmnd());
                khachhangttList.setGiayPlx(this.khachhangct.getGiayPlx());
                khachhangttList.setNgaycapGplx(this.khachhangct.getNgaycapGplx());
                khachhangttList.setIdNoicapgplx(this.khachhangct.getIdNoicapgplx());
                khachhangttList.setPassport(this.khachhangct.getPassport());
                khachhangttList.setDidong1(this.khachhangct.getDidong1());
                khachhangttList.setDidong2(this.khachhangct.getDidong2());
                khachhangttList.setDienthoaiBan(this.khachhangct.getDienthoaiBan());
                khachhangttList.setSonhaThuongtru(this.khachhangct.getSonhaThuongtru());
                khachhangttList.setQuanThuongtru(this.khachhangct.getQuanThuongtru());
                khachhangttList.setThanhphoThuongtru(this.khachhangct.getThanhphoThuongtru());
                khachhangttList.setMakerId(userid);
                khachhangttList.setNgayKhoitao(new Date());
                khachhangttList.setDuyet("Y");
                khachhangttList.setIdNvDuyet(userid);
                khachhangttList.setNgayduyet(new Date());
                khachhangttList.setDachuanhoa("Y");
                khachhangttList.setNgayChuanhoa(new Date());
                khachhangttList.setIdNvChuanhoa(userid);
                khachhangttList.setIdValidity("O");
                entitymanager.persist(khachhangttList);
		entitymanager.getTransaction().commit();
                entitymanager.close();
                resetvalue();
                return "timkiemkhachhang" + "?faces-redirect=true";
         } catch (Exception e) {
                
             return null;
       }
      
       }
       else{
          isDisKhtrung=false; 
          FacesMessage message = new FacesMessage("Khách hàng này đã tồn tại với mã khách hàng!!!"+khachhangtrung.getIdKhachhang() ,"" );
          FacesContext.getCurrentInstance().addMessage(null, message); 
          return null; 
           
       }
       
          
        
    } 
    //Su kien thuc hien truoc khi LoadPage .
     
       public void isResetWhenPageLoad(ComponentSystemEvent event){

     
          this.khachhangct=null;
          this.dskh=null; 
           
   
      } 
       
       
       private Boolean batloicmnd(VwKhachhangttListWeb khachhangttListWeb){
           
           
           
           //Kiểm tra số CMND . 
       if (khachhangttListWeb.getSochungminh() !=null )
       {
           // Tao giao dich . 
           
           EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
           EntityManager entitymanager = emfactory.createEntityManager();
           Query query=null;
           query=entitymanager.createNamedQuery("VwKhachhangttListWeb.findBySochungminh");
           query.setParameter("sochungminh",khachhangttListWeb.getSochungminh());
           List kq =query.getResultList();
           if(kq.size()>0)
           {
               khachhangtrung=new VwKhachhangttListWeb();
               khachhangtrung=(VwKhachhangttListWeb) kq.get(0);
               if(khachhangtrung.getIdKhachhang()!=null ){
                   if (khachhangtrung.getIdKhachhang().equalsIgnoreCase(khachhangttListWeb.getIdKhachhang()))
                   {
                        return true ;
                       
                   }
                   else{
                       
                        return false ;
                   }
               }
               else{
                   return true;
               }
   
               
           }
           else{
               
               return true ;
           }
          
       }
       else{
           if (khachhangttListWeb.getPassport()!=null){
               
              EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
              EntityManager entitymanager = emfactory.createEntityManager();
              Query query=null;
              query=entitymanager.createNamedQuery("VwKhachhangttListWeb.findByPassport");
              query.setParameter("passport",khachhangttListWeb.getPassport());
               List<VwKhachhangttListWeb> kq = new ArrayList<VwKhachhangttListWeb>();
                       kq=query.getResultList();
               if(kq.size()>0)
               {
                   khachhangtrung=new VwKhachhangttListWeb();
                   khachhangtrung=(VwKhachhangttListWeb) kq.get(0);
                   return false ; 
               }  
               
           }
           else{
               
                return false ; 
               
           }
           
           
           
       }
        
           
           
           return true;
       }
       
       // Lay danh sach thanh pho theo dk tim kiem .
       
     public  String xacnhanchuyendiaban(String makhachhang ,int dsgiaodich ) throws SQLException{
        
         
        VwKhachhangttListWeb chitietkhachhang=new VwKhachhangttListWeb();
        List<CityList> dsthanhpho=new ArrayList<>();
        List<DistrictList> dsquanhuyen=new ArrayList<>();
        List<GiaytoList> sdgiatotuythan= new ArrayList<>();
        List<VwDsNhnavienctWeb> dsNhnaviencts= new ArrayList<>();
        String loainvchitra=null;
        VwDsgiaodichBosungttMb chitietgiaodich=new VwDsgiaodichBosungttMb() ;
        String userid=SessionBean.getUserId();
        String chinhanh=SessionBean.getChinhanhId();
        dsthanhpho=FunctionLocal.laydscity();
        dsquanhuyen=FunctionLocal.dsquanhuyen(chitietkhachhang.getThanhphoThuongtru());
        this.timgiaodich();
        if(dsgiaodich >0)
        {
        sdgiatotuythan=FunctionLocal.laydsgiayto();
//        dsNhnavienctWeb=FunctionLocal.layttuserdangnhap(userid, chinhanh);
        if(chitietgiaodich.getIdDiadiemchitra().equalsIgnoreCase("TQ")){
            loainvchitra="N";
        }
        else{
            
            loainvchitra="Y";
        }
       // loainvct=dsNhnavienctWeb.getUsercn();
        dsNhnaviencts=FunctionLocal.laydsNVCHITRA(loainvchitra, chinhanh);
        chitietgiaodich.setIdCtTuythan("001");
        chitietgiaodich.setSoCtTuythan(khachhangct.getSochungminh());
        chitietgiaodich.setNgaycap(khachhangct.getNgaycapCmnd());
        chitietgiaodich.setIdNoicap(khachhangct.getIdNoicapcmnd());
        chitietgiaodich.setIdNvChitra(userid);
        
        return "chitietkhachhang" + "?faces-redirect=true";
        }
        else{
            
            return null;
        }
        
    }   
       
       
 

    // Khai bao get/set .

    public String getLoaitkdulieu() {
        return loaitkdulieu;
    }

    public void setLoaitkdulieu(String loaitkdulieu) {
        this.loaitkdulieu = loaitkdulieu;
    }
       
  

    public Boolean getIsDisxoakh() {
        return isDisxoakh;
    }

    public void setIsDisxoakh(Boolean isDisxoakh) {
        this.isDisxoakh = isDisxoakh;
    }
       
       
       

    public List<CityList> getDscityselect() {
        return dscityselect;
    }

    public void setDscityselect(List<CityList> dscityselect) {
        this.dscityselect = dscityselect;
    }

 
    public String getDktimkiemchuagoikhach() {
        return dktimkiemchuagoikhach;
    }

    public void setDktimkiemchuagoikhach(String dktimkiemchuagoikhach) {
        this.dktimkiemchuagoikhach = dktimkiemchuagoikhach;
    }

       
       
    public VwKhachhangttListWeb getKhachhangtrung() {
        return khachhangtrung;
    }

    public void setKhachhangtrung(VwKhachhangttListWeb khachhangtrung) {
        this.khachhangtrung = khachhangtrung;
    }

    public Boolean getIsDisKhtrung() {
        return isDisKhtrung;
    }

    public void setIsDisKhtrung(Boolean isDisKhtrung) {
        this.isDisKhtrung = isDisKhtrung;
    }
       
 
    public VwDshosoGiaophieuTodayWeb getGiaodichchuaxacnhan() {
        return giaodichchuaxacnhan;
    }

    public Boolean getKhoasobn() {
        return khoasobn;
    }

    public void setKhoasobn(Boolean khoasobn) {
        this.khoasobn = khoasobn;
    }
    
    
    
    public void setGiaodichchuaxacnhan(VwDshosoGiaophieuTodayWeb giaodichchuaxacnhan) {
        this.giaodichchuaxacnhan = giaodichchuaxacnhan;
    }

    public List<VwDshosoGiaophieuTodayWeb> getDshosoGiaophieuTodayWebs() {
        return dshosoGiaophieuTodayWebs;
    }

    public void setDshosoGiaophieuTodayWebs(List<VwDshosoGiaophieuTodayWeb> dshosoGiaophieuTodayWebs) {
        this.dshosoGiaophieuTodayWebs = dshosoGiaophieuTodayWebs;
    }

    public List<VwXemdulieutkkhMaster> getDskh() {
        return dskh;
    }

    public void setDskh(List<VwXemdulieutkkhMaster> dskh) {
        this.dskh = dskh;
    }

    public List<VwXemdulieutkkhMaster> getDskhfilter() {
        return dskhfilter;
    }

    public void setDskhfilter(List<VwXemdulieutkkhMaster> dskhfilter) {
        this.dskhfilter = dskhfilter;
    }
    
    

    

    public String getMakhachhangtk() {
        return makhachhangtk;
    }

    public void setMakhachhangtk(String makhachhangtk) {
        this.makhachhangtk = makhachhangtk;
    }

    public String getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(String loaitk) {
        this.loaitk = loaitk;
    }

    public VwKhachhangttListWeb getKhachhangct() {
        return khachhangct;
    }

    public void setKhachhangct(VwKhachhangttListWeb khachhangct) {
        this.khachhangct = khachhangct;
    }

    public List<VwTkttBiennhanMaster> getDsgd() {
        return dsgd;
    }

    public void setDsgd(List<VwTkttBiennhanMaster> dsgd) {
        this.dsgd = dsgd;
    }

   
    public VwDsgiaodichBosungttMb getGiaodichct() {
        return giaodichct;
    }

    public void setGiaodichct(VwDsgiaodichBosungttMb giaodichct) {
        this.giaodichct = giaodichct;
    }

    public String getSobntk() {
        return sobntk;
    }

    public void setSobntk(String sobntk) {
        this.sobntk = sobntk;
    }

    public List<DistrictList> getDsquanhuyen() {
        return dsquanhuyen;
    }

    public void setDsquanhuyen(List<DistrictList> dsquanhuyen) {
        this.dsquanhuyen = dsquanhuyen;
    }

    public List<CityList> getDscity() {
        return dscity;
    }

    public void setDscity(List<CityList> dscity) {
        this.dscity = dscity;
    }

    public KhachhangttList getKhachhangttList() {
        return khachhangttList;
    }

    public void setKhachhangttList(KhachhangttList khachhangttList) {
        this.khachhangttList = khachhangttList;
    }

    public List<GiaytoList> getDsgiayto() {
        return dsgiayto;
    }

    public void setDsgiayto(List<GiaytoList> dsgiayto) {
        this.dsgiayto = dsgiayto;
    }

    public List<VwDsNhnavienctWeb> getDsNhnavienctWebs() {
        return dsNhnavienctWebs;
    }

    public void setDsNhnavienctWebs(List<VwDsNhnavienctWeb> dsNhnavienctWebs) {
        this.dsNhnavienctWebs = dsNhnavienctWebs;
    }

    public VwDsNhnavienctWeb getDsNhnavienctWeb() {
        return dsNhnavienctWeb;
    }

    public void setDsNhnavienctWeb(VwDsNhnavienctWeb dsNhnavienctWeb) {
        this.dsNhnavienctWeb = dsNhnavienctWeb;
    }

    public String getLoainvct() {
        return loainvct;
    }

    public void setLoainvct(String loainvct) {
        this.loainvct = loainvct;
    }

    public List<VwXemdulieutkMaster> getDsgdfilter() {
        return dsgdfilter;
    }

    public void setDsgdfilter(List<VwXemdulieutkMaster> dsgdfilter) {
        this.dsgdfilter = dsgdfilter;
    }

    
    public VwXemdulieutkMaster getChitietbn() {
        return chitietbn;
    }

    public void setChitietbn(VwXemdulieutkMaster chitietbn) {
        this.chitietbn = chitietbn;
    }

    public VwXemdulieutkkhMaster getChitietkhachhang() {
        return chitietkhachhang;
    }

    public void setChitietkhachhang(VwXemdulieutkkhMaster chitietkhachhang) {
        this.chitietkhachhang = chitietkhachhang;
    }

 
    
    
    
    
    public KhachhangManagedBean() {
    }
    
}
