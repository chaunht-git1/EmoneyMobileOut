 
package Global;

 
import ApiFunction.ApiDanhmuc;
import DanhmucModel.DistrictList;
import DanhmucModel.DmCitylist;
import DanhmucModel.DmNhanvienList;
import Entities.CityList;
import java.util.List;
import java.util.ArrayList;
 
public  class ConstantCodes {
    
 
    /* Chua cac danh sach bien Global*/
     public static String publicvariable = "I am public variable"; 
     public static List<DmCitylist> mmcitylist= new ArrayList<>();
     public static List<DistrictList>  dsdistrictlist =new ArrayList<>(); 
     //public static List<DmNhanvienList>  dsnhanvienchiquay =new ArrayList<>(); 
     
       public static void createArrayList() {
         
        ApiDanhmuc  danhmucDao= new ApiDanhmuc (); 
        mmcitylist=danhmucDao.dscitylist();
        dsdistrictlist=danhmucDao.dsdistrict();
       /* List<DmNhanvienList> tempva=danhmucDao.dsnhanvienlist("Y", chinhanh);
         for (int i = 0; i < tempva.size(); i++) {
             
             if(tempva.get(i).getLoainv().contains("Y"))
             {
                dsnhanvienchinha.add(tempva.get(i));
             }
             else{
                dsnhanvienchiquay.add(tempva.get(i));
             }
             }
*/
             
         }
   
 
    
}
