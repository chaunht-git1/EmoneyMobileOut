package ConnectBean;

public interface Provider {
 
    

    
    String DBS_NAME = "kieuhoi";
    String URL_REPORT = "http://192.168.2.90/reports/rwservlet?config=";
    String SERVERNAME_REPORT = "rep_chitrakh_oracleas1";
    String REPORT_PATH = "/u05/kieuhoi/reports/VIE/";

    String DRIVER = "oracle.jdbc.driver.OracleDriver";
    String CONNECTION_URL = "jdbc:oracle:thin:@192.168.42.35:1521:khuat";
    String USERNAME = "kh";
    String PASSWORD = "2014nobody";
    String TENHETHONG = "Test";

    String DADABASEVW = "DatabaseView";
    String DADABASEKH = "DatabaseKieuhoi";
    //String BASE_DOMAIN ="rest.dongamoneytransfer.com.vn";
    String BASE_DOMAIN ="localhost:8080";
}
