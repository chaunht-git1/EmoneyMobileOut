 
package ConnectBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class SQLiteJDBCDriverConnection {
    
 
     public Connection connectSqlite(String filename) {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:src/main/resources/sqlite/"+filename;
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
             return conn;
        } catch (SQLException e) {
             return null;
        }
     } 
     
       public Boolean closeSqlite(Connection conn) {
            
            try {
               conn.close(); 
               return true;
            } catch (Exception e) {
               return false;
            }
 
        }
}
 

