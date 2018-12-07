 
package Controller;

import ConnectBean.ConnectionProvider;
import static ConnectBean.Provider.DADABASEVW;
import EntitiesBean.*;
import LocalFuntionGlobal.FunctionLocal;
import Global.SessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
 
@Named(value = "qlchitraManagedBean")
@SessionScoped
public class QlchitraManagedBean implements Serializable {

    
     // Khai bao bien List.
    private List<VwKhachhangttListWeb> dskh;
    private List<VwQlqhscgiaothDoitacWeb> dsgdchuaxnqlq=new  ArrayList<VwQlqhscgiaothDoitacWeb>();
    private List<DistrictList> dsquanhuyen; 
    private List<CityList> dscity ;
    private List<GiaytoList> dsgiayto ;
    private List<VwDsNhnavienctWeb> dsNhnavienctWebs;
    private List<VwDoitacGpWeb> dsdoitacGp;
    private List<VwDshosoDagiaophieuWeb> dsgddagiao=new ArrayList<VwDshosoDagiaophieuWeb>();
    private List<VwDshosoDagiaophieuNv> dsgddagiaonv=new ArrayList<VwDshosoDagiaophieuNv>();
    
     // Khai bao bien Model.
    private VwKhachhangttListWeb khachhangct;
    private VwQlqhscgiaothDoitacWeb  gdchuaxnqlq=new  VwQlqhscgiaothDoitacWeb() ;
    private KhachhangttList khachhangttList= new KhachhangttList();
    private VwDshosoChuagiaophieuWeb giaodichchuagiaoct=new VwDshosoChuagiaophieuWeb();
    private VwDsNhnavienctWeb dsNhnavienctWeb=new VwDsNhnavienctWeb();
    private KieuhoiList kieuhoiList = new KieuhoiList();
    private KieuhoiListPK kieuhoiListPK= new KieuhoiListPK();
   
    private VwDshosoDagiaophieuNv gddagiaonv=new VwDshosoDagiaophieuNv();
    
     // Khai bao bien don .
    
    private String makhachhangtk  ;
    private String sobntk =null ;
    private String loaitk=null;
    private String loainvact=null;
    private String iddoitactk =null;
    private String nvchitratk =null;
    private Boolean isReset=true;
    
    
    
      
     public  String  insertgiaodichqlqdoitac() throws SQLException{
        String userid=SessionBean.getUserId();
        String idChinhanh =SessionBean.getChinhanhId();
                       isReset=false;
        
          try {
            String ketqua;
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ?:=KH.PKS_QLQ.FUNC_INSERT_DOTNEW(?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.DATE);
            stm.setString(2, gdchuaxnqlq.getIdNvChitra());
            stm.setDate(3, (java.sql.Date) new Date());
            stm.setString(4, userid);
            stm.setString(5, idChinhanh);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
            return ketqua;

        } catch (SQLException ex) {

          //  Bean.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return "";

        }
      
       
        
        
    }   
    

 public  void laynvchitra(VwDshosoChuagiaophieuWeb chuagiaophieuWeb) throws SQLException{
     
     
     nvchitratk=FunctionLocal.nhanvienchitrafromqhuyen(chuagiaophieuWeb.getIdCity(), chuagiaophieuWeb.getIdDistrict());
     giaodichchuagiaoct.setIdNvChitra(nvchitratk);
 }    
    
 
  public  void laytygiamoi() throws SQLException{
     
    if(giaodichchuagiaoct.getIdLoaitienchitra().equalsIgnoreCase("VND"))
 {
     Number tygia=FunctionLocal.laytygiachitra(giaodichchuagiaoct.getIdLoaitiengoi(), "002");
     giaodichchuagiaoct.setTygia((BigDecimal) tygia);
     BigDecimal sotien=giaodichchuagiaoct.getSotiengoi();
     double thanhtien= sotien.doubleValue()*tygia.doubleValue();
     giaodichchuagiaoct.setThanhtien(new BigDecimal(thanhtien));
 }   
    
 } 
    
   
 public  void laydsquanhuyen(VwDshosoChuagiaophieuWeb chuagiaophieuWeb) throws SQLException{
       
         dsquanhuyen=FunctionLocal.dsquanhuyen(chuagiaophieuWeb.getIdCity());
 } 
    
    
public  void getdatadefault() throws SQLException{
    
 String idchinhanh=SessionBean.getChinhanhId();
 dsquanhuyen=FunctionLocal.dsquanhuyen("002");
 dscity=FunctionLocal.laydscity();
 dsNhnavienctWebs=FunctionLocal.laydsNVCHITRA("Y",idchinhanh );
 //this.laytygiamoi();
 
 //return "chitietgiaophieu" + "?faces-redirect=true";    
 
}

     
public String chuyentranginsertqlqdoitacnv(){

 return "qlchitrainsertqlqdoitac" + "?faces-redirect=true";   
 
}
    
        
public String chuyentranginsertqlqdoitacnvchitiet(){
    
 this.showdatagchuagpall();
 return "dshosogiaophieuchinhanh" + "?faces-redirect=true";    
}

