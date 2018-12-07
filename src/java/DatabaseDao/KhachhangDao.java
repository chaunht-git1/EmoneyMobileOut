 
package DatabaseDao;

import EntitiesBean.KhachhangttList;
import ApiFunction.ApiDao.*;
import Entities.VwXemdulieutkkhMaster;
import Fun.Xulychuoi;
 
public class KhachhangDao {
    
    
    
  public Boolean capnhatthongtinkh(int maupdate,VwXemdulieutkkhMaster khachhang)
  {       
     //Lay thong tin khach hang.
      ApiKhachhang  apiKhachhang = new ApiKhachhang();
      KhachhangttList khachhangkq = new KhachhangttList();
      String id=khachhang.getIdKhachhang();
      Boolean kq=false;
        if(khachhang!=null)
         {    
        khachhangkq=apiKhachhang.find_JSON(KhachhangttList.class, id);
        switch (maupdate) {
            case 1:  khachhang.setHoten(khachhang.getHoten());  
                     kq=true;
                     break;
            case 2:        
                     khachhang.setDienthoaiBan(khachhang.getSochungminh());
                     kq=true;
                     break;
            case 3:        
                     khachhang.setDidong1(khachhang.getDidong1());
                     kq=true;
                     break;
            case 4:        
                     khachhang.setSochungminh(khachhang.getSochungminh());  
                     kq=true;
                     break;
            case 5:        
                     khachhang.setNgaycapCmnd(Xulychuoi.chanceStringtoDate(khachhang.getNoicapcmndName()));  
                     kq=true;
                     break;
            case 6:        
                     khachhang.setIdNoicapcmnd(khachhang.getIdNoicapcmnd());  
                     kq=true;
                     break;
            case 7:        
                     khachhang.setSonhaThuongtru(khachhang.getSonhaThuongtru());  
                     kq=true;
                     break;
            case 8:        
                     khachhang.setThanhphoThuongtru(khachhang.getThanhphoThuongtru());  
                     kq=true;
                     break;
            case 9:        
                     khachhang.setQuanThuongtru(khachhang.getQuanThuongtru());  
                     kq=true;
                     break;
            case 10:        
                     khachhang.setGioitinh(khachhang.getGioitinh());  
                     break;
            case 11:        
                     khachhang.setGiayPlx(khachhang.getGiayPlx());  
                     kq=true;
                     break;
            case 12:        
                     khachhang.setPassport(khachhang.getPassport());  
                     break;
            case 13:        
                     khachhang.setDienthoaiBan(khachhang.getDienthoaiBan());  
                     kq=true;
                     break;  
             case 14:        
                     khachhang.setDachuanhoa("Y");  
                     kq=true;
                     break;     
            default: kq=false;
                     break;
        }           
        apiKhachhang.edit_JSON(khachhang,id);
        }
        else{
           kq= false; 
        }
        
        return kq;
        
  }
    
    
}
