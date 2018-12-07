package Controller;


import ApiFunction.ApiDao.ApiLogin;
import ApiFunction.ApiDao.Apismtbuser;
import ApiFunction.ApiFun;
import Entities.SmtbUserWeb;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.servlet.http.HttpSession;
import LocalFuntionGlobal.*;
import LocalModel.UserModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

@Named(value = "loginManagerBean")
@SessionScoped
public class LoginManagerBean implements Serializable {

    private String username;
    private String password;

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
    
    
    public String logout() {
      HttpSession sess= SessionBean.getSession();
      sess.invalidate();
      return "login" + "?faces-redirect=true";
     }

    //validate login
    public String validateUsernamePassword() throws IOException {

        // Kiem tra dang nhap
     
        String valid=null;      
	ApiFun apiFun= new ApiFun();
        ApiLogin apiLogin= new ApiLogin();
        Apismtbuser apismtbuser=new Apismtbuser();
        valid= apiLogin.validate(username, password);
        
       if (valid.contains("F"))
       {
            LocalFuntionGlobal.SystemBean.proMessError("Lỗi đăng nhập");
            return null;
       }
       else{
        try {
            if (valid!=null) {
                Gson gson= new Gson();
                String hethog=System.getProperty("os.name").substring(0,3).toLowerCase();
                HttpSession session = SessionBean.getSession();
                String sessionid = session.getId();
                UserModel useMD = new UserModel();
                String user_id=username;
                SmtbUserWeb userWeb= new SmtbUserWeb();
               // userWeb = apismtbuser.find_JSON(SmtbUserWeb.class,user_id.toUpperCase());
               // apismtbuser.close();
                 useMD =  gson.fromJson(valid,new TypeToken<UserModel>(){}.getType());
                 useMD.setTenhethong("");
                
               
                session.setAttribute("g_userid", user_id.toUpperCase());
                session.setAttribute("g_ttUser", useMD.getUsername());
                session.setAttribute("g_chinhanhid", useMD.getHomebranch());
                session.setAttribute("g_userinfor", useMD);
                session.setAttribute("g_tenht", sessionid);
                session.setAttribute("device", SessionBean.getDeviceName());  
                session.setAttribute("systemname", hethog);
              
                // Lay data danh muc .
              //  createArrayList(useMD.getHomebranch());
 
                    return "index" + "?faces-redirect=true";
             
                }
          
        }
        catch (Exception e) {
                 LocalFuntionGlobal.SystemBean.proMessError(e.getMessage());
            return null;
        }
            
        }
        
            LocalFuntionGlobal.SystemBean.proMessError("Lỗi đăng nhập");
            return null;
    }
 

 

    public LoginManagerBean() {
    }

}