 public void showdatagchuagptheodk( ){
   // if(  this.isReset)
  //   {
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      if (loaitk==null)
      {
        loaitk="00001";
      }
      
       switch (loaitk) {
            case "00001":  
                     query=entitymanager.createQuery("SELECT v FROM VwDshosoChuagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh  ");
                     query.setParameter("idChinhanh",chinhanh); 
                     break;
            case "00002": 
                     query=entitymanager.createQuery("SELECT v FROM VwDshosoChuagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh AND (v.solanin =0 OR v.solanin IS NULL)  ");
                     query.setParameter("idChinhanh",chinhanh); 
                     
                     break;
            case "00003": 
                     query=entitymanager.createQuery("SELECT v FROM VwDshosoChuagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh  AND v.solanin > 0");
                     query.setParameter("idChinhanh",chinhanh); 
                     break;
 
        }

      dsgdchuaxnqlq=query.getResultList();
   
 }
    
    
 public void showdatagchuagpall(){
     
   // if(  this.isReset)
   //{
     loaitk="00001";
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createQuery("SELECT v FROM VwQlqhscgiaothDoitacWeb v WHERE v.idChinhanh = :idChinhanh  ");
      query.setParameter("idChinhanh",chinhanh);      
      dsgdchuaxnqlq=query.getResultList();
      // Dong ket noi .
      entitymanager.close();
      this.isReset=false;
    // }
     
    
}
 
 
 
 public  void  timgiaodich(){
     // String abc="123"; 
    giaodichchuagiaoct = new VwDshosoChuagiaophieuWeb();
     EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
     EntityManager entitymanager = emfactory.createEntityManager();
     Query query = null;
     makhachhangtk="00001";
     
       switch (this.loaitk){
                 case "00001" : 
                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findBySobn");
                     Long sob = Long.parseLong(makhachhangtk);
                     query.setParameter("sobn", sob);
                     break;
                 case "00002" : 
                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findByMaNguoinhan");
                     query.setParameter("sobn", "");
                     break;    
                 case "00003" : 
                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findByIdDoitac");
                     query.setParameter("sobn", "");
                     break;  
                 case "00004" : 
                     query = entitymanager.createNamedQuery("VwDshosoChuagiaophieuWeb.findByIdLoaitienchitra");
                     query.setParameter("sobn", "");
                     break;  
                       } 
    
    
     //  dsgd=query.getResultList();
    
     try {
         dsgdchuaxnqlq = query.getResultList();
     } catch (Exception e) {
     }
           
   
    }  
 
 
 // Phần dành cho đã giao phiếu .
 
 public void showdatagdagpall(){
     
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createQuery("SELECT v FROM VwDshosoDagiaophieuNv v WHERE v.idChinhanh = :idChinhanh  ");
      query.setParameter("idChinhanh",chinhanh);      
      dsgddagiaonv=query.getResultList();
      
      
 
      
      // Dong ket noi .
      entitymanager.close();
      
    
}
 
 
 public String chitiethsgiaophieutheonv(){
    
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createQuery("SELECT v FROM VwDshosoDagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh  AND v.idNvChitra=:idNvchitra ");
      query.setParameter("idChinhanh",chinhanh);   
      query.setParameter("idNvchitra", gddagiaonv.getIdNvChitra());
      dsgddagiao=  query.getResultList();
    
 return "dschitietdagiaophieutheonv" + "?faces-redirect=true";    
 
}

 
    
// Get/Set du lieu

    public VwQlqhscgiaothDoitacWeb getGdchuaxnqlq() {
        return gdchuaxnqlq;
    }

