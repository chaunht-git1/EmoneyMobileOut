 
package DatabaseDao;

import EntitiesBean.VwHosotongTondongNvweb;
import EntitiesBean.VwKshbHosonvchinhaAll;
import LocalModel.UserModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

 
 
public class NhanvienListDAO {
    
    
      
 public static List<UserModel> dsnvchinhagiaophieu(String chinhanh ) {
        List<VwKshbHosonvchinhaAll> dskqtam=new ArrayList<>();
        List<UserModel> dsKq=new ArrayList<>();
      
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.idChinhanh=:chinhanh  ");
          query.setParameter("chinhanh", chinhanh);
          dskqtam =  query.getResultList();
          
            for (int i = 0; i < dskqtam.size(); i++) {
                
             UserModel kqt= new UserModel();   
             kqt.setUserid(dskqtam.get(i).getIdNvChitra());
             kqt.setUsername(dskqtam.get(i).getHoten());
             dsKq.add(kqt);
            }
          
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }


  public static List<UserModel> dsnvchinhatondongtrangthai(String chinhanh,String loaitrangthai ) {
        List<VwKshbHosonvchinhaAll> dskqtam=new ArrayList<>();
        List<UserModel> dsKq=new ArrayList<>();
      
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwTondongNvAllWeb v WHERE v.idChinhanh=:chinhanh AND v.hoanthanh=:loaitrangthai  ");
          query.setParameter("chinhanh", chinhanh);
          query.setParameter("loaitrangthai", loaitrangthai);
          dskqtam =  query.getResultList();
          
            for (int i = 0; i < dskqtam.size(); i++) {
                
             UserModel kqt= new UserModel();   
             kqt.setUserid(dskqtam.get(i).getIdNvChitra());
             kqt.setUsername(dskqtam.get(i).getHoten());
             dsKq.add(kqt);
            }
          
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
      
  public static List<UserModel> dsnvchinhagiaophieutrangthai(String chinhanh,String loaitrangthai ) {
        List<VwHosotongTondongNvweb> dskqtam=new ArrayList<>();
        List<UserModel> dsKq=new ArrayList<>();
      
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwHosotongTondongNvweb v WHERE v.idChinhanh=:chinhanh AND v.hoanthanh=:loaitrangthai  ");
          query.setParameter("chinhanh", chinhanh);
          query.setParameter("loaitrangthai", loaitrangthai);
          dskqtam =  query.getResultList();
          
            for (int i = 0; i < dskqtam.size(); i++) {
                
             UserModel kqt= new UserModel();   
             kqt.setUserid(dskqtam.get(i).getIdNvChitra());
             kqt.setUsername(dskqtam.get(i).getHoten());
             dsKq.add(kqt);
            }
          
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
   
    
}
 
 


