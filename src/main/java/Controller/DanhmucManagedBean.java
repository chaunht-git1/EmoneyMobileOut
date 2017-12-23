 
package Controller;

import Entities.CityList;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

 
@Named(value = "danhmucManagedBean")
@SessionScoped
public class DanhmucManagedBean  implements Serializable{
    
    
    public  CityList getListCity(){
        
        
        
        return  null ; 
    }

 
    public DanhmucManagedBean() {
    }
    
}
