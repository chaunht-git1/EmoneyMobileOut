 
package Entities;

import java.util.Date;

 
public class UserModel {
    
 
    private  String userId ;
    private  String userName;
    private  String password  ; 
    private  String homeBranch ;
    private  String socm ;
    private  Date   ngaycap ;
    private  String noicap ; 
    private  String diachi ;
    private  String dienthoai;
    private  String email ;
    private String tenhethong;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getSocm() {
        return socm;
    }

    public void setSocm(String socm) {
        this.socm = socm;
    }

    public Date getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(Date ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getNoicap() {
        return noicap;
    }

    public void setNoicap(String noicap) {
        this.noicap = noicap;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getTenhethong() {
        return tenhethong;
    }

    public void setTenhethong(String tenhethong) {
        this.tenhethong = tenhethong;
    }
    
}
