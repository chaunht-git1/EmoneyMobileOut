package DatabaseDao;

import ApiFunction.ApiFun;
import ConnectBean.ConnectionProvider;
import LocalModel.DmXacminhToday;
import LocalModel.VwTkttBiennhanMaster;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.jboss.classfilewriter.annotations.CharAnnotationValue;

public class VwTkttBiennhanMasterDao {

    private String sql = " SELECT * FROM KHOUT.VW_XEMDULIEUTK_MASTER ";
    private List<VwTkttBiennhanMaster> vwTkttBiennhanMasters = new ArrayList<>();

      public List<VwTkttBiennhanMaster> showthongtin(String userid) {
       List<VwTkttBiennhanMaster> biennhanMasters = new ArrayList<>();
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();

        sql += "WHERE USER_ID="+"'"+userid+"'";
        try {
            Statement s = con.createStatement();
            s.setQueryTimeout(1800);
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                VwTkttBiennhanMaster d = new VwTkttBiennhanMaster();
                d.setIdcode(rs.getString("ID_CODE"));
                d.setHoten(rs.getString("HOTEN"));
                d.setHotenxuly(rs.getString("HOTEN_XULY"));
                d.setDienthoai(rs.getString("DIENTHOAI"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setIdchinhanh(rs.getString("ID_CHINHANH"));
                d.setChinhanhname(rs.getString("CHINHANH_NAME"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                //d.setSobn(rs.getInt("SOBN"));
                d.setGiaytohoten(rs.getString("GIAYTO_HOTEN"));
                d.setPayagentseq(rs.getString("PAYAGENTSEQ"));
                d.setAgent(rs.getString("AGENT"));
                d.setIdagent(rs.getString("ID_AGENT"));
                d.setPinno(rs.getString("PIN_NO"));
                d.setNgaynhaplieu(rs.getDate("NGAY_NHAPLIEU"));
                d.setMabiennhan(rs.getString("MABIENNHAN"));
                d.setNgaychitra(rs.getDate("NGAY_CHITRA"));
                d.setDiachi(rs.getString("DIACHI"));
                d.setSo_ct_tuythan(rs.getString("SO_CT_TUYTHAN"));
                d.setId_nv_chitra(rs.getString("ID_NV_CHITRA"));
                d.setNguoigoi(rs.getString("NGUOIGOI"));
                d.setDachitra(rs.getString("DACHITRA"));
                d.setId_diadiemchitra(rs.getString("ID_DIADIEMCHITRA"));

                d.setSolandichitra(rs.getInt("SOLANDICHITRA"));
                d.setDanhanphieu(rs.getString("DANHANPHIEU"));
                d.setIdcttuythan(rs.getString("ID_CT_TUYTHAN"));
                d.setLoaigiayto(rs.getString("LOAIGIAYTO"));


                d.setSotiengoi(rs.getBigDecimal("SOTIENGOI"));
                d.setTygia(rs.getBigDecimal("TYGIA"));
                d.setThanhtien(rs.getBigDecimal("THANHTIEN"));
                d.setIdloaitienchitra(rs.getString("ID_LOAITIENCHITRA"));
                d.setIdloaitiengoi(rs.getString("ID_LOAITIENGOI"));
                d.setIdloaicongno(rs.getString("ID_LOAICONGNO"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setIdcity(rs.getString("ID_CITY"));
                d.setCityname(rs.getString("CITY_NAME"));
  
                d.setIdnvbaocao(rs.getString("ID_NV_BAOCAO"));
                d.setIdnvxacnhan(rs.getString("ID_NV_XACNHAN"));
                d.setIdnvbiennhan(rs.getString("ID_NV_BIENNHAN"));
                d.setKhachhangnhan(rs.getString("KHACHHANG_NHAN"));

                d.setXacminh(rs.getString("XACMINH"));
                d.setGhichu(rs.getString("GHICHU"));
                d.setLydoxmnk(rs.getString("LYDO_XMNK"));
                d.setIdnvnhaplieu(rs.getString("ID_NV_NHAPLIEU"));
                d.setIdnvtruyenfile(rs.getString("ID_NV_TRUYENFILE"));
                d.setDatetruyenfile(rs.getDate("DATE_TRUYENFILE"));
                d.setIdnvupdate(rs.getString("ID_NV_UPDATE"));
                d.setIdnvxoaphieu(rs.getString("ID_NV_XOAPHIEU"));
                d.setLydoxoaphieu(rs.getString("LYDOXOAPHIEU"));
                d.setIdnvkt(rs.getString("ID_NV_KT"));
            
                d.setIdthanhtoan(rs.getString("ID_THANHTOAN"));
                d.setCongtacvien(rs.getString("CONGTACVIEN"));
               
               
                d.setExtorder(rs.getString("EXT_ORDER"));
                d.setSocttuythan(rs.getString("SO_CT_TUYTHAN"));
                d.setIddistrict(rs.getString("ID_DISTRICT"));
                d.setDistrictname(rs.getString("DISTRICT_NAME"));
                d.setNgaychitratrue(rs.getDate("NGAY_CHITRA_TRUE"));
                d.setNgaychitra(rs.getDate("NGAY_CHITRA"));
                d.setNgaybiennhan(rs.getDate("NGAY_BIENNHAN"));
                d.setNgayxacminh(rs.getDate("NGAY_XACMINH"));
                d.setNgaygiaophieu(rs.getDate("NGAYGIAOPHIEU"));
                d.setBiennhanc(rs.getString("BIENNHAN_C"));
                d.setDakiemtra(rs.getString("DAKIEMTRA"));
                d.setIdnvxacminh(rs.getString("ID_NV_XACMINH"));
                d.setNgaynhaplieu(rs.getDate("NGAY_NHAPLIEU"));
                d.setNgayupdate(rs.getString("NGAY_UPDATE"));
                d.setNgayxoaphieu(rs.getDate("NGAY_XOAPHIEU"));
                d.setNgaykiemtra(rs.getDate("NGAY_KIEMTRA"));

                
                d.setSolanin(rs.getInt("SOLANIN"));
                d.setNhapho(rs.getString("NHAPHO"));
                d.setMakhachhang(rs.getString("MA_KHACHHANG"));
                d.setHoten1(rs.getString("HOTEN_1"));
                d.setGiaytohoten(rs.getString("GIAYTO_HOTEN"));
                d.setHoten2(rs.getString("HOTEN_2"));
                d.setGiaytohoten2(rs.getString("GIAYTO_HOTEN_2"));
                d.setGhichugoi(rs.getString("GHICHU_GOI"));
                d.setIdnvduyetchuyencn(rs.getString("ID_NV_DUYET_CHUYENCN"));
                d.setIdnvycchuyencn(rs.getString("ID_NV_YC_CHUYENCN"));
                d.setNgaychuyencn(rs.getDate("NGAY_CHUYENCN"));
                d.setNgayyeucauchuyencn(rs.getDate("NGAY_YEUCAU_CHUYENCN"));
                d.setLydoupdate(rs.getString("LYDO_UPDATE"));
                d.setLydoycchuyencn(rs.getString("LYDO_YC_CHUYENCN"));
                d.setDienthoaigoc(rs.getString("DIENTHOAI_GOC"));
                d.setDiachigoc(rs.getString("DIACHI_GOC"));

                d.setNgaycap(rs.getDate("NGAYCAP"));
                d.setIdnoicap(rs.getString("ID_NOICAP"));
                d.setNoicapname(rs.getString("NOICAP_NAME"));
                d.setIdbank(rs.getString("ID_BANK"));
                d.setBankname(rs.getString("BANK_NAME"));
                d.setDotck(rs.getInt("DOTCK"));
                d.setDack(rs.getString("DACK"));
                d.setIdnvck(rs.getString("ID_NV_CK"));
                d.setNgayck(rs.getDate("NGAY_CK"));
                d.setCktienmat(rs.getString("CK_TIENMAT"));
                d.setIdnvduyetctck(rs.getString("ID_NV_DUYET_CTCK"));
                d.setNgayxnck(rs.getDate("NGAY_XNCK"));
                d.setNgayxacnhan(rs.getDate("NGAYXACNHAN"));
                d.setXacnhanck(rs.getString("XACNHAN_CK"));
                d.setGhichuck(rs.getString("GHICHU_CK"));
                d.setSotaikhoankh(rs.getString("SOTAIKHOANKH"));
                d.setNoinhantien(rs.getString("NOINHANTIEN"));
                
                s.close();
                con.close();
                
                try {
                    // Lay noi dung xac minh trong ngay . 
                  if(d.getId_diadiemchitra().equalsIgnoreCase("TN")){
                      ApiFun fun=new ApiFun();
                      DmXacminhToday dmXacminhToday=new DmXacminhToday();
                   //   dmXacminhToday=fun.noiDungxmtrongngay(d.getIdcode());
                      if(dmXacminhToday!=null)
                      {
                        d.setNoidungcmtoday(dmXacminhToday.getNoidungxm());
                        DateFormat df2 = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
                        String reportDate = df2.format(dmXacminhToday.getDateModified());
                        d.setNgaychuyencmtoday(reportDate);
                       // biennhanMasters.add(d);
                      }
                     
                  }
                } catch (Exception e) {
                    
                }
                
                
                
                biennhanMasters.add(d);
                

            }

        } catch (Exception e) {
            //vwTkttBiennhanMasters = new ArrayList<>();
        }

        return biennhanMasters;
    }
    
    
     public String timtheosobn(String dk, String userid) {

        try {
            String ketqua;
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            String fnCall = "{call ? := KH.PKS_TIMKIEM_WEB.Timtheosobiennhan(?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, dk);
            stm.setString(3, userid);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
            return ketqua;

        } catch (SQLException ex) {

          //  Bean.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return "";

        }

    }
     
     public String timtheodktongcn(String thuoctinh,String chuoitk, String userid,String chinhanh) {

        try {
            String ketqua;
            ConnectionProvider.reconnectdbastatic();
            Connection con = ConnectionProvider.getCon();
            con.clearWarnings();
            String fnCall = "{call ? := KH.PKS_TIMKIEM_WEB.Timkiemgiaodich(?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, chuoitk);
            stm.setString(3, userid);
            stm.setString(4, thuoctinh);
            stm.setString(5, chinhanh);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
            return ketqua;

        } catch (SQLException ex) {

          //  Bean.SystemBean.proMessError(AlertCustom.timMatKetNoiMang);
            return "";

        }

    }

    public List<VwTkttBiennhanMaster> timtheodieukien(String cachtim, String thuoctinh, String giatri, String phamvitimkiem, String idchinhanh, String iddoitac) {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        //Tìm dữ liệu trong tuần hay tìm tất cả
        switch (cachtim) {
            case "TUAN"://Tìm trong tuần
                switch (phamvitimkiem) {
                    case "00001"://TÌM TRONG TUẦN TRÊN TOÀN HỆ THỐNG
                        sql += " WHERE NGAY_NHAPLIEU BETWEEN TRUNC(SYSDATE)-7 AND TRUNC(SYSDATE) AND ID_DOITAC = '" + iddoitac + "' AND " + thuoctinh + " = '" + giatri + "' AND ROWNUM < 4 ORDER BY NGAY_CHITRA DESC ";
                        break;
                    case "00002"://TÌM TRONG TUẦN THEO TỪNG CHI NHÁNH
                        sql += " WHERE NGAY_NHAPLIEU BETWEEN TRUNC(SYSDATE)-7 AND TRUNC(SYSDATE) AND ID_CHINHANH = " + "'" + idchinhanh + "' AND ID_DOITAC = '" + iddoitac + "' AND " + thuoctinh + " = '" + giatri + "' AND ROWNUM < 4 ORDER BY NGAY_CHITRA DESC ";
                        break;
                }
                break;
            case "TATCA"://Tìm tất cả
                switch (phamvitimkiem) {
                    case "00001"://TÌM TẤT CẢ TRÊN TOÀN HỆ THỐNG
                        sql += " WHERE NGAY_NHAPLIEU < TRUNC(SYSDATE)-7 AND ID_DOITAC = '" + iddoitac + "' AND " + thuoctinh + " = '" + giatri + "' AND ROWNUM < 4 ORDER BY NGAY_CHITRA DESC ";
                        break;
                    case "00002"://TÌM TẤT CẢ THEO TỪNG CHI NHÁNH
                        sql += " WHERE NGAY_NHAPLIEU < TRUNC(SYSDATE)-7 AND ID_CHINHANH = " + "'" + idchinhanh + "' AND ID_DOITAC = '" + iddoitac + "' AND " + thuoctinh + " = '" + giatri + "' AND ROWNUM < 4 ORDER BY NGAY_CHITRA DESC ";
                        break;
                }
                break;
        }

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VwTkttBiennhanMaster d = new VwTkttBiennhanMaster();

                d.setHoten(rs.getString("HOTEN"));
                d.setHotenxuly(rs.getString("HOTEN_XULY"));
                d.setDienthoai(rs.getString("DIENTHOAI"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setIdchinhanh(rs.getString("ID_CHINHANH"));
                d.setChinhanhname(rs.getString("CHINHANH_NAME"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
                //d.setSobn(rs.getInt("SOBN"));
                d.setGiaytohoten(rs.getString("GIAYTO_HOTEN"));
                d.setPayagentseq(rs.getString("PAYAGENTSEQ"));
                d.setAgent(rs.getString("AGENT"));
                d.setIdagent(rs.getString("ID_AGENT"));
                d.setPinno(rs.getString("PIN_NO"));
                d.setNgaynhaplieu(rs.getDate("NGAY_NHAPLIEU"));
                d.setMabiennhan(rs.getString("MABIENNHAN"));
                d.setNgaychitra(rs.getDate("NGAY_CHITRA"));

                vwTkttBiennhanMasters.add(d);
            }

            rs.close();
            ps.close();
            con.close();
            return vwTkttBiennhanMasters;
        } catch (Exception e) {
            vwTkttBiennhanMasters = new ArrayList<>();
            return vwTkttBiennhanMasters;
        }
    }

    public List<VwTkttBiennhanMaster> timhotentheodieukien(String cachtim, String giatritimkiem, String phamvitimkiem, String idchinhanh) {
        ConnectionProvider.reconnectdbastatic();
        Connection con = ConnectionProvider.getCon();
        //Tìm dữ liệu trong tuần hay tìm tất cả
        //Riêng tìm kiếm theo họ tên, chỉ cho tìm theo chi nhánh hiện tại

        switch (cachtim) {
            case "TUAN"://TÌM TRONG TUẦN THEO CHI NHÁNH ĐĂNG NHẬP
                sql += " WHERE NGAY_NHAPLIEU BETWEEN TRUNC(SYSDATE)-7 AND TRUNC(SYSDATE) AND ID_CHINHANH = " + "'" + idchinhanh + "' AND HOTEN_XULY = TRANTOTEXT(CAT_KH_TRANG('" + giatritimkiem + "')) AND ROWNUM < 4 ORDER BY NGAY_CHITRA DESC ";
                break;
            case "TATCA"://TÌM TRONG THÁNG THEO CHI NHÁNH ĐĂNG NHẬP
                sql += " WHERE NGAY_NHAPLIEU <  TRUNC(SYSDATE)-7 AND ID_CHINHANH = " + "'" + idchinhanh + "' AND HOTEN_XULY = TRANTOTEXT(CAT_KH_TRANG('" + giatritimkiem + "')) AND ROWNUM < 4 ORDER BY NGAY_CHITRA DESC ";
                break;
        }

        /*
         switch (cachtim) {
         case "TUAN"://Tìm trong tuần
         switch (phamvitimkiem) {
         case "00001"://TÌM TRONG TUẦN TRÊN TOÀN HỆ THỐNG
         sql += " WHERE NGAY_NHAPLIEU BETWEEN TRUNC(SYSDATE)-7 AND TRUNC(SYSDATE) AND HOTEN_XULY LIKE'%'||TRANTOTEXT(CAT_KH_TRANG('" + giatritimkiem + "'))||'%' ";
         break;
         case "00002"://TÌM TRONG TUẦN THEO TỪNG CHI NHÁNH
         sql += " WHERE NGAY_NHAPLIEU BETWEEN TRUNC(SYSDATE)-7 AND TRUNC(SYSDATE) AND ID_CHINHANH = " + "'" + idchinhanh + "' AND HOTEN_XULY LIKE'%'||TRANTOTEXT(CAT_KH_TRANG('" + giatritimkiem + "'))||'%' ";
         break;
         }
         break;
         case "TATCA"://Tìm tất cả
         switch (phamvitimkiem) {
         case "00001"://TÌM TẤT CẢ TRÊN TOÀN HỆ THỐNG
         sql += " WHERE NGAY_NHAPLIEU < TRUNC(SYSDATE)-7 AND HOTEN_XULY LIKE '%'||TRANTOTEXT(CAT_KH_TRANG('" + giatritimkiem + "'))||'%' ";
         break;
         case "00002"://TÌM TẤT CẢ THEO TỪNG CHI NHÁNH
         sql += " WHERE NGAY_NHAPLIEU < TRUNC(SYSDATE)-7 AND ID_CHINHANH = " + "'" + idchinhanh + "' AND HOTEN_XULY LIKE '%'||TRANTOTEXT(CAT_KH_TRANG('" + giatritimkiem + "'))||'%' ";
         break;
         }
         break;
         }
         */
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setQueryTimeout(1800);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VwTkttBiennhanMaster d = new VwTkttBiennhanMaster();

                d.setHoten(rs.getString("HOTEN"));
                d.setHotenxuly(rs.getString("HOTEN_XULY"));
                d.setDienthoai(rs.getString("DIENTHOAI"));
                d.setManguoinhan(rs.getString("MA_NGUOINHAN"));
                d.setIdchinhanh(rs.getString("ID_CHINHANH"));
                d.setChinhanhname(rs.getString("CHINHANH_NAME"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDoitacname(rs.getString("DOITAC_NAME"));
               // d.setSobn(rs.getInt("SOBN"));
                d.setGiaytohoten(rs.getString("GIAYTO_HOTEN"));
                d.setPayagentseq(rs.getString("PAYAGENTSEQ"));
                d.setAgent(rs.getString("AGENT"));
                d.setIdagent(rs.getString("ID_AGENT"));
                d.setPinno(rs.getString("PIN_NO"));
                d.setNgaynhaplieu(rs.getDate("NGAY_NHAPLIEU"));
                d.setMabiennhan(rs.getString("MABIENNHAN"));
                d.setNgaychitra(rs.getDate("NGAY_CHITRA"));

                vwTkttBiennhanMasters.add(d);
            }

            rs.close();
            ps.close();
            con.close();
            return vwTkttBiennhanMasters;
        } catch (Exception e) {
            vwTkttBiennhanMasters = new ArrayList<>();
            return vwTkttBiennhanMasters;
        }
    }
}
