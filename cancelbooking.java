import java.sql.*;


interface cancelbooking {
    void deletebyname(String NAME) throws SQLException;
  }


  
class Deletion implements cancelbooking {

    @Override
    public void deletebyname(String NAME) throws SQLException {
      Connection con = connectionfactory.getconnection();
  
      String searchname;
      System.out.println("Enter the name of booking you want to delete: ");
      // Scanner jj = new Scanner(System.in);
      searchname = NAME;
      PreparedStatement ps = con.prepareStatement("delete from visitors where name  = ?");
      ps.setString(1, searchname);
      ps.executeUpdate();
      System.out.println("\nBooking with name " + searchname + " deleted   Successfully....\n");
    }
  
  }