 
package Controller;

import DanhmucModel.DmCitylist;
import DanhmucModel.DmNhanvienList;
import static LocalFuntionGlobal.ConstantCodes.*;
import LocalFuntionGlobal.FunctionLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
@Named(value = "danhmucManagedBean")
@SessionScoped
public class DanhmucManagedBean implements Serializable {
 
   private List<DmCitylist> dscity = new ArrayList<>();
   
   private List<DmNhanvienList> dsnvchinhanhlist = new ArrayList<>();

    
 
 
    // Get Set
   
    public List<DmNhanvienList> getDsnvchinhanhlist() {
        return dsnvchinhanhlist;
    }
    
    public void setDsnvchinhanhlist(List<DmNhanvienList> dsnvchinhanhlist) {
        this.dsnvchinhanhlist = dsnvchinhanhlist;
    }

    public List<DmCitylist> getDscity() {
        return dscity;
    }

    public void setDscity(List<DmCitylist> dscity) {
        this.dscity = dscity;
    }
 
    public DanhmucManagedBean() {
        
        dscity=mmcitylist;
        dsnvchinhanhlist=dsnhanvienchinha;
       
    }
    
}
