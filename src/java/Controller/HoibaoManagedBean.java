 
package Controller;

import ApiFunction.ApiDao.ApiHamgiaophieu;
import EntitiesBean.VwKshbHosonvchinhaAll;
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
import LocalModel.ChinhanhList;
 
import LocalFuntionGlobal.HamUserAll;
import org.primefaces.event.SelectEvent;
import LocalModel.UserModel;
import DatabaseDao.NhanvienListDAO;
import DatabaseDao.XacminhDAO;
import EntitiesBean.VwDmQuanlydotimagectietWeb;
import EntitiesBean.VwGiaodichHoibaomobileNvall;
import EntitiesBean.VwTondongNvAllWeb;
import LocalFuntionGlobal.*;
import LocalModel.ChitietgiaodichModel;
import LocalModel.XacminhModel;
import java.sql.SQLException;
import ApiFunction.ApiFun;
import ConnectBean.ConnectionProvider;
import DanhmucModel.DmCitylist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 
@Named(value = "hoibaoManagedBean")
@SessionScoped
public class HoibaoManagedBean implements Serializable {
    
   
  private VwKshbHosonvchinhaAll hosonvchinhaAll = new VwKshbHosonvchinhaAll();
  private List<VwKshbHosonvchinhaAll> listhskiemtranv= new ArrayList<>();
  private List<ChinhanhList> listchinhanh=  new ArrayList<>();
  private  List<UserModel> listusermdel= new  ArrayList<>();
  private List<VwKshbHosonvchinhaAll>  listhskiemtranvall= new ArrayList<VwKshbHosonvchinhaAll>();
  private List<DmCitylist> dscity= new ArrayList<>();
  
  private  ChinhanhList chinhanhList= new ChinhanhList();
  private  String tencntimkiem ;
  private  String macntimkiem;
  private  String tennvchitra ;
  private  List<ChitietgiaodichModel> chitietgiaodichModels=new ArrayList<>();
  private  ChitietgiaodichModel chitietgiaodichModel=new  ChitietgiaodichModel();
  private  List<VwTondongNvAllWeb> listnvtondong;
  private XacminhModel  xacminh= new  XacminhModel();
  
  
    
    public void onItemSelect(SelectEvent event) {
      macntimkiem=null;
      macntimkiem=tencntimkiem.substring(0, 3);
      listhskiemtranv=null;  
      listhskiemtranv= new ArrayList<>();
      listhskiemtranvall=this.dsthongkechinhanh(macntimkiem);
      listhskiemtranv=listhskiemtranvall;
      listusermdel=NhanvienListDAO.dsnvchinhagiaophieu(macntimkiem);
 
    }
    
      public void onItemnvSelect(SelectEvent event) {
     
      for (VwKshbHosonvchinhaAll listhskiemtranvall1 : listhskiemtranvall) {
          
          if (listhskiemtranvall1.getIdNvChitra().contains(tennvchitra)) {
              
              listhskiemtranv= new ArrayList<>();
              listhskiemtranv.add(listhskiemtranvall1);
              
          }
      }
      
 
    }
    
    public List<String> completeListnvText(String query) {
        List<String> results = new ArrayList<>();
        List<ChinhanhList> list=new ArrayList<>();
      
      for (UserModel listusermdel1 : listusermdel) {
          String chuoitk = listusermdel1.getUserid();
          if (chuoitk.contains(query)) {
              results.add(listusermdel1.getUserid());
          }
      }
         
        return results;
     
   }  
  
   public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        List<ChinhanhList> list=new ArrayList<>();
      
      for (ChinhanhList listchinhanh1 : listchinhanh) {
          String chuoitk = listchinhanh1.getDescription();
          if (chuoitk.contains(query)) {
              results.add(listchinhanh1.getIdCode() + "-" + listchinhanh1.getDescription());
          }
      }
         
