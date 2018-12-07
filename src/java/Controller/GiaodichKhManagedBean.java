 
package Controller;

import static ConnectBean.Provider.DADABASEVW;
import EntitiesBean.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Global.*;
import java.util.ArrayList;
 
@Named(value = "giaodichKhManagedBean")
@SessionScoped
public class GiaodichKhManagedBean implements Serializable {

 // Khai bao bien List.
    private List<VwKhachhangttListWeb> dskh;
    private List<VwDsgiaodichnonameTngayWeb> dsgd=new  ArrayList<VwDsgiaodichnonameTngayWeb>();
    private List<DistrictList> dsquanhuyen; 
    private List<CityList> dscity ;
    private List<GiaytoList> dsgiayto ;
    private List<VwDsNhnavienctWeb> dsNhnavienctWebs;
    
    
 // Khai bao bien Model.
    private VwKhachhangttListWeb khachhangct;
    private KhachhangttList khachhangttList= new KhachhangttList();
    private VwDsgiaodichnonameTngayWeb giaodichct=new VwDsgiaodichnonameTngayWeb();
    private VwDsNhnavienctWeb dsNhnavienctWeb=new VwDsNhnavienctWeb();
    private KieuhoiList kieuhoiList = new KieuhoiList();
    private KieuhoiListPK kieuhoiListPK= new KieuhoiListPK();
    private VwDshosoGiaophieuTodayWeb giaodichhschuagoict= new VwDshosoGiaophieuTodayWeb();
    
 // Khai bao bien don .
    
    private String makhachhangtk  ;
    private String sobntk =null ;
    private String loaitk  ;
    private String loainvact=null;
    

// Ham insert du lieu
// Ham xoa du lieu .
// Ham cap nhat du lieu
//Ham lay du lieu.
 public void showdatagall(){
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createQuery("SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE v.idChinhanh = :idChinhanh AND v.nhanviencallnoname =:nhanviencallnoname ");
      query.setParameter("idChinhanh", chinhanh);
      query.setParameter("nhanviencallnoname", userid);        
      dsgd=query.getResultList();
              
    
}
 
  public void timgiaodich(){
      
     String chinhanh=SessionBean.getChinhanhId();
     String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      loaitk="00001";
     
       switch (this.loaitk){
                 case "00001" : 
                     query=entitymanager.createQuery("SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE   v.sobn=:sobn");
                     break;
                 case "00002" : 
                     query=entitymanager.createQuery("SELECT v FROM VwDsgiaodichnonameTngayWeb v WHERE   v.sobn=:sobn");
                     break;    

                       } 
     // query=entitymanager.createNamedQuery("VwDsgiaodichBosungttMb.findBySobn");
     Long sob = Long.parseLong(makhachhangtk);
     query.setParameter("sobn", sob);

    //  query.setParameter("idChinhanh", chinhanh);
     // query.setParameter("nhanviencallnoname", userid);    
    //  query.setParameter("sobn", sob);
      dsgd=query.getResultList();
              
    
}
  
  
  
 

    
// Get/Set du lieu

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

    public VwDsgiaodichnonameTngayWeb getGiaodichct() {
        return giaodichct;
    }

    public void setGiaodichct(VwDsgiaodichnonameTngayWeb giaodichct) {
        this.giaodichct = giaodichct;
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

    public List<VwDsgiaodichnonameTngayWeb> getDsgd() {
        return dsgd;
    }

    public void setDsgd(List<VwDsgiaodichnonameTngayWeb> dsgd) {
        this.dsgd = dsgd;
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

    public GiaodichKhManagedBean() {
    }
    
}
