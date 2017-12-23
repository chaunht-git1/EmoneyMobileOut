 
package ConnectBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entities.UserModel;
import java.sql.ResultSet;


 
public class UserDao {
    
    //BatloiBean blb=new  BatloiBean();
    
    
       public  boolean themNhanVien(UserModel user) throws SQLException{
 
       Connection con=ConnectionProvider.getCon();
      
        try {
 
            // Tạo một câu SQL có 2 tham số (?)
            String sql = "  Insert into  KH.SMTB_USER_DANGKY(USER_ID, USER_NAME, USER_PASSWORD, HOME_BRANCH, NGAYCAP ) " 
            +" Values(?, ?, ?, ?, ?)" ;

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);
            
         
            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất) 
 
            pstm.setString(1, user.getUserId());
            pstm.setString(2, user.getPassword());
            pstm.setString(3, user.getUserName());
            pstm.setString(4, user.getHomeBranch());
            pstm.setDate(5, new java.sql.Date(user.getNgaycap().getTime()));
            pstm.executeUpdate();
            pstm.close();
            //ResultSet rs = pstm.executeQuery() ;
 
            return true;
            
        } catch (Exception e) {
            
            return  false ;
        
        }
        
      
       
    }
    
    
    public   UserModel layThongUser(String Id) throws SQLException{
        
      
        Connection con=ConnectionProvider.getCon();
        UserModel Cn=new UserModel();
      
        try {
            

            // Tạo một câu SQL có 1 tham số (?)
            String sql = " SELECT USER_ID,USER_NAME,HOME_BRANCH FROM KH.SMTB_USER WHERE USER_ID= ?   ";

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            pstm.setString(1, Id);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                
                Cn.setHomeBranch(rs.getString("HOME_BRANCH"));
                Cn.setUserId(rs.getString("USER_ID"));
                Cn.setUserName(rs.getString("USER_NAME"));
                
            }
            pstm.close();
           
           
            return Cn;
            
        } catch (Exception e) {
            
            return  null ;
        
        }    
    
    
    
}
    
    
    
}
