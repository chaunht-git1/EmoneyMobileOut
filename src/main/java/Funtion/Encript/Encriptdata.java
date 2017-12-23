 
package Funtion.Encript;

import Global.CookieBean;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.binary.Base64;

 
public class Encriptdata {
    
     public static final String CHARSET = "ISO-8859-1";
   
     public String encriptpassword(String valuestring) throws UnsupportedEncodingException{
          
         String encodedUser = new String(Base64.encodeBase64(valuestring.getBytes(CHARSET)));
         return encodedUser;
     }
     
     public String decriptpassword(String valuestring) throws UnsupportedEncodingException{
          
         String encodedUser =  new String(Base64.decodeBase64(valuestring));
         return encodedUser;
     }
     
     
 
    
}
