 
package DaoDanhmuc;

import Entitieskhout.KhachhangttListTemp;
import Entitieskhout.VwKhachhangttListTemp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

 
public class VwKhachhangttListTempDao  {
 
     EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DatabaseView");
     EntityManager em = emfactory.createEntityManager();
     
 public List<VwKhachhangttListTemp> findAll(  String userid,String loaitk ) {
        List<VwKhachhangttListTemp> dsKq = new ArrayList<>();
 
        try { 
          Query query = null;
          if(loaitk.equalsIgnoreCase("all"))
          {
             query=em.createNamedQuery("VwKhachhangttListTemp.findByUserId", List.class);
             query.setParameter("userId", userid);
          }
          else{
             query=em.createNamedQuery("VwKhachhangttListTemp.findByUserIdDch", List.class);
             query.setParameter("userId", userid);
             query.setParameter("dachuanhoa", loaitk);
          }
          dsKq =  query.getResultList();
          em.close();
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
    
    public  boolean capnhatthongtinkh(VwKhachhangttListTemp khachhang){
       //Tao thong tin cap nhat
        VwKhachhangttListTemp kq= new VwKhachhangttListTemp();
         KhachhangttListTemp khachhangttListTemp = em.getReference(KhachhangttListTemp.class, khachhang.getIdCode());
         if(khachhangttListTemp==null)
         {
           return false;
         }
         else{
             em.getTransaction().begin();
             khachhangttListTemp.setDidong1(khachhang.getDidong1());
             khachhangttListTemp.setHoten(khachhang.getHoten());
             khachhangttListTemp.setDachuanhoa("Y");
             khachhangttListTemp.setSonhaHientai(khachhang.getSonhaHientai());
             khachhangttListTemp.setTpHientai(khachhang.getTpHientai());
             khachhangttListTemp.setSochungminh(khachhang.getSochungminh());
             khachhangttListTemp.setNgaycap(khachhang.getNgaycapCmnd());
             khachhangttListTemp.setIdNoicapcmnd(khachhang.getIdNoicapcmnd());
             khachhangttListTemp.setGiayPlx(khachhang.getGiayPlx());
             em.merge(khachhang);
             em.getTransaction().commit();
             return true;
         }
         
    }
  
    
}
