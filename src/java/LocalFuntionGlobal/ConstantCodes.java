 
package LocalFuntionGlobal;

import ApiFunction.ApiDao.ApiDanhmucDao;
import DanhmucModel.*;
import EntitiesBean.VwDsNhnavienctWeb;
import java.util.List;
import java.util.ArrayList;
 
public class ConstantCodes {
    
 
    /* Chua cac danh sach bien Global*/
     public static String publicvariable = "I am public variable"; 
     public static List<DmCitylist> mmcitylist= new ArrayList<>();
     public static List<DmNhanvienList>  dsnhanvienchinha =new ArrayList<>(); 
     public static List<DmNhanvienList>  dsnhanvienchiquay =new ArrayList<>(); 
      
     public static void createArrayList(String chinhanh) {
         
        ApiDanhmucDao danhmucDao= new ApiDanhmucDao(); 
        mmcitylist=null;
        List<DmNhanvienList> tempva=danhmucDao.dsnhanvienlist("Y", chinhanh);
         for (int i = 0; i < tempva.size(); i++) {
             
             if(tempva.get(i).getLoainv().contains("Y"))
             {
                dsnhanvienchinha.add(tempva.get(i));
             }
             else{
                dsnhanvienchiquay.add(tempva.get(i));
             }
             }
             
         }
        
        
    
  
 
    
}
