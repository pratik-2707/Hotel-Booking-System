import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class temp1 {
    public static void main(String[] args) throws IOException, SQLException {

        
        // Connection con = connectionfactory.getconnection();
        // final String SQL = "insert into miniproject.temp values (11,'thor2')" ;
        // try (PreparedStatement stmt = con.prepareStatement(SQL)){
        //     // stmt.setInt(1, 6);
        //     // stmt.setString(2, "thor1");
        //     stmt.executeUpdate();
        //     // int rowsAffected = stmt.executeUpdate();
        //     // System.out.println(rowsAffected+" student rows created.");
        //     String content = "random doing" ;
        //     String filename = "dd2.txt" ;

        //     Path p=  Paths.get(filename) ;
        //     if(Files.exists(p)) {
        //         // BufferedReader br = Files.newBufferedReader(p) ;
        //         Files.writeString(p, content, StandardCharsets.US_ASCII,StandardOpenOption.APPEND) ;
        //     }
        //     else {
        //         Files.writeString(p, content, StandardCharsets.US_ASCII) ;
        //     }

        //     BufferedReader br = Files.newBufferedReader(p) ;
        //     if(Files.exists(p)) {
        //         String pp ;
        //         while((pp=br.readLine())!=null) {
        //             System.out.println(pp);
        //         }
        //     }

        // } 
        // catch (Exception e) {
        //     e.printStackTrace();
        // }

        while(true) {
            input.choice();
        }

    }
}
