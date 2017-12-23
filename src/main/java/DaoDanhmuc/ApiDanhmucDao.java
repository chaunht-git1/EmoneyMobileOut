 
package DaoDanhmuc;

import ApiFunction.NetClientGet;
import DanhmucModel.DmCitylist;
import DanhmucModel.DmNhanvienList;
import DanhmucModel.DmQuanhuyenList;
 
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.List;

 
public class ApiDanhmucDao {
    
  private final String linkbasic="http://rest.dongamoneytransfer.com.vn/ServerRestKieuhoi/webresources";
     
  private final String linkbasic2="http://rest.dongamoneytransfer.com.vn/ServerRestKieuhoi/webresources";
 
   // Giao phieu chi nhanh.
//
// 
//    // Giao phieu chi nhanh.
// public  List<DmQuanhuyenList> dsquanhuyenlist(String city) {
//        
//
//         List<DmQuanhuyenList> dsKq;
//         dsKq = new ArrayList<>();
//     try {
//         
//         
//         NetClientGet clientGet=new NetClientGet();
//         LinkedTreeMap bientam = new LinkedTreeMap();
//         String kq=clientGet.getClientJson(linkbasic+"/danhmuc.districtlist");
//         if(kq.equalsIgnoreCase("Error"))
//         {
//            kq=clientGet.getClientJson(linkbasic2+"/danhmuc.districtlist");
//         }
//         Gson gson = new Gson();
//         List listdata = gson.fromJson(kq, List.class);
//           for (Object listdata1 : listdata) {
//            bientam.clear();
//            DmQuanhuyenList allWeb=new DmQuanhuyenList();
//            bientam = (LinkedTreeMap) listdata1;
//            String hieuluc =bientam.get("idValidity").toString();
//            String idcity =bientam.get("idCity").toString();
//            if(hieuluc.contains("O") && idcity.contains(city) )
//            {    
//                 allWeb.setIdcode(bientam.get("idDistrict").toString());
//                 allWeb.setDescription(bientam.get("districtName").toString());
//                 try {
//                    allWeb.setIdnvchitra(bientam.get("idNvChitra").toString());
//                } catch (Exception e) {
//                    allWeb.setIdnvchitra("NOVALUE");
//                }
//                 
//                 dsKq.add(allWeb);
//            }
//            
//     }
//         
//         return dsKq;
//     } catch (Exception e) {
//         return dsKq;
//     }
//     
//    }
//    
//    
//    // Ds nhan vien.
// public  List<DmNhanvienList> dsnhanvienlist(String usercn,String chinhanh) {
//        
//
//         List<DmNhanvienList> dsKq;
//         dsKq = new ArrayList<>();
//     try {
//         
//         
//         NetClientGet clientGet=new NetClientGet();
//         LinkedTreeMap bientam = new LinkedTreeMap();
//         String kq=clientGet.getClientJson(linkbasic+"/vwdsnhnavienctweb/dsnvthechinhanh/"+chinhanh);
//         if(kq.equalsIgnoreCase("Error"))
//         {
//            kq=clientGet.getClientJson(linkbasic2+"/vwdsnhnavienctweb/dsnvthechinhanh/"+chinhanh);
//         }
//         Gson gson = new Gson();
//         List listdata = gson.fromJson(kq, List.class);
//           for (Object listdata1 : listdata) {
//            bientam.clear();
//            DmNhanvienList allWeb=new DmNhanvienList();
//            bientam = (LinkedTreeMap) listdata1;
//
//              
//                 allWeb.setManhanvien(bientam.get("userId").toString());
//                 allWeb.setTennhanvien(bientam.get("userName").toString());
//                 allWeb.setLoainv(bientam.get("usercn").toString());
//                 dsKq.add(allWeb);
//              
//      
//     }
//         
//         return dsKq;
//     } catch (Exception e) {
//         return dsKq;
//     }
//     
//    }
// 
//     // Ds nhan vien.
// public  List<DmNhanvienList> dsnvqhuyenlist(String chuoiquanhuyen) {
//        
//
//        List<DmNhanvienList> dsKq;
//         dsKq = new ArrayList<>();
//     try {
//         
//         
//         NetClientGet clientGet=new NetClientGet();
//         LinkedTreeMap bientam = new LinkedTreeMap();
//         String kq=clientGet.getClientJson(linkbasic+"/danhmuc.vwdsnhanvienquanhuyenweb/dsnvtheoquan/"+chuoiquanhuyen);
//         if(kq.equalsIgnoreCase("Error"))
//         {
//            kq=clientGet.getClientJson(linkbasic2+"/danhmuc.vwdsnhanvienquanhuyenweb/dsnvtheoquan/"+chuoiquanhuyen);
//         }
//         Gson gson = new Gson();
//         List listdata = gson.fromJson(kq, List.class);
//           for (Object listdata1 : listdata) {
//            bientam.clear();
//            DmNhanvienList allWeb=new DmNhanvienList();
//            bientam = (LinkedTreeMap) listdata1;
//             
//                 allWeb.setManhanvien(bientam.get("idNvChitra").toString());
//                 allWeb.setTennhanvien(bientam.get("userName").toString());
//                 dsKq.add(allWeb);
//           
//            
//     }
//         
//         return dsKq;
//     } catch (Exception e) {
//         return dsKq;
//     }
//    }
//      
       
}
