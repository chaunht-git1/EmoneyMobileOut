package Entities;

//import Bean.AlertCustom;
import static ConnectBean.ConnectionProvider.reconnectdbastatic;
import LocalFuntionGlobal.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.servlet.http.HttpSession;
import ConnectBean.UserDao;
import java.util.List;
import org.apache.jasper.tagplugins.jstl.Choose;
import LocalModel.UserModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ConnectBean.Provider.*;
import ConnectBean.ConnectionProvider;
//import static javax.enterprise.inject.spi.CDI.current;
import javax.faces.context.FacesContext;
import LocalFuntionGlobal.FunctionLocal;

public class LoginDao {

    /*public static ItemMenu kiemTraMenu(String user) throws SQLException {

        // Truy van du lieu tra ve Menu Database Class .
//        MenuDao mnd = new MenuDao();
        ItemMenu imenu = new ItemMenu();
     //   List<MenuDatabase> listmenu = mnd.layThongTinMenu(user.toUpperCase());

        for (int i = 0; i < listmenu.size(); i++) {
            // Lay menu 

            MenuDatabase menu = new MenuDatabase();
            menu = listmenu.get(i);
            String menuid = menu.getMenuid();
            String menuname = menu.getMenuname();

//            switch (menuid) {
//                case "0000000001":
//                    imenu.setSmenu21name(menuname);
//                    imenu.setSmenu21id(false);
//                    break;
//                case "0000000002":
//                    imenu.setSmenu22name(menuname);
//                    imenu.setSmenu22id(false);
//                    break;
//                case "0000000003":
//                    imenu.setSmenu23name(menuname);
//                    imenu.setSmenu23id(false);
//                    break;
//                case "0000000004":
//                    imenu.setSmenu05name(menuname);
//                    imenu.setSmenu05id(false);
//                    break;
//                case "0000000005":
//                    imenu.setSmenu06name(menuname);
//                    imenu.setSmenu06id(false);
//                    break;
//                case "0000000007":
//                    imenu.setSmenunhandsname(menuname);
//                    imenu.setSmenunhandsid(false);
//                    break;
//                case "0000000008":
//                    imenu.setSmenuchuanhoaname(menuname);
//                    imenu.setSmenuchuanhoaid(false);
//                    break;
//                //     
//                case "0000000009":
//                    imenu.setSmenutiepnhangiaodich(menuname);
//                    imenu.setSmenutiepnhangiaodichid(false);
//                    break;
//                //Phần Thạch thêm vào từ dòng 80 đến dòng 83
//                case "0000000015":
//                    imenu.setSmenuquanlynhomnhanvien(menuname);
//                    imenu.setSmenuquanlynhomnhanvienid(false);
//                    break;
//                //Kết thúc phần Thạch thêm
//            }

        }

        return imenu;
    }
    */

    public static boolean validate(String user, String password) {
        boolean status = false;
        String ketqua;
        String user_id;
        String pass;
        UserModel useMD = new UserModel();
        UserDao userDA = new UserDao();
        HttpSession session = SessionBean.getSession();
        String sessionid = session.getId();
        user_id = user;
        pass = password;
        

        try {
 
          // Connection con = null;
           ConnectionProvider.reconnectdbastatic();
         //  Connection con = null;
           Connection con = ConnectionProvider.getCon();
       
            String fnCall = "{call ? :=  KH.SMPKS.fn_sign_on_java(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
             
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.setString(2, user_id.toUpperCase());
            stm.setString(3, pass.toUpperCase());
            stm.setString(4, sessionid);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            
            
             

            // stm.close();
            if (ketqua.equalsIgnoreCase("T")) {
                
  
 
                // Lấy thông tin user .
                String hethog=System.getProperty("os.name").substring(0,3).toLowerCase();
                useMD = userDA.layThongUser(user_id.toUpperCase());
                useMD.setTenhethong(sessionid);
                session.setAttribute("g_userid", user_id.toUpperCase());
                session.setAttribute("g_ttUser", useMD.getUsername());
                session.setAttribute("g_chinhanhid", useMD.getHomebranch());
                session.setAttribute("g_userinfor", useMD);
                session.setAttribute("g_tenht", sessionid);
                session.setAttribute("device", SessionBean.getDeviceName());  
                session.setAttribute("systemname", hethog);
    
                return true;

            } else {
               // LocalFuntionGlobal.SystemBean.proMessError("Lổi đăng nhập");
                return false;
            }

        } catch (SQLException ex) {

            LocalFuntionGlobal.SystemBean.proMessError(ex.getMessage());
            return false;

        }

    }

}
