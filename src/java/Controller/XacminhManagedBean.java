 
package Controller;

import EntitiesBean.SmtbDanhmucList;
import EntitiesBean.VwDmNoteListWeb;
import EntitiesBean.VwTondongNvAllWeb;
import EntitiesBean.VwHosotongTondongNvweb;
import LocalModel.XacminhModel;
import LocalFuntionGlobal.HamUserAll;
import LocalModel.ChinhanhList;
import LocalModel.UserModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.primefaces.event.SelectEvent;
import DatabaseDao.XacminhDAO;
import Global.SessionBean;
import java.sql.SQLException;

 
@Named(value = "xacminhManagedBean")
@SessionScoped
public class XacminhManagedBean implements Serializable {
    
    
  private List<ChinhanhList> listchinhanh= new ArrayList<>();
  private  List<UserModel> listusermdel= new  ArrayList<>();  
  private List<VwHosotongTondongNvweb>  listhskiemtranvall= new ArrayList<VwHosotongTondongNvweb>();
  private List<VwHosotongTondongNvweb> listhskiemtranv= new ArrayList<>();
  private List<VwTondongNvAllWeb>  listtondongnvallwebs= new ArrayList<VwTondongNvAllWeb>();
  private List<VwTondongNvAllWeb>  listtondongnvallwebsall= new ArrayList<VwTondongNvAllWeb>();
  private List<SmtbDanhmucList> listdanhmuc= new ArrayList<>();
  private List<VwDmNoteListWeb> listlydoxacminh= new ArrayList<>();
    
  private XacminhModel  xacminh= new  XacminhModel();
     
  private  ChinhanhList chinhanhList= new ChinhanhList();
  private  VwTondongNvAllWeb hosotongTondongNvweb= new VwTondongNvAllWeb();
  private  String tencntimkiem=null ;
  private  String macntimkiem=null ;
  private  String tennvchitra=null ;
  private  String loaitkdulieu="N";
  private  String maxacminh;
  
  
  
  
  
          
   public String  chuyentrangxacminh() {
       
       
       
      maxacminh=null;
      return   "capnhatxacminhmobile" + "?faces-redirect=true";
      
      
    }
    
  
    public XacminhManagedBean() {
      listchinhanh.clear();
      listdanhmuc.clear();
      listchinhanh=HamUserAll.laydschinhanh();
      listdanhmuc=HamUserAll.laydsdanhmuc("002");
     
  
    }
    
     public void laylydoxacminh( ){
     
        listlydoxacminh=HamUserAll.laydslydoxm(xacminh.getLoaixm(),"VIE");
         
     }
     
     public String  taoxacminhtudshoibao(String sobn) {
       
         try {
          //Lay thong tin
           String chinhanh =SessionBean.getChinhanhId();
           String user = SessionBean.getUserId();
           //String[] parts = tennvchitra.split("-");
           String maxacminh = sobn;
          hosotongTondongNvweb = this.chitietgdxm(chinhanh, user, "N", maxacminh);
          this.timgiaodich(user);
          return   "capnhatxacminhmobile" + "?faces-redirect=true";
         } catch (Exception e) {
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Hồ sơ này không thể nhập thông tin", ""));
             return null;
         }
 
    }
     
