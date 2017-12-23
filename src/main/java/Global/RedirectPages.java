 
package Global;

import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class RedirectPages {
    
    
  public void  sendRedirectPage(String namepage) throws IOException{
    FacesContext context = FacesContext.getCurrentInstance();
    HttpServletRequest reqt =  SessionBean.getRequest();
    HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
    String pathroot=reqt.getContextPath()+"/faces"+ namepage;
    
    response.sendRedirect(pathroot);
    
  }
    
    
}