    public void setGdchuaxnqlq(VwQlqhscgiaothDoitacWeb gdchuaxnqlq) {
        this.gdchuaxnqlq = gdchuaxnqlq;
    }
 
 
 
 

    public VwDshosoDagiaophieuNv getGddagiaonv() {
        return gddagiaonv;
    }

    public void setGddagiaonv(VwDshosoDagiaophieuNv gddagiaonv) {
        this.gddagiaonv = gddagiaonv;
    }
 
 
 

    public List<VwDshosoDagiaophieuNv> getDsgddagiaonv() {
        return dsgddagiaonv;
    }

    public void setDsgddagiaonv(List<VwDshosoDagiaophieuNv> dsgddagiaonv) {
        this.dsgddagiaonv = dsgddagiaonv;
    }
 
 

    public List<VwDshosoDagiaophieuWeb> getDsgddagiao() {
        return dsgddagiao;
    }

    public void setDsgddagiao(List<VwDshosoDagiaophieuWeb> dsgddagiao) {
        this.dsgddagiao = dsgddagiao;
    }
 
 

    public String getIddoitactk() {
        return iddoitactk;
    }

    public void setIddoitactk(String iddoitactk) {
        this.iddoitactk = iddoitactk;
    }

 
 
    public List<VwDoitacGpWeb> getDsdoitacGp() {
        return dsdoitacGp;
    }

    public void setDsdoitacGp(List<VwDoitacGpWeb> dsdoitacGp) {
        this.dsdoitacGp = dsdoitacGp;
    }

 
 
    public String getMakhachhangtk() {
        return makhachhangtk;
    }

    public void setMakhachhangtk(String makhachhangtk) {
        this.makhachhangtk = makhachhangtk;
    }

    public String getSobntk() {
        return sobntk;
    }

    public void setSobntk(String sobntk) {
        this.sobntk = sobntk;
    }

    public String getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(String loaitk) {
        this.loaitk = loaitk;
    }

    public String getLoainvact() {
        return loainvact;
    }

    public void setLoainvact(String loainvact) {
        this.loainvact = loainvact;
    }


    public VwKhachhangttListWeb getKhachhangct() {
        return khachhangct;
    }

    public void setKhachhangct(VwKhachhangttListWeb khachhangct) {
        this.khachhangct = khachhangct;
    }

    public KhachhangttList getKhachhangttList() {
        return khachhangttList;
    }

    public void setKhachhangttList(KhachhangttList khachhangttList) {
        this.khachhangttList = khachhangttList;
    }

    public VwDshosoChuagiaophieuWeb getGiaodichchuagiaoct() {
        return giaodichchuagiaoct;
    }

    public void setGiaodichchuagiaoct(VwDshosoChuagiaophieuWeb giaodichchuagiaoct) {
        this.giaodichchuagiaoct = giaodichchuagiaoct;
    }

    

    public VwDsNhnavienctWeb getDsNhnavienctWeb() {
        return dsNhnavienctWeb;
    }

    public void setDsNhnavienctWeb(VwDsNhnavienctWeb dsNhnavienctWeb) {
        this.dsNhnavienctWeb = dsNhnavienctWeb;
    }

    public KieuhoiList getKieuhoiList() {
        return kieuhoiList;
    }

    public void setKieuhoiList(KieuhoiList kieuhoiList) {
        this.kieuhoiList = kieuhoiList;
    }

    public KieuhoiListPK getKieuhoiListPK() {
        return kieuhoiListPK;
    }

    public void setKieuhoiListPK(KieuhoiListPK kieuhoiListPK) {
        this.kieuhoiListPK = kieuhoiListPK;
    }
    
    
    public List<VwKhachhangttListWeb> getDskh() {
        return dskh;
    }    

    public void setDskh(List<VwKhachhangttListWeb> dskh) {
        this.dskh = dskh;    
    }

    public List<VwQlqhscgiaothDoitacWeb> getDsgdchuaxnqlq() {
        return dsgdchuaxnqlq;
    }

    public void setDsgdchuaxnqlq(List<VwQlqhscgiaothDoitacWeb> dsgdchuaxnqlq) {
        this.dsgdchuaxnqlq = dsgdchuaxnqlq;
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

    
    
    public QlchitraManagedBean() {
    }
    
}
