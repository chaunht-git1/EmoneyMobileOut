package service;
 
import ConnectBean.Provider;
public class Track {
 
	String title;
	String urlkhout;
        String url;
        String connect_url;
        String tenhethong;
        String username;
        String password;
        String driver;
        String datadasevw;
        String datadasekh;
        String base_domain;
        

    public Track(String title, String urlkhout, String url ) {
        
        this.title = title;
        this.urlkhout = urlkhout;
        this.url = url;
        this.connect_url="connect_url-"+Provider.CONNECTION_URL;
        this.tenhethong="Ten He Thong-"+Provider.TENHETHONG;
        this.username="username-"+Provider.USERNAME;
        this.password=Provider.PASSWORD;
        this.driver=Provider.DRIVER;
        this.datadasevw="DADABASEVW-"+Provider.DADABASEVW;
        this.datadasekh="DADABASEKH-"+Provider.DADABASEKH;
        this.base_domain="base_domain-"+Provider.BASE_DOMAIN;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDatadasevw() {
        return datadasevw;
    }

    public void setDatadasevw(String datadasevw) {
        this.datadasevw = datadasevw;
    }

    public String getDatadasekh() {
        return datadasekh;
    }

    public void setDatadasekh(String datadasekh) {
        this.datadasekh = datadasekh;
    }

    
    
    public String getConnect_url() {
        return connect_url;
    }

    public void setConnect_url(String connect_url) {
        this.connect_url = connect_url;
    }

    public String getTenhethong() {
        return tenhethong;
    }

    public void setTenhethong(String tenhethong) {
        this.tenhethong = tenhethong;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
        
     
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlkhout() {
        return urlkhout;
    }

    public void setUrlkhout(String urlkhout) {
        this.urlkhout = urlkhout;
    }

    public String getBase_domain() {
        return base_domain;
    }

    public void setBase_domain(String base_domain) {
        this.base_domain = base_domain;
    }

  


	 

}
