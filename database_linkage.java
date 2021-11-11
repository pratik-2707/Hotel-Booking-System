import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class database_linkage {
        static Connection con = connectionfactory.getconnection();
        public static void insert(int id ,String name, int total_members, int phone, String checkin , int bill) throws SQLException {
            final String SQL = "insert into miniproject.visitors values (?,?,?,?,?,?)" ;
    //    final String SQL = "insert into miniproject.temp values (id,'thor6')" ;
            try (PreparedStatement stmt = con.prepareStatement(SQL)) {
                stmt.setInt(1, id);
                stmt.setString(2, name);
                stmt.setInt(3, total_members);
                stmt.setInt(4, phone);
                stmt.setString(5, checkin);
                stmt.setInt(6, bill);
                stmt.executeUpdate();
            }    
        }
}        

