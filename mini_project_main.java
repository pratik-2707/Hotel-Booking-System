import java.io.IOException;
import java.sql.SQLException;


public class mini_project_main {

    public static void main(String[] args) throws IOException, SQLException {

        switch (args[0]) {
            case "-h" :
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("|                          |");
            System.out.println("|   Hotel Booking Sytem    |");
            System.out.println("|                          |");
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~+");
    
            System.out.println(
                    " -h for help \n -b for book and for example \"java main -b name totalmembers phonenumber typeofroom  \" \n -s for search a booking by name for example java main -s name \n -all for all your bookings java main -all \n -d for delete for example java main -d name");
    
                break;

            case "-v" :
            System.out.println("javac 16.0.2");
            break ;

            case"-b" :
            booking.book(args[1], args[2], args[3], args[4]);
            break ;

            case "-s" :
            searchBooking p = new searching() ;
            p.Searchbyname(args[1]);
            break ;

            case "-d" :
            cancelbooking c = new Deletion() ;
            c.deletebyname(args[1]) ;

            case "-all" :
            searchBooking s = new searching() ;
            s.allBookings();
            break ;

            default :
            System.out.println("enter -h for help");

        }
    }
}
