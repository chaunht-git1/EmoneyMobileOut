 
package Global;

import static Global.SessionBean.getRequest;
import Entities.UserModel;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionBean {
    
    
    public static HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
    }
    
    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance()
                .getExternalContext().getRequest();
    }
    
   public static HttpServletResponse getResponse () {
        return (HttpServletResponse) FacesContext.getCurrentInstance()
                .getExternalContext().getResponse();
    }
    
    public static String getUserName() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return session.getAttribute("g_username").toString();
    }
    
    public static String getUserId() {
        HttpSession session = getSession();
        if (session != null)
            return (String) session.getAttribute("g_userid");
        else
            return null;
    }
    
         public static String getChinhanhId() {
        HttpSession session = getSession();
        if (session != null)
            return (String) session.getAttribute("g_chinhanhid");
        else
            return null;
    }
    
       public static UserModel getUseriNFOR() {
        HttpSession session = getSession();
        if (session != null)
            return (UserModel) session.getAttribute("g_useInfor");
        else
            return null;
    }
    
      public static  String getDeviceName ()
    {
        
           HttpServletRequest request= getRequest();
           
          if(request.getHeader("User-Agent").indexOf("Mobile") != -1) {
               return "Mobile";
           } else {
               return "Desktop";
           }
       
    }   
      public static  String getSystemMobile()
    {
        HttpSession session = getSession();
        if (session != null)
            return (String) session.getAttribute("systemname");
        else
            return null;
       
    }   
      
             
       public static String getHbmobile() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return session.getAttribute("hbmobile").toString();
    }
    
}
