 
package Controller;

import static ConnectBean.Provider.DADABASEVW;
import EntitiesBean.VwDstimkiemMobileDetail;
import LocalModel.ChitietgiaodichModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

 
@Named(value = "timkiemManagedBean")
@SessionScoped
public class TimkiemManagedBean implements Serializable {

    // Khai báo biến .
      private    ChitietgiaodichModel chitietgiaodichModel=new  ChitietgiaodichModel();
      private    String loaitk ="dienthoai";
      private    String dulieutk ;
      private  List<VwDstimkiemMobileDetail> chitietgiaodichModels=new ArrayList<>();
      
      
      
 
      
      
      

    public ChitietgiaodichModel getChitietgiaodichModel() {
        return chitietgiaodichModel;
    }

    public void setChitietgiaodichModel(ChitietgiaodichModel chitietgiaodichModel) {
        this.chitietgiaodichModel = chitietgiaodichModel;
    }

    public String getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(String loaitk) {
        this.loaitk = loaitk;
    }

    public String getDulieutk() {
        return dulieutk;
    }

    public void setDulieutk(String dulieutk) {
        this.dulieutk = dulieutk;
    }

    public List<VwDstimkiemMobileDetail> getChitietgiaodichModels() {
        return chitietgiaodichModels;
    }

    public void setChitietgiaodichModels(List<VwDstimkiemMobileDetail> chitietgiaodichModels) {
        this.chitietgiaodichModels = chitietgiaodichModels;
    }

     
    
 
      
      
      
    public TimkiemManagedBean() {
    }
    
}
