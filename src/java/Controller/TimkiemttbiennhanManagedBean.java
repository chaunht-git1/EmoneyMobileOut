package Controller;

import LocalModel.DmXacminhToday;
import DatabaseDao.DoitacListDao;
import DatabaseDao.VwLichsuGdListWebDao;
import DatabaseDao.VwTkttBiennhanDetailDao;
import DatabaseDao.VwTkttBiennhanMasterDao;
import Entities.VwXemdulieutkMaster;
import EntitiesBean.DoitacList;
import Global.SessionBean;
 
import LocalModel.VwLichsuGdListWeb;
import LocalModel.VwTkttBiennhanDetail;
import LocalModel.VwTkttBiennhanMaster;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import LocalFuntionGlobal.*;

@Named(value = "timkiemttbiennhanManagedBean")
@SessionScoped
public class TimkiemttbiennhanManagedBean implements Serializable {

    private List<VwTkttBiennhanMaster> vwTkttBiennhanMasters;
    private List<VwTkttBiennhanDetail> vwTkttBiennhanDetails;
    private List<VwXemdulieutkMaster> vwTkttMasters;
    private List<VwLichsuGdListWeb> vwLichsuGdListWebs;
    private VwTkttBiennhanMaster vwTkttBiennhanMaster; 
    private VwXemdulieutkMaster vwTkttMaster;
    private VwTkttBiennhanDetail vwTkttBiennhanDetail;
    private List<DmXacminhToday>  dmXacminhTodays ;
    private String chuoitimkiem;
    private String sobntimkiem;
    private String phamvitimkiem;
    private String doitactimkiem;
    private String thuoctinhtimkiem;
    private String prmuserid;

    
    
    
   public TimkiemttbiennhanManagedBean(){
       
         FunctionLocal func= new FunctionLocal();
         dmXacminhTodays= new ArrayList<>();
         dmXacminhTodays=func.dshosoxmtrongngay();
 
   }
 
         
    public void download(VwTkttBiennhanMaster chitiet) throws SQLException, IOException {

        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();

        ec.setResponseContentType("image/jpeg");

        if (chitiet == null) 
        {
        } else {
            String attachmentName = "attachment;filename=" + chitiet.getSobn() + ".jpg";
            ec.setResponseHeader("Content-Disposition", attachmentName);
            try (OutputStream out = ec.getResponseOutputStream()) {
                VwTkttBiennhanDetailDao dao = new VwTkttBiennhanDetailDao();
                InputStream inputStream;
                inputStream = dao.layhinhbiennhan(chitiet.getIdchinhanh(), chitiet.getIdcode(), chitiet.getStt());
                byte[] outputByte = new byte[4096];

                while (inputStream.read(outputByte, 0, 4096) != -1) {
                    out.write(outputByte, 0, 4096);
                }
                out.flush();
                fc.responseComplete();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public List<DoitacList> dsdoitacTimkiem() throws SQLException {

        DoitacListDao dao = new DoitacListDao();
        List<DoitacList> dsdoitac = new ArrayList<>();
     //   dsdoitac = dao.getdoitacTimkiem();

        return dsdoitac;
    }

    public String laythongtindetail() {
        vwTkttBiennhanDetails = new ArrayList<>();
        VwTkttBiennhanDetailDao dao = new VwTkttBiennhanDetailDao();
        //Lấy thông tin detail
        vwTkttBiennhanDetails = dao.timtheodieukien(vwTkttBiennhanMaster.getManguoinhan(), vwTkttBiennhanMaster.getIddoitac());
        if (vwTkttBiennhanDetails == null || vwTkttBiennhanDetails.isEmpty()) {

        } else {
            vwTkttBiennhanDetail = new VwTkttBiennhanDetail();
            vwTkttBiennhanDetail = vwTkttBiennhanDetails.get(0);
        }
        //Lấy danh sách xác minh
        VwLichsuGdListWebDao dao1 = new VwLichsuGdListWebDao();
        vwLichsuGdListWebs = dao1.timtheomabiennhan(vwTkttBiennhanMaster.getMabiennhan());

        return "timkiemthongtinbiennhan" + "?faces-redirect=true";
    }

    public void laythongtinmastertheosobn(String loaitk,String giatri) {

        vwTkttBiennhanMasters = new ArrayList<>();
        String userid=SessionBean.getUserId();
        VwTkttBiennhanMasterDao dao = new VwTkttBiennhanMasterDao();
        //Tìm theo số biên nhận
        String dk = dao.timtheosobn(giatri,userid);
        if (dk.equalsIgnoreCase("T"))
          {
              vwTkttBiennhanMasters=dao.showthongtin(userid);
          } 
 

    }

    public void laythongtinmaster(String loaitk,String giatri ) {

        vwTkttBiennhanMasters = new ArrayList<>();
        String userid=SessionBean.getUserId();
        String chinhanh=SessionBean.getChinhanhId();
        VwTkttBiennhanMasterDao dao = new VwTkttBiennhanMasterDao();
        //Tìm theo số biên nhận
        String dk = dao.timtheodktongcn(loaitk,giatri,userid,chinhanh);
        if (dk.equalsIgnoreCase("T"))
          {
              vwTkttBiennhanMasters=dao.showthongtin(userid);
      
          } 
    }
    
    public String laythongtinchitietbiennhan(VwXemdulieutkMaster gdkhachhang) {

        vwTkttMasters = new ArrayList<>();

        vwTkttMasters.add(gdkhachhang);
        return "chitietbiennhan" + "?faces-redirect=true";
    }
     

    public List<VwTkttBiennhanMaster> timtrongtuan() {
        vwTkttBiennhanMasters = new ArrayList<>();
        VwTkttBiennhanMasterDao dao = new VwTkttBiennhanMasterDao();
        String idchinhanh = SessionBean.getChinhanhId();
        String tuan = "TUAN";
        switch (thuoctinhtimkiem) {
            case "00001"://Mã người nhận
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "MA_NGUOINHAN", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00002"://Số biên nhận
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "SOBN", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00003"://Họ tên
                if (chuoitimkiem.replaceAll("\\s", "").trim().length() < 5) {
//                    SystemBean.proMessError("Số ký tự nhập vào phải lớn hơn 4");
                } else {
                    vwTkttBiennhanMasters = dao.timhotentheodieukien(tuan, chuoitimkiem, phamvitimkiem, idchinhanh);
                }
                break;
            case "00004"://Số giấy tờ
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "GIAYTO_HOTEN", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00005"://Số điện thoại
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "DIENTHOAI", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00006"://Seq
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "PAYAGENTSEQ", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00007"://Agent
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "AGENT", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00008"://ID agent
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "ID_AGENT", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00009"://Pin
                vwTkttBiennhanMasters = dao.timtheodieukien(tuan, "PIN_NO", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00010"://Order num
                break;
        }
        return vwTkttBiennhanMasters;
    }

    public List<VwTkttBiennhanMaster> timtatca() {
        vwTkttBiennhanMasters = new ArrayList<>();
        VwTkttBiennhanMasterDao dao = new VwTkttBiennhanMasterDao();
        String idchinhanh = SessionBean.getChinhanhId();
        String tatca = "TATCA";
        switch (thuoctinhtimkiem) {
            case "00001"://Mã người nhận
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "MA_NGUOINHAN", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00002"://Số biên nhận
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "SOBN", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00003"://Họ tên
                if (chuoitimkiem.replaceAll("\\s", "").trim().length() < 5) {
//                    SystemBean.proMessError("Số ký tự nhập vào phải lớn hơn 4");
                } else {
                    vwTkttBiennhanMasters = dao.timhotentheodieukien(tatca, chuoitimkiem, phamvitimkiem, idchinhanh);
                }
                break;
            case "00004"://Số giấy tờ
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "GIAYTO_HOTEN", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00005"://Số điện thoại
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "DIENTHOAI", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00006"://Seq
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "PAYAGENTSEQ", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00007"://Agent
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "AGENT", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00008"://ID agent
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "ID_AGENT", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00009"://Pin
                vwTkttBiennhanMasters = dao.timtheodieukien(tatca, "PIN_NO", chuoitimkiem, phamvitimkiem, idchinhanh, doitactimkiem);
                break;
            case "00010"://Order num
                break;
        }
        return vwTkttBiennhanMasters;
    }

    //get set
    public String getSobntimkiem() {
        return sobntimkiem;
    }

    public void setSobntimkiem(String sobntimkiem) {
        this.sobntimkiem = sobntimkiem;
    }

    public String getPrmuserid() {
        return prmuserid;
    }

    public void setPrmuserid(String prmuserid) {
        this.prmuserid = prmuserid;
    }

    public List<VwLichsuGdListWeb> getVwLichsuGdListWebs() {
        return vwLichsuGdListWebs;
    }

    public void setVwLichsuGdListWebs(List<VwLichsuGdListWeb> vwLichsuGdListWebs) {
        this.vwLichsuGdListWebs = vwLichsuGdListWebs;
    }

    public VwTkttBiennhanDetail getVwTkttBiennhanDetail() {
        return vwTkttBiennhanDetail;
    }

    public void setVwTkttBiennhanDetail(VwTkttBiennhanDetail vwTkttBiennhanDetail) {
        this.vwTkttBiennhanDetail = vwTkttBiennhanDetail;
    }

    public VwTkttBiennhanMaster getVwTkttBiennhanMaster() {
        return vwTkttBiennhanMaster;
    }

    public void setVwTkttBiennhanMaster(VwTkttBiennhanMaster vwTkttBiennhanMaster) {
        this.vwTkttBiennhanMaster = vwTkttBiennhanMaster;
    }

    public List<VwTkttBiennhanDetail> getVwTkttBiennhanDetails() {
        return vwTkttBiennhanDetails;
    }

    public void setVwTkttBiennhanDetails(List<VwTkttBiennhanDetail> vwTkttBiennhanDetails) {
        this.vwTkttBiennhanDetails = vwTkttBiennhanDetails;
    }

    public String getThuoctinhtimkiem() {
        return thuoctinhtimkiem;
    }

    public void setThuoctinhtimkiem(String thuoctinhtimkiem) {
        this.thuoctinhtimkiem = thuoctinhtimkiem;
    }

    public List<VwTkttBiennhanMaster> getVwTkttBiennhanMasters() {
        return vwTkttBiennhanMasters;
    }

    public void setVwTkttBiennhanMasters(List<VwTkttBiennhanMaster> vwTkttBiennhanMasters) {
        this.vwTkttBiennhanMasters = vwTkttBiennhanMasters;
    }

    public String getPhamvitimkiem() {
        return phamvitimkiem;
    }

    public void setPhamvitimkiem(String phamvitimkiem) {
        this.phamvitimkiem = phamvitimkiem;
    }

    public String getDoitactimkiem() {
        return doitactimkiem;
    }

    public void setDoitactimkiem(String doitactimkiem) {
        this.doitactimkiem = doitactimkiem;
    }

    public String getChuoitimkiem() {
        return chuoitimkiem;
    }

    public void setChuoitimkiem(String chuoitimkiem) {
        this.chuoitimkiem = chuoitimkiem;
    }

    public List<VwXemdulieutkMaster> getVwTkttMasters() {
        return vwTkttMasters;
    }

    public void setVwTkttMasters(List<VwXemdulieutkMaster> vwTkttMasters) {
        this.vwTkttMasters = vwTkttMasters;
    }

    public VwXemdulieutkMaster getVwTkttMaster() {
        return vwTkttMaster;
    }

    public void setVwTkttMaster(VwXemdulieutkMaster vwTkttMaster) {
        this.vwTkttMaster = vwTkttMaster;
    }
    
    

}
