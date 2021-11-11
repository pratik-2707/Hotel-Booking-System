import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class customers {
    int id ;
    String name ;
    int total_members ;
    int phone ; 
    String checkin ;
    static int current = 0 ;

    public customers(int id ,String name, int total_members, int phone, String checkin) {
        this.id = id ;
        this.name = name;
        this.total_members = total_members;
        this.phone = phone;
        this.checkin = checkin;
    }
    static customers c[] = new customers[100] ;
    public static void addnew(int id ,String name , int members , int phone , String checkin) {
        current++;
        c[current] = new customers(id , name , members,phone , checkin) ;
    }
}

public class booking {
  //  customers c[] = new customers[100] ;
    public static void book() throws IOException, SQLException {
        // declaration
        int id ;
        int bill ;
        String visitorname ;
        int total_members ;
        String filename = "visitors.csv";
        String content ;
        String checkin ;
        int phone ;

        // date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();   
        // scanner
        Scanner jj = new Scanner(System.in) ;

        // input
        System.out.println("enter name ");
        visitorname = jj.next() ;
        System.out.println("enter total members ");
        total_members = jj.nextInt() ;
        System.out.println("enter phone no ");
        phone = jj.nextInt() ;
        id = customers.current + 1 ;
        checkin = dtf.format(now) ;
        bill = 1000*total_members ;
        content = id + "  " + visitorname + "  " + total_members + "  " + phone + "  " + checkin + "  " + bill +  "\n";
        customers.addnew(id ,visitorname,total_members,phone,checkin);

        // file writing 
        Path p = Paths.get(filename);
        if(Files.exists(p)) {
            Files.writeString(p, content, StandardCharsets.US_ASCII, StandardOpenOption.APPEND) ;
        }

        // storing in database
        database_linkage.insert(id, visitorname, total_members, phone, checkin,bill);

    }
}
