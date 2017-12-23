package Controller;

import ApiFunction.ApiLogin;
import ApiFunction.ApiUser;
import Entities.Apismtbuser;
import Entities.UserModel;
import Funtion.Encript.EncodeDecode;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.servlet.http.HttpSession;
import Global.*;
import java.io.IOException;
import Global.CookieBean;
import Funtion.Encript.Encriptdata;
import Funtion.Login.FunctionLog;
import static Global.StaBienToanCuc.refixstring;
import com.google.gson.Gson;


@Named(value = "loginManagerBean")
@SessionScoped
public class LoginManagerBean implements Serializable {

    private String username;
    private String password;
    private boolean ck = false;
    public static final String CHARSET = "ISO-8859-1";

    public String logout() {
        HttpSession sess = SessionBean.getSession();
        sess.invalidate();
        return "logout"  ;
    }
    public String gohome() {
        return "gohome"  ;
    } 
    //validate login
    public String validateUsernamePassword() throws IOException {

        // Kiem tra dang nhap
        boolean valid = false;
        ApiLogin apiLogin = new ApiLogin();
        Encriptdata encriptdata = new Encriptdata();
        FunctionLog functionLog = new FunctionLog();
        Apismtbuser apismtbuser = new Apismtbuser();
        String enString = encriptdata.encriptpassword(username + password + refixstring);
        boolean kqcook = functionLog.checklogincookie(username, enString);

        if (!kqcook) {
            valid = apiLogin.validate(username, password);
            ck = false;
        } else {
            valid = kqcook;
            ck = true;
        }
        try {
            if (valid) {

                UserModel userModel = new UserModel();
                ApiUser apiUser = new ApiUser();
                String kqck = functionLog.checkuserinfocookie(username+"infor");
                Gson gson = new Gson();
                EncodeDecode decodeData=new EncodeDecode();
                String enuserString=null;
                if(kqck==null)
                {
                    userModel = apiUser.laythongUser(username.toUpperCase());
                    String jsonstring=  gson.toJson(userModel) ;
                    enuserString = decodeData.encodeString(jsonstring);
                    CookieBean cookieBean = new CookieBean();
                    cookieBean.setCookie(username+"infor", enuserString, 60 * 60 * 24 * 30);
                   
                }
                else{
      
                    String decodestring= decodeData.decodeString(kqck);
                    userModel= gson.fromJson(decodestring, UserModel.class);
                }
                // Kiem tra xem co luu offline hay chua  . 
              //  SmtbuserDao smtbuserDao= new SmtbuserDao();
             /*   int infor=smtbuserDao.countList(username.toUpperCase());
                // Gan Cookie.
                if(infor==0)
                {   
                    List<UserModel> listusermodel=new ArrayList<UserModel>();
                    boolean kq=smtbuserDao.insertList(username, listusermodel);
                }
             */
                if (!ck) {
                    //Gan SQLite .
                    CookieBean cookieBean = new CookieBean();
                    cookieBean.setCookie(username, enString, 60 * 60 * 24 * 30);
                   
                }

                // Gan du lieu session .
                String hethog = System.getProperty("os.name").substring(0, 3).toLowerCase();
                HttpSession session = SessionBean.getSession();
                String sessionid = session.getId();

                session.setAttribute("g_useInfor", userModel);
                session.setAttribute("g_useid", userModel.getUserId());
                session.setAttribute("g_sessionid", sessionid);
                session.setAttribute("g_hethog", hethog);
                
                // Gan cac Session danh muc  . 
                // Lay danh sach thanh pho . 
                ConstantCodes.createArrayList();
                return "success";

            }

            Global.SystemBean.proMessError("Lỗi đăng nhập");
            return null;
        } catch (Exception e) {
            Global.SystemBean.proMessError(e.getMessage());
            return null;
        }
    }

    public String getMsg() {
        return msg;
    }
 

    public void setMsg(String msg) {
        this.msg = msg;
    }
    private String msg;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginManagerBean() {
    }

}
