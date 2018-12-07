/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesBean;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "TABLE_IMPORTDATA_API")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableImportdataApi.findAll", query = "SELECT t FROM TableImportdataApi t"),
    @NamedQuery(name = "TableImportdataApi.findByIdCode", query = "SELECT t FROM TableImportdataApi t WHERE t.idCode = :idCode"),
    @NamedQuery(name = "TableImportdataApi.findByIdDoitac", query = "SELECT t FROM TableImportdataApi t WHERE t.idDoitac = :idDoitac"),
    @NamedQuery(name = "TableImportdataApi.findByDataImport", query = "SELECT t FROM TableImportdataApi t WHERE t.dataImport = :dataImport"),
    @NamedQuery(name = "TableImportdataApi.findByCot1", query = "SELECT t FROM TableImportdataApi t WHERE t.cot1 = :cot1"),
    @NamedQuery(name = "TableImportdataApi.findByCot2", query = "SELECT t FROM TableImportdataApi t WHERE t.cot2 = :cot2"),
    @NamedQuery(name = "TableImportdataApi.findByCot3", query = "SELECT t FROM TableImportdataApi t WHERE t.cot3 = :cot3"),
    @NamedQuery(name = "TableImportdataApi.findByCot4", query = "SELECT t FROM TableImportdataApi t WHERE t.cot4 = :cot4"),
    @NamedQuery(name = "TableImportdataApi.findByCot5", query = "SELECT t FROM TableImportdataApi t WHERE t.cot5 = :cot5"),
    @NamedQuery(name = "TableImportdataApi.findByCot6", query = "SELECT t FROM TableImportdataApi t WHERE t.cot6 = :cot6"),
    @NamedQuery(name = "TableImportdataApi.findByCot7", query = "SELECT t FROM TableImportdataApi t WHERE t.cot7 = :cot7"),
    @NamedQuery(name = "TableImportdataApi.findBySttCol", query = "SELECT t FROM TableImportdataApi t WHERE t.sttCol = :sttCol"),
    @NamedQuery(name = "TableImportdataApi.findByCot8", query = "SELECT t FROM TableImportdataApi t WHERE t.cot8 = :cot8"),
    @NamedQuery(name = "TableImportdataApi.findByCot9", query = "SELECT t FROM TableImportdataApi t WHERE t.cot9 = :cot9"),
    @NamedQuery(name = "TableImportdataApi.findByCot10", query = "SELECT t FROM TableImportdataApi t WHERE t.cot10 = :cot10"),
    @NamedQuery(name = "TableImportdataApi.findByCot11", query = "SELECT t FROM TableImportdataApi t WHERE t.cot11 = :cot11"),
    @NamedQuery(name = "TableImportdataApi.findByCot12", query = "SELECT t FROM TableImportdataApi t WHERE t.cot12 = :cot12"),
    @NamedQuery(name = "TableImportdataApi.findByCot13", query = "SELECT t FROM TableImportdataApi t WHERE t.cot13 = :cot13"),
    @NamedQuery(name = "TableImportdataApi.findByCot14", query = "SELECT t FROM TableImportdataApi t WHERE t.cot14 = :cot14"),
    @NamedQuery(name = "TableImportdataApi.findByCot15", query = "SELECT t FROM TableImportdataApi t WHERE t.cot15 = :cot15"),
    @NamedQuery(name = "TableImportdataApi.findByCot16", query = "SELECT t FROM TableImportdataApi t WHERE t.cot16 = :cot16"),
    @NamedQuery(name = "TableImportdataApi.findByCot17", query = "SELECT t FROM TableImportdataApi t WHERE t.cot17 = :cot17"),
    @NamedQuery(name = "TableImportdataApi.findByCot18", query = "SELECT t FROM TableImportdataApi t WHERE t.cot18 = :cot18"),
    @NamedQuery(name = "TableImportdataApi.findByCot19", query = "SELECT t FROM TableImportdataApi t WHERE t.cot19 = :cot19"),
    @NamedQuery(name = "TableImportdataApi.findByCot20", query = "SELECT t FROM TableImportdataApi t WHERE t.cot20 = :cot20"),
    @NamedQuery(name = "TableImportdataApi.findByCot21", query = "SELECT t FROM TableImportdataApi t WHERE t.cot21 = :cot21"),
    @NamedQuery(name = "TableImportdataApi.findByCot22", query = "SELECT t FROM TableImportdataApi t WHERE t.cot22 = :cot22"),
    @NamedQuery(name = "TableImportdataApi.findByCot23", query = "SELECT t FROM TableImportdataApi t WHERE t.cot23 = :cot23"),
    @NamedQuery(name = "TableImportdataApi.findByCot24", query = "SELECT t FROM TableImportdataApi t WHERE t.cot24 = :cot24"),
    @NamedQuery(name = "TableImportdataApi.findByCot25", query = "SELECT t FROM TableImportdataApi t WHERE t.cot25 = :cot25"),
    @NamedQuery(name = "TableImportdataApi.findByCot26", query = "SELECT t FROM TableImportdataApi t WHERE t.cot26 = :cot26"),
    @NamedQuery(name = "TableImportdataApi.findByCot27", query = "SELECT t FROM TableImportdataApi t WHERE t.cot27 = :cot27"),
    @NamedQuery(name = "TableImportdataApi.findByCot28", query = "SELECT t FROM TableImportdataApi t WHERE t.cot28 = :cot28"),
    @NamedQuery(name = "TableImportdataApi.findByCot29", query = "SELECT t FROM TableImportdataApi t WHERE t.cot29 = :cot29"),
    @NamedQuery(name = "TableImportdataApi.findByCot30", query = "SELECT t FROM TableImportdataApi t WHERE t.cot30 = :cot30"),
    @NamedQuery(name = "TableImportdataApi.findByCot31", query = "SELECT t FROM TableImportdataApi t WHERE t.cot31 = :cot31"),
    @NamedQuery(name = "TableImportdataApi.findByCot32", query = "SELECT t FROM TableImportdataApi t WHERE t.cot32 = :cot32"),
    @NamedQuery(name = "TableImportdataApi.findByCot33", query = "SELECT t FROM TableImportdataApi t WHERE t.cot33 = :cot33"),
    @NamedQuery(name = "TableImportdataApi.findByCot34", query = "SELECT t FROM TableImportdataApi t WHERE t.cot34 = :cot34"),
    @NamedQuery(name = "TableImportdataApi.findByCot35", query = "SELECT t FROM TableImportdataApi t WHERE t.cot35 = :cot35"),
    @NamedQuery(name = "TableImportdataApi.findByCot36", query = "SELECT t FROM TableImportdataApi t WHERE t.cot36 = :cot36"),
    @NamedQuery(name = "TableImportdataApi.findByCot37", query = "SELECT t FROM TableImportdataApi t WHERE t.cot37 = :cot37"),
    @NamedQuery(name = "TableImportdataApi.findByCot38", query = "SELECT t FROM TableImportdataApi t WHERE t.cot38 = :cot38"),
    @NamedQuery(name = "TableImportdataApi.findByCot39", query = "SELECT t FROM TableImportdataApi t WHERE t.cot39 = :cot39"),
    @NamedQuery(name = "TableImportdataApi.findByCot40", query = "SELECT t FROM TableImportdataApi t WHERE t.cot40 = :cot40"),
    @NamedQuery(name = "TableImportdataApi.findByApikey", query = "SELECT t FROM TableImportdataApi t WHERE t.apikey = :apikey"),
    @NamedQuery(name = "TableImportdataApi.findByMaQlds", query = "SELECT t FROM TableImportdataApi t WHERE t.maQlds = :maQlds")})
