 
package Funtion.Login;

import Global.CookieBean;
import javax.servlet.http.Cookie;
import Funtion.Encript.*;
import java.io.UnsupportedEncodingException;


 
public class FunctionLog {
    
    
    
    public boolean checklogincookie(String username , String pass ) throws UnsupportedEncodingException{
        
            // Lay thong tin cookie theo username .
            CookieBean beancook= new CookieBean();
            Cookie cookie=beancook.getCookie(username);
           
       
        if (cookie == null) {
              return false;
        }
        else{
            
            String value=cookie.getValue();
            if (value.equalsIgnoreCase(pass)) {
                return true;
            } else {
                return false;
            }
        }
         
        
    }
    
    
   public String checkuserinfocookie(String namecookite  ) throws UnsupportedEncodingException{
        
            // Lay thong tin cookie theo username .
            CookieBean beancook= new CookieBean();
            Cookie cookie=beancook.getCookie(namecookite);
           
       
        if (cookie == null) {
              return null;
        }
        else{
              return cookie.getValue();
           
        }
         
        
    }
    
       
   public String checkrestausfocookie(String namecookite  ) throws UnsupportedEncodingException{
        
            // Lay thong tin cookie theo username .
            CookieBean beancook= new CookieBean();
            Cookie cookie=beancook.getCookie(namecookite);
           
       
        if (cookie == null) {
              return null;
        }
        else{
              return cookie.getValue();
           
        }
         
        
    }
     
}