        return results;
     
   }
    
  
  
  public HoibaoManagedBean() {
        
      
      listchinhanh=HamUserAll.laydschinhanh();
      
      
        
        
    }
 
    public String chuyentrangchitiet(String dk) {
        String chinhanh=SessionBean.getChinhanhId();
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
           case "HSDOT3": 
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
             
           case "HSDOT1": 
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
                
           case "HSXNMOBILE": 
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
               return "chitiethosoktimage" + "?faces-redirect=true";
            }  
              
           }

        return "chitiethosokiemtra" + "?faces-redirect=true";

    }   
  
    
    
     public   String chuyentrangdshoibao(String dk) {
        dscity=ConstantCodes.mmcitylist;
        String chinhanh=SessionBean.getChinhanhId();
        String userid=SessionBean.getUserId();         
        ApiFun af=new ApiFun();
        chitietgiaodichModels = new ArrayList<>();
           
           listnvtondong= new ArrayList<VwTondongNvAllWeb>();
  
           switch (dk) 
           {
            case "C": 
            {
           listnvtondong=HamUserAll.dsdondongchitiet(chinhanh, userid, dk);
    
           if(listnvtondong.size()==0){
              // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, listhskiemtranv.size(), ""));  
           }
           else{
           for (int i = 0; i < listnvtondong.size(); i++) {
          
           chitietgiaodichModel = new ChitietgiaodichModel();
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
           chitietgiaodichModels.add(chitietgiaodichModel);
          
           }
           }
             break;
            }

           }

        return "dshoibaomobile" ;

    }   
     
     public void locdulieudshoso(String dk) {
         
         chitietgiaodichModels=new ArrayList<>();
         chitietgiaodichModel= new ChitietgiaodichModel();
         List<VwTondongNvAllWeb> ketquatam= new ArrayList<>();
         
         if (listnvtondong.size()>0){
             
            if (dk.equalsIgnoreCase("ALL")) 
            {
                ketquatam= listnvtondong;
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
         
         
         
     }
     
     
  
  
      public String capnhatcmnd() throws SQLException{
         
        /*  String userid=SessionBean.getUserId();
          if (!chitietgiaodichModel.getSocmnd().equalsIgnoreCase(""))
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
          */
          
          return "";
        
    }  
     
     
  public String  chuyentrangkshoibaochinhanh( ) {
  
   // this.showthongtinnv();
    return "kshbthongkenhanvien" + "?faces-redirect=true";
    
  }
  
    public void  showttallnv( ) {
        
      listhskiemtranv=null;  
      listhskiemtranv= new ArrayList<>();
      listhskiemtranv= HoibaoManagedBean.dsthongkechinhanh("003");
     
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy"+listhskiemtranv.size(), ""));
      
  }
    
  public void  showthongtinnv( ) {
      try {
          String chinhanh = SessionBean.getChinhanhId();
          String userid=SessionBean.getUserId();
          listhskiemtranv = null;
          listhskiemtranv = new ArrayList<>();
          listhskiemtranv = HoibaoManagedBean.dsthongkenhanvien(chinhanh,userid);
         // listhskiemtranv = ApiFun.dsthongkenhanvien(chinhanh, userid, "") ;
          hosonvchinhaAll = listhskiemtranv.get(0);
        //  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Tìm thấy" + listhskiemtranv.size(), ""));

      } catch (Exception e) {
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Không có hồ sơ", ""));

      }
  
  }
  
  public static List<VwKshbHosonvchinhaAll> dsthongkenhanvien(String chinhanh,String userid) {
        
        List<VwKshbHosonvchinhaAll> dsKq;
        dsKq = new ArrayList<>();
       // String userid=SessionBean.getUserId();
      
       
            ConnectionProvider.reconnectdbastatic();
            Connection con=ConnectionProvider.getCon();

        try { 
           // Tạo một câu SQL có 1 tham số (?)
            String  sql = "select * from KHOUT.VW_KSHB_HOSONVCHINHA_ALL WHERE ID_CHINHANH=? AND ID_NV_CHITRA=? ";
            
            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);
            
            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            pstm.setString(1, chinhanh);
            pstm.setString(2, userid);
          
            
            ResultSet rs = pstm.executeQuery();
            
             while (rs.next()) { 
              VwKshbHosonvchinhaAll dataClass = new VwKshbHosonvchinhaAll();
              dataClass.setIdCode(rs.getString("IDCODE"));
              dataClass.setIdChinhanh(rs.getString("ID_CHINHANH"));
              dataClass.setTenchinhanh(rs.getString("TENCHINHANH"));
              dataClass.setHoten(rs.getString("HOTEN"));
              dataClass.setDachitra(rs.getLong("DACHITRA"));
              dataClass.setChuachitra(rs.getLong("CHUACHITRA"));
              dataClass.setShs(rs.getLong("SHS"));
              dataClass.setDaquyetbn(rs.getLong("DAQUYETBN"));
              dataClass.setChoduyetbn(rs.getLong("CHODUYETBN"));
              dataClass.setThieutt(rs.getLong("THIEUTT"));
              dataClass.setErrorbn(rs.getBigDecimal("ERRORBN"));
              dataClass.setDachitrachuabn(rs.getLong("DACHITRACHUABN"));
              dataClass.setHoanthanh(rs.getString("HOANTHANH"));
              dataClass.setShstondong(rs.getLong("SHSTONDONG"));
              dataClass.setShsxacminh(rs.getLong("SHSXACMINH"));
              dataClass.setShsguixm(rs.getLong("SHSGUIXM"));
              dataClass.setChinhahoanthanh(rs.getString("CHINHAHOANTHANH"));
              dataClass.setSlmoneygram(rs.getLong("SLMONEYGRAM"));
              dataClass.setSlmoneygramdot1(rs.getLong("SLMONEYGRAMDOT1"));
              dataClass.setSoluonghbmobile(rs.getLong("SOLUONGHBMOBILE"));
              dsKq.add(dataClass);  
               }
      
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
  
   public static List<VwKshbHosonvchinhaAll> dsthongkechinhanh(String chinhanh) {
        
        List<VwKshbHosonvchinhaAll> dsKq;
        dsKq = new ArrayList<>();
       // String chinhanh=SessionBean.getChinhanhId();
        VwKshbHosonvchinhaAll  dmnv = new VwKshbHosonvchinhaAll();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.close();
        try { 
          Query query = null;
          query=entitymanager.createQuery("SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.idChinhanh=:chinhanh ");     
          query.setParameter("chinhanh", chinhanh);
          dsKq =  query.getResultList();
          return dsKq;
        } catch (Exception e) {
             return null;
        }
    }
   
public String  kiemtrabiennhan(String dmQuanlydotImagetongWeb) {
        
        
         List<VwDmQuanlydotimagectietWeb> dmQuanlydotimagectietWebs=new ArrayList<>();
         dmQuanlydotimagectietWebs=HamUserAll.dshoibaochitiet(macntimkiem, macntimkiem);
         return "dshshoibaonvchinhakiemtraxm" + "?faces-redirect=true";
       
   
    
}  

   public void capnhatcmnd(ChitietgiaodichModel bn) throws SQLException {
       
          XacminhModel  xacminh= new  XacminhModel();
          String userid=SessionBean.getUserId();
          String idchinhanh=SessionBean.getChinhanhId();
         if (!bn.getSocttuythan().equalsIgnoreCase(""))
          {     
                xacminh.setSobiennhan(bn.getSobn());
                xacminh.setSocmnd(bn.getSocttuythan());
                xacminh.setId_chinhanh(idchinhanh);
                xacminh.setNvchitra(userid);
                XacminhDAO q= new XacminhDAO();
                String kq=q.updatecmnddate(xacminh,"", userid);
                
               /* ApiHamgiaophieu q= new  ApiHamgiaophieu();
                String khoa=bn.getChinhanh()+"@"+bn.getSobn();
                String chuoikhoa=userid+"@"+bn.getSocttuythan();
                String kq=q.capnhatcmnd(khoa, chuoikhoa);
                q.close();
              */
          if(kq.equalsIgnoreCase("T"))
          {   
              //this.tennvchitra=null;
              //xacminh=null;
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật  thành công", ""));
             
              
          }
          else{
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cập nhật không thành công", ""));
             
          }
          }
          else{
                this.tennvchitra=null;
                xacminh=null;
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "CMND không thể trống.", ""));
     
          }  
        
    } 
   
      
   public void capnhatchuyenhoso(ChitietgiaodichModel bn) throws SQLException {
       
          XacminhModel  xacminh= new  XacminhModel();
          String userid=SessionBean.getUserId();
          String idchinhanh=SessionBean.getChinhanhId();
         if (!bn.getSocttuythan().equalsIgnoreCase(""))
          {     
                xacminh.setSobiennhan(bn.getSobn());
                xacminh.setSophieu(bn.getSophieu());
                xacminh.setStt(bn.getStt());
                xacminh.setSocmnd(bn.getSocttuythan());
                xacminh.setId_chinhanh(idchinhanh);
                xacminh.setNvchitra(userid);
                XacminhDAO q= new XacminhDAO();
                String kq=q.updatechuyentoday(xacminh,"", userid);
                   
              /*  ApiHamgiaophieu q= new  ApiHamgiaophieu();
                String khoa=bn.getChinhanh()+"@"+bn.getSobn();
                String chuoikhoa=userid+"@"+bn.getSocttuythan();
                String kq=q.capnhatchuyenhsvehoiso(khoa, chuoikhoa);
                q.close();
*/
          if(kq.equalsIgnoreCase("T"))
          {   
              //this.tennvchitra=null;
              //xacminh=null;
              //chitietgiaodichModels.remove(bn);
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Chuyển   thành công", ""));
              this.chuyentrangdshoibao("C");
              
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
          String userid=SessionBean.getUserId();
          String idchinhanh=SessionBean.getChinhanhId();
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
              this.chuyentrangdshoibao("C");
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
  
  public void capnhatchuyendiaban(ChitietgiaodichModel bn) throws SQLException {
       
          XacminhModel  xacminh= new  XacminhModel();
          String userid=SessionBean.getUserId();
          String idchinhanh=SessionBean.getChinhanhId();
         if (!bn.getIdnvchitrachuyen().equalsIgnoreCase("") )
          {     
                xacminh.setSobiennhan(bn.getSobn());
                xacminh.setSocmnd(bn.getSocttuythan());
                xacminh.setId_chinhanh(idchinhanh);
                xacminh.setNvchitra(userid);
                xacminh.setLydoxm(bn.getLydoxacminh());
                xacminh.setSophieu(bn.getSophieu());
                xacminh.setStt(bn.getStt().intValue());
                xacminh.setIdnvchitrachuyen(bn.getIdnvchitrachuyen());
                xacminh.setLydoxm(bn.getLydochuyendiaban()); 
                XacminhDAO q= new XacminhDAO();
                String kq=q.updatechuyenchinhanh(xacminh,"", userid);
                
          if(kq.equalsIgnoreCase("T"))
          {   
      
              FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Xác minh   thành công", ""));
              this.chuyentrangdshoibao("C");
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
    
  
 
    public String getMacntimkiem() {
        return macntimkiem;
    }

    public void setMacntimkiem(String macntimkiem) {
        this.macntimkiem = macntimkiem;
    }

    public String getTencntimkiem() {
        return tencntimkiem;
    }

    public void setTencntimkiem(String tencntimkiem) {
        this.tencntimkiem = tencntimkiem;
    }
   
 
    public ChinhanhList getChinhanhList() {
        return chinhanhList;
    }

    public void setChinhanhList(ChinhanhList chinhanhList) {
        this.chinhanhList = chinhanhList;
    }
   


    public List<ChinhanhList> getListchinhanh() {
        return listchinhanh;
    }

    public void setListchinhanh(List<ChinhanhList> listchinhanh) {
        this.listchinhanh = listchinhanh;
    }
  
 
   
    public List<VwKshbHosonvchinhaAll> getListhskiemtranv() {
        return listhskiemtranv;
    }

    // Get set
    public void setListhskiemtranv(List<VwKshbHosonvchinhaAll> listhskiemtranv) {
        this.listhskiemtranv = listhskiemtranv;
    }

    public VwKshbHosonvchinhaAll getHosonvchinhaAll() {
        return hosonvchinhaAll;
    }

    public void setHosonvchinhaAll(VwKshbHosonvchinhaAll hosonvchinhaAll) {
        this.hosonvchinhaAll = hosonvchinhaAll;
    }

    public List<UserModel> getListusermdel() {
        return listusermdel;
    }

    public void setListusermdel(List<UserModel> listusermdel) {
        this.listusermdel = listusermdel;
    }

    public String getTennvchitra() {
        return tennvchitra;
    }

    public void setTennvchitra(String tennvchitra) {
        this.tennvchitra = tennvchitra;
    }

    public List<VwKshbHosonvchinhaAll> getListhskiemtranvall() {
        return listhskiemtranvall;
    }

    public void setListhskiemtranvall(List<VwKshbHosonvchinhaAll> listhskiemtranvall) {
        this.listhskiemtranvall = listhskiemtranvall;
    }

    public List<ChitietgiaodichModel> getChitietgiaodichModels() {
        return chitietgiaodichModels;
    }

    public void setChitietgiaodichModels(List<ChitietgiaodichModel> chitietgiaodichModels) {
        this.chitietgiaodichModels = chitietgiaodichModels;
    }
    
    
  
  
}
