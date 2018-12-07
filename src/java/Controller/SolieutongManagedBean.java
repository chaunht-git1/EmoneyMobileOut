 
package Controller;

import static ConnectBean.Provider.DADABASEVW;
import EntitiesBean.VwDsgiaodichnonameTngayWeb;
import EntitiesBean.VwDshosoChuagiaophieuWeb;
import EntitiesBean.VwDshosoGiaophieuTodayWeb;
import EntitiesBean.VwGiaodichMobileImportWeb;
import Global.SessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ComponentSystemEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author TamChauDAMTC
 */
@Named(value = "solieutongManagedBean")
@SessionScoped
public class SolieutongManagedBean implements Serializable {

    
    private  List<VwGiaodichMobileImportWeb> dshosochoimp = new ArrayList<VwGiaodichMobileImportWeb>();
    private List<VwDshosoGiaophieuTodayWeb> dshosoGiaophieuTodayWebs =new ArrayList<>();
    private List<VwDsgiaodichnonameTngayWeb> dsgddaxacnhannoname=new  ArrayList<VwDsgiaodichnonameTngayWeb>();
    private Number shschuagiaophieu=0;
    
  private void getsolieudaxacnhanttkhachhang(){
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
      dsgddaxacnhannoname=query.getResultList();
              
    
}   
    
  private void getsolieutong(){
        
      String chinhanh=SessionBean.getChinhanhId();
      String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createNamedQuery("VwGiaodichMobileImportWeb.findByIdNvChitra");
      query.setParameter("idNvChitra", userid);      
      dshosochoimp=query.getResultList(); 

      entitymanager.close();
    /*  if (dsTranSacWeb.size()==0)
      {
        FacesMessage message = new FacesMessage("Không có hồ sơ phát sinh!!!" ,"" );
        FacesContext.getCurrentInstance().addMessage(null, message);
      }
            */
        
    }
       
   private void getsolieuchgoikhach(){
       
          String userid=SessionBean.getUserId();
          EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
          EntityManager entitymanager = emfactory.createEntityManager();
          Query query=null;
          query=entitymanager.createNamedQuery("VwDshosoGiaophieuTodayWeb.findByIdNvChitra");
          query.setParameter("idNvChitra",userid);
          dshosoGiaophieuTodayWebs=query.getResultList();
 
    }
   
   
      public void lammoiIndexChinha(){
 
          this.getsolieutong();
          this.getsolieuchgoikhach();
          this.getsolieudaxacnhanttkhachhang();
          
      } 
       
     public void isResetWhenPageLoad(ComponentSystemEvent event){
 
          this.getsolieutong();
          this.getsolieuchgoikhach();
          this.getsolieudaxacnhanttkhachhang();
          
      } 
     
     
       public void lammoiIndexChiquay(){
 
         shschuagiaophieu=this.getsotongchuagiaophieucn();
          
      } 
       
   public Number getsotongchuagiaophieucn(){
 
      String chinhanh=SessionBean.getChinhanhId();
      String userid=SessionBean.getUserId();
      // Tao Entity .
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(DADABASEVW);
      EntityManager entitymanager = emfactory.createEntityManager();
      //Tao Query .
      Query query = null;
      query=entitymanager.createQuery("SELECT v FROM VwDshosoChuagiaophieuWeb v WHERE v.idChinhanh = :idChinhanh  ");
      query.setParameter("idChinhanh",chinhanh);      
      List<VwDshosoChuagiaophieuWeb> dsgdchuagiao=query.getResultList();
      entitymanager.close();
     
      return dsgdchuagiao.size();
     
    
}
   
   

    public Number getShschuagiaophieu() {
        return shschuagiaophieu;
    }

    // Get set so lieu
    public void setShschuagiaophieu(Number shschuagiaophieu) {
        this.shschuagiaophieu = shschuagiaophieu;
    }

    public List<VwDsgiaodichnonameTngayWeb> getDsgddaxacnhannoname() {
        return dsgddaxacnhannoname;
    }

    public void setDsgddaxacnhannoname(List<VwDsgiaodichnonameTngayWeb> dsgddaxacnhannoname) {
        this.dsgddaxacnhannoname = dsgddaxacnhannoname;
    }
     
     
     
     
       
     public List<VwDshosoGiaophieuTodayWeb> getDshosoGiaophieuTodayWebs() {
        return dshosoGiaophieuTodayWebs;
    }

   
     
     
    public void setDshosoGiaophieuTodayWebs(List<VwDshosoGiaophieuTodayWeb> dshosoGiaophieuTodayWebs) {
        this.dshosoGiaophieuTodayWebs = dshosoGiaophieuTodayWebs;
    }

    public List<VwGiaodichMobileImportWeb> getDshosochoimp() {
        return dshosochoimp;
    }

    public void setDshosochoimp(List<VwGiaodichMobileImportWeb> dshosochoimp) {
        this.dshosochoimp = dshosochoimp;
    }
    
}
