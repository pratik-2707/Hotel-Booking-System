import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class connectionfactory {
    public static final String USERNAME = "root" ;
    public static final String PASSWORD  =  "your_database_password";
    public static final String URL = "jdbc:mysql://localhost:3306/your_databasename_in_your_pc" ;
    
    public static Connection getconnection() {
        Connection con = null ;
        try {
            Properties connectionproperties = new Properties() ;
            connectionproperties.put("user", USERNAME) ;
            connectionproperties.put("password",PASSWORD) ;
            con = DriverManager.getConnection(URL,connectionproperties) ;
        }
        catch (Exception e) {
          e.printStackTrace();
        }
        return con ;
    }
}
