import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class input {
    public static void choice() throws IOException, SQLException {
        Scanner jj = new Scanner(System.in) ;
        System.out.println("-h and enter for help \n -b for book \n -s for search \n -d for delete");
        String comm ;
        comm = jj.next() ;
        switch (comm) {

            case "-h":
                System.out.println("three options availabe 1. booking a new room 2. search for a person 3. cancelling booking ");
                break;

            case "-b" :
                booking.book();
                break ;
        
            default:
                break;
        }
//        jj.close() ;
    }
}