public class TableImportdataApi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 4000)
    @Column(name = "DATA_IMPORT")
    private String dataImport;
    @Size(max = 200)
    @Column(name = "COT_1")
    private String cot1;
    @Size(max = 400)
    @Column(name = "COT_2")
    private String cot2;
    @Size(max = 400)
    @Column(name = "COT_3")
    private String cot3;
    @Size(max = 400)
    @Column(name = "COT_4")
    private String cot4;
    @Size(max = 400)
    @Column(name = "COT_5")
    private String cot5;
    @Size(max = 400)
    @Column(name = "COT_6")
    private String cot6;
    @Size(max = 400)
    @Column(name = "COT_7")
    private String cot7;
    @Column(name = "STT_COL")
    private BigInteger sttCol;
    @Size(max = 400)
    @Column(name = "COT_8")
    private String cot8;
    @Size(max = 400)
    @Column(name = "COT_9")
    private String cot9;
    @Size(max = 400)
    @Column(name = "COT_10")
    private String cot10;
    @Size(max = 400)
    @Column(name = "COT_11")
    private String cot11;
    @Size(max = 400)
    @Column(name = "COT_12")
    private String cot12;
    @Size(max = 400)
    @Column(name = "COT_13")
    private String cot13;
    @Size(max = 400)
    @Column(name = "COT_14")
    private String cot14;
    @Size(max = 400)
    @Column(name = "COT_15")
    private String cot15;
    @Size(max = 400)
    @Column(name = "COT_16")
    private String cot16;
    @Size(max = 400)
    @Column(name = "COT_17")
    private String cot17;
    @Size(max = 400)
    @Column(name = "COT_18")
    private String cot18;
    @Size(max = 400)
    @Column(name = "COT_19")
    private String cot19;
    @Size(max = 400)
    @Column(name = "COT_20")
    private String cot20;
    @Size(max = 400)
    @Column(name = "COT_21")
    private String cot21;
    @Size(max = 400)
    @Column(name = "COT_22")
    private String cot22;
    @Size(max = 400)
    @Column(name = "COT_23")
    private String cot23;
    @Size(max = 400)
    @Column(name = "COT_24")
    private String cot24;
    @Size(max = 400)
    @Column(name = "COT_25")
    private String cot25;
    @Size(max = 400)
    @Column(name = "COT_26")
    private String cot26;
    @Size(max = 400)
    @Column(name = "COT_27")
    private String cot27;
    @Size(max = 400)
    @Column(name = "COT_28")
    private String cot28;
    @Size(max = 400)
    @Column(name = "COT_29")
    private String cot29;
    @Size(max = 400)
    @Column(name = "COT_30")
    private String cot30;
    @Size(max = 400)
    @Column(name = "COT_31")
    private String cot31;
    @Size(max = 400)
    @Column(name = "COT_32")
    private String cot32;
    @Size(max = 400)
    @Column(name = "COT_33")
    private String cot33;
    @Size(max = 400)
    @Column(name = "COT_34")
    private String cot34;
    @Size(max = 400)
    @Column(name = "COT_35")
    private String cot35;
    @Size(max = 400)
    @Column(name = "COT_36")
    private String cot36;
    @Size(max = 400)
    @Column(name = "COT_37")
    private String cot37;
    @Size(max = 400)
    @Column(name = "COT_38")
    private String cot38;
    @Size(max = 400)
    @Column(name = "COT_39")
    private String cot39;
    @Size(max = 400)
    @Column(name = "COT_40")
    private String cot40;
    @Size(max = 1000)
    @Column(name = "APIKEY")
    private String apikey;
    @Size(max = 40)
    @Column(name = "MA_QLDS")
    private String maQlds;

    public TableImportdataApi() {
    }

    public TableImportdataApi(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getDataImport() {
        return dataImport;
    }

    public void setDataImport(String dataImport) {
        this.dataImport = dataImport;
    }

    public String getCot1() {
        return cot1;
    }

    public void setCot1(String cot1) {
        this.cot1 = cot1;
    }

    public String getCot2() {
        return cot2;
    }

    public void setCot2(String cot2) {
        this.cot2 = cot2;
    }

    public String getCot3() {
        return cot3;
    }

    public void setCot3(String cot3) {
        this.cot3 = cot3;
    }

    public String getCot4() {
        return cot4;
    }

    public void setCot4(String cot4) {
        this.cot4 = cot4;
    }

    public String getCot5() {
        return cot5;
    }

    public void setCot5(String cot5) {
        this.cot5 = cot5;
    }

    public String getCot6() {
        return cot6;
    }

    public void setCot6(String cot6) {
        this.cot6 = cot6;
    }

    public String getCot7() {
        return cot7;
    }

    public void setCot7(String cot7) {
        this.cot7 = cot7;
    }

    public BigInteger getSttCol() {
        return sttCol;
    }

    public void setSttCol(BigInteger sttCol) {
        this.sttCol = sttCol;
    }

    public String getCot8() {
        return cot8;
    }

    public void setCot8(String cot8) {
        this.cot8 = cot8;
    }

    public String getCot9() {
        return cot9;
    }

    public void setCot9(String cot9) {
        this.cot9 = cot9;
    }

    public String getCot10() {
        return cot10;
    }

    public void setCot10(String cot10) {
        this.cot10 = cot10;
    }

    public String getCot11() {
        return cot11;
    }

    public void setCot11(String cot11) {
        this.cot11 = cot11;
    }

    public String getCot12() {
        return cot12;
    }

    public void setCot12(String cot12) {
        this.cot12 = cot12;
    }

    public String getCot13() {
        return cot13;
    }

    public void setCot13(String cot13) {
        this.cot13 = cot13;
    }

    public String getCot14() {
        return cot14;
    }

    public void setCot14(String cot14) {
        this.cot14 = cot14;
    }

    public String getCot15() {
        return cot15;
    }

    public void setCot15(String cot15) {
        this.cot15 = cot15;
    }

    public String getCot16() {
        return cot16;
    }

    public void setCot16(String cot16) {
        this.cot16 = cot16;
    }

    public String getCot17() {
        return cot17;
    }

    public void setCot17(String cot17) {
        this.cot17 = cot17;
    }

    public String getCot18() {
        return cot18;
    }

    public void setCot18(String cot18) {
        this.cot18 = cot18;
    }

    public String getCot19() {
        return cot19;
    }

    public void setCot19(String cot19) {
        this.cot19 = cot19;
    }

    public String getCot20() {
        return cot20;
    }

    public void setCot20(String cot20) {
        this.cot20 = cot20;
    }

    public String getCot21() {
        return cot21;
    }

    public void setCot21(String cot21) {
        this.cot21 = cot21;
    }

    public String getCot22() {
        return cot22;
    }

    public void setCot22(String cot22) {
        this.cot22 = cot22;
    }

    public String getCot23() {
        return cot23;
    }

    public void setCot23(String cot23) {
        this.cot23 = cot23;
    }

    public String getCot24() {
        return cot24;
    }

    public void setCot24(String cot24) {
        this.cot24 = cot24;
    }

    public String getCot25() {
        return cot25;
    }

    public void setCot25(String cot25) {
        this.cot25 = cot25;
    }

    public String getCot26() {
        return cot26;
    }

    public void setCot26(String cot26) {
        this.cot26 = cot26;
    }

    public String getCot27() {
        return cot27;
    }

    public void setCot27(String cot27) {
        this.cot27 = cot27;
    }

    public String getCot28() {
        return cot28;
    }

    public void setCot28(String cot28) {
        this.cot28 = cot28;
    }

    public String getCot29() {
        return cot29;
    }

    public void setCot29(String cot29) {
        this.cot29 = cot29;
    }

    public String getCot30() {
        return cot30;
    }

    public void setCot30(String cot30) {
        this.cot30 = cot30;
    }

    public String getCot31() {
        return cot31;
    }

    public void setCot31(String cot31) {
        this.cot31 = cot31;
    }

    public String getCot32() {
        return cot32;
    }

    public void setCot32(String cot32) {
        this.cot32 = cot32;
    }

    public String getCot33() {
        return cot33;
    }

    public void setCot33(String cot33) {
        this.cot33 = cot33;
    }

    public String getCot34() {
        return cot34;
    }

    public void setCot34(String cot34) {
        this.cot34 = cot34;
    }

    public String getCot35() {
        return cot35;
    }

    public void setCot35(String cot35) {
        this.cot35 = cot35;
    }

    public String getCot36() {
        return cot36;
    }

    public void setCot36(String cot36) {
        this.cot36 = cot36;
    }

    public String getCot37() {
        return cot37;
    }

    public void setCot37(String cot37) {
        this.cot37 = cot37;
    }

    public String getCot38() {
        return cot38;
    }

    public void setCot38(String cot38) {
        this.cot38 = cot38;
    }

    public String getCot39() {
        return cot39;
    }

    public void setCot39(String cot39) {
        this.cot39 = cot39;
    }

    public String getCot40() {
        return cot40;
    }

    public void setCot40(String cot40) {
        this.cot40 = cot40;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getMaQlds() {
        return maQlds;
    }

    public void setMaQlds(String maQlds) {
        this.maQlds = maQlds;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCode != null ? idCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TableImportdataApi)) {
            return false;
        }
        TableImportdataApi other = (TableImportdataApi) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesBean.TableImportdataApi[ idCode=" + idCode + " ]";
    }
    
}