     /*public String  taoxacminhtudshoibao() {
    
 
 
          //Lay thong tin
           String chinhanh =SessionBean.getChinhanhId();
           String user = SessionBean.getUserId();
           //String[] parts = tennvchitra.split("-");
           String maxacminh = "";
           hosotongTondongNvweb = this.chitietgdxm(chinhanh, user, "N", maxacminh);
           this.timgiaodich(user);
         
         return   "capnhatxacminhmobile" + "?faces-redirect=true";
          
     
    
}*/
     
    
    public void timgiaodich(String loaixm ){

        xacminh= new XacminhModel();
        xacminh.setId_chinhanh(hosotongTondongNvweb.getIdChinhanh().toString());
        xacminh.setSophieu(hosotongTondongNvweb.getSophieu());
        xacminh.setStt(hosotongTondongNvweb.getStt());
        xacminh.setCodemg(xacminh.getCodemg());
        xacminh.setXmdoitac(hosotongTondongNvweb.getIdDoitac());
        xacminh.setManguoinhan(hosotongTondongNvweb.getMaNguoinhan());
        xacminh.setNvchitra(hosotongTondongNvweb.getIdNvChitra());
        xacminh.setSobiennhan(hosotongTondongNvweb.getSobn().toString());
        xacminh.setSocmnd(hosotongTondongNvweb.getSoCtTuythan());
   
    }  
   public String capnhatxacminh() throws SQLException{
         
          String userid=SessionBean.getUserId();
          XacminhDAO q= new XacminhDAO();
          String kq=q.updatexacminhtodate(xacminh,"", userid);
          if(kq.equalsIgnoreCase("T"))
          {
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật thành công", ""));
              return   "index" + "?faces-redirect=true";
          }
          else{
              
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "CMND không bỏ trống", ""));
              return null;
          }
        
    }  
     
  
   
   public String baocaokhongbiennhan() throws SQLException{
         
          String userid=SessionBean.getUserId();
          if (!xacminh.getSocmnd().equalsIgnoreCase(""))
          {
                XacminhDAO q= new XacminhDAO();
                String kq=q.updatechitratodate(xacminh,"", userid);
                
          if(kq.equalsIgnoreCase("T"))
          {   
              this.tennvchitra=null;
              xacminh=null;
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật   thành công", ""));
      
              return   "index" + "?faces-redirect=true";
          }
          else{
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật không thành công", ""));
      
              return null;
          }
          }
          else{
                this.tennvchitra=null;
                xacminh=null;
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "CMND không thể trống.", ""));
      
                return null;
          }
        
    }  
 
 
    
    
     public  List<VwHosotongTondongNvweb> dsthongkechinhanh(String chinhanh,String trangthai) {
        
        List<VwHosotongTondongNvweb> dsKq;
        dsKq = new ArrayList<>();
       // String chinhanh=SessionBean.getChinhanhId();
        VwTondongNvAllWeb  dmnv = new VwTondongNvAllWeb();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwHosotongTondongNvweb v WHERE v.idChinhanh=:chinhanh AND v.hoanthanh=:trangthai");     
          query.setParameter("chinhanh", chinhanh);
          query.setParameter("trangthai", trangthai);
          dsKq =  query.getResultList();
          return dsKq;
        } catch (Exception e) {
                
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), ""));
                 return null;
        }
    }
  
    public  List<VwTondongNvAllWeb> dsdondongchitiet(String chinhanh,String nvchitra,String loaitk) {
        
        List<VwTondongNvAllWeb> dsKq;
        dsKq = new ArrayList<VwTondongNvAllWeb>();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwTondongNvAllWeb v WHERE v.idChinhanh=:chinhanh AND v.idNvChitra=:nvchitra ");     
          query.setParameter("chinhanh", chinhanh);
          query.setParameter("nvchitra", nvchitra);
          dsKq =  query.getResultList();
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
    
    public  List<VwTondongNvAllWeb> dsxmchitiet(String chinhanh,String nvchitra,String loaitk) {
        
        List<VwTondongNvAllWeb> dsKq;
        dsKq = new ArrayList<VwTondongNvAllWeb>();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwTondongNvAllWeb v WHERE v.idChinhanh=:chinhanh AND v.idNvChitra=:nvchitra AND v.daxacminh= :loaitk");     
          query.setParameter("chinhanh", chinhanh);
          query.setParameter("nvchitra", nvchitra);
          query.setParameter("loaitk", loaitk);
          dsKq =  query.getResultList();
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
   
 
     public  VwTondongNvAllWeb chitietgdxm(String chinhanh,String nvchitra,String loaitk,String sobn) {
        
         VwTondongNvAllWeb dsKq;
        dsKq = new  VwTondongNvAllWeb ();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwTondongNvAllWeb v WHERE v.idChinhanh=:chinhanh AND v.idNvChitra=:nvchitra AND v.sobn=:sobn");     
          query.setParameter("chinhanh", chinhanh);
          query.setParameter("nvchitra", nvchitra);
          long giatril=Long.parseLong(sobn);
          query.setParameter("sobn", giatril);
          dsKq =  (VwTondongNvAllWeb) query.getSingleResult();
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
   
    public void onItemSelect(SelectEvent event) {
     
      String chinhanh =SessionBean.getChinhanhId();
      String user =SessionBean.getUserId();
      String[] parts = tennvchitra.split("-");
      maxacminh=parts[0];
      hosotongTondongNvweb=this.chitietgdxm(chinhanh, user, "N", maxacminh);
      this.timgiaodich(user);
      
    }
  
  
  
     public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        maxacminh=null;
        String chinhanh=SessionBean.getChinhanhId();
        String userid=SessionBean.getUserId();
        listtondongnvallwebsall=this.dsxmchitiet(chinhanh, userid, "N");
        
      for (VwTondongNvAllWeb listchinhanh1 : listtondongnvallwebsall) {
          String chuoitk = listchinhanh1.getSobn().toString();
          if(chuoitk.substring(chuoitk.length()-3).contains(query)){
          results.add(listchinhanh1.getSobn()+ "-" + listchinhanh1.getHoten());
         // maxacminh=listchinhanh1.getSobn().toString();
          //break;
          }
 
      }
      
      if(results.size()==0){
          
           FacesMessage message = new FacesMessage("Không tìm thấy kết quả phù hợp chuổi tìm kiếm" ,"sasasa" );
           FacesContext.getCurrentInstance().addMessage(null, message);
           return null;
          
      }
      
         
        return results;
     
   }
     
   
       
     
     
  public List<String> completeXMText(String query) {
        List<String> results = new ArrayList<>();
        //List<ChinhanhList> list=new ArrayList<>();
      try {
         for (VwDmNoteListWeb listvalue : listlydoxacminh) {
          String chuoitk = listvalue.getIdCode().toUpperCase() + "-" + listvalue.getDescription().toUpperCase();
          if (chuoitk.contains(query.toUpperCase())) {
              results.add(listvalue.getIdCode() + "-" + listvalue.getDescription());
          }
          } 
      } catch (Exception e) {
          String abc=null;
      }
      
         
        return results;
     
   }
  
  
    public void  showttallnv( ) {
        
      listhskiemtranv=null;  
      listhskiemtranv= new ArrayList<>();
      listhskiemtranv= this.dsthongkechinhanh(macntimkiem,loaitkdulieu);
     
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+listhskiemtranv.size(), ""));
      
  }    
    
    public  void resetvalue(){
        
        this.tennvchitra=null;
        hosotongTondongNvweb=null;
        
    }
    

    public VwTondongNvAllWeb getHosotongTondongNvweb() {
        return hosotongTondongNvweb;
    }

    public void setHosotongTondongNvweb(VwTondongNvAllWeb hosotongTondongNvweb) {
        this.hosotongTondongNvweb = hosotongTondongNvweb;
    }
 
    
    
    public List<VwTondongNvAllWeb> getListtondongnvallwebs() {
        return listtondongnvallwebs;
    }

    public void setListtondongnvallwebs(List<VwTondongNvAllWeb> listtondongnvallwebs) {
        this.listtondongnvallwebs = listtondongnvallwebs;
    }
 
    public List<VwHosotongTondongNvweb> getListhskiemtranvall() {
        return listhskiemtranvall;
    }

    public void setListhskiemtranvall(List<VwHosotongTondongNvweb> listhskiemtranvall) {
        this.listhskiemtranvall = listhskiemtranvall;
    }

    public List<VwHosotongTondongNvweb> getListhskiemtranv() {
        return listhskiemtranv;
    }

    public void setListhskiemtranv(List<VwHosotongTondongNvweb> listhskiemtranv) {
        this.listhskiemtranv = listhskiemtranv;
    }
     
     
     

    public List<ChinhanhList> getListchinhanh() {
        return listchinhanh;
    }

    public void setListchinhanh(List<ChinhanhList> listchinhanh) {
        this.listchinhanh = listchinhanh;
    }

    public List<UserModel> getListusermdel() {
        return listusermdel;
    }

    public void setListusermdel(List<UserModel> listusermdel) {
        this.listusermdel = listusermdel;
    }

    public ChinhanhList getChinhanhList() {
        return chinhanhList;
    }

    public void setChinhanhList(ChinhanhList chinhanhList) {
        this.chinhanhList = chinhanhList;
    }

    public String getTencntimkiem() {
        return tencntimkiem;
    }

    public void setTencntimkiem(String tencntimkiem) {
        this.tencntimkiem = tencntimkiem;
    }

    public String getMacntimkiem() {
        return macntimkiem;
    }

    public void setMacntimkiem(String macntimkiem) {
        this.macntimkiem = macntimkiem;
    }

    public String getTennvchitra() {
        return tennvchitra;
    }

    public void setTennvchitra(String tennvchitra) {
        this.tennvchitra = tennvchitra;
    }

    public String getLoaitkdulieu() {
        return loaitkdulieu;
    }

    public void setLoaitkdulieu(String loaitkdulieu) {
        this.loaitkdulieu = loaitkdulieu;
    }

    public List<SmtbDanhmucList> getListdanhmuc() {
        return listdanhmuc;
    }

    public void setListdanhmuc(List<SmtbDanhmucList> listdanhmuc) {
        this.listdanhmuc = listdanhmuc;
    }

    public List<VwDmNoteListWeb> getListlydoxacminh() {
        return listlydoxacminh;
    }

    public void setListlydoxacminh(List<VwDmNoteListWeb> listlydoxacminh) {
        this.listlydoxacminh = listlydoxacminh;
    }

    public XacminhModel getXacminh() {
        return xacminh;
    }

    public void setXacminh(XacminhModel xacminh) {
        this.xacminh = xacminh;
    }

    public String getMaxacminh() {
        return maxacminh;
    }

    public void setMaxacminh(String maxacminh) {
        this.maxacminh = maxacminh;
    }
    
    
    
  
}
