import java.sql.*;


abstract class searchBooking {

  abstract void Searchbyname(String NAME) throws SQLException;

  abstract void allBookings() throws SQLException;
}



// public static void printSQLException(SQLException e) {
// while (e != null) {
// System.err.println("\n----- SQLException -----");
// System.err.println(" SQL State: " + e.getSQLState());
// System.err.println(" Error Code: 406" + e.getErrorCode());
// System.err.println(" Message: Customer not found " + e.getMessage());
// e = e.getNextException();
// }
// }


class searching extends searchBooking {

  @Override
  public void Searchbyname(String NAME) throws SQLException {
    try {
      Connection con = connectionfactory.getconnection();
      String searchname;
      System.out.println("Enter the name of booking you want to search: ");
      // Scanner jj = new Scanner(System.in);
      searchname = NAME;

      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM visitors where name='" + searchname + "'");
      System.out.println("\nID\t\tName\t\tTotal Numbers\t\tPhone\t\t\tCheckIn time\t\tTotal Bill\t\tType of Room\n");

      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int total_members = rs.getInt("total_members");
        int phone = rs.getInt("phone");
        String checkin = rs.getString("checkin");
        int bill = rs.getInt("bill");
        String typeOfroom = rs.getString("typeOfroom");
        System.out
            .println("" + id + "\t\t" + name + "\t\t\t" + total_members + "\t\t" + phone + "\t\t\t" + checkin + "\t  "
                + bill + "\t\t\t  " + typeOfroom);
      }
    } catch (SQLException e) {
      System.out.println("SQL exception occured" + e);
    }
  }

  @Override
  void allBookings() throws SQLException {
    try {
      Connection con = connectionfactory.getconnection();

      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM visitors");
      System.out.println("\nID\t\tName\t\tTotal Numbers\t\tPhone\t\t\tCheckIn time\t\tTotal Bill\t\tType of Room\n");

      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int total_members = rs.getInt("total_members");
        int phone = rs.getInt("phone");
        String checkin = rs.getString("checkin");
        int bill = rs.getInt("bill");
        String typeOfroom = rs.getString("typeOfroom");
        System.out
            .println("" + id + "\t\t" + name + "\t\t\t" + total_members + "\t\t" + phone + "\t\t\t" + checkin + "\t  "
                + bill + "\t\t\t  " + typeOfroom);
      }
    } catch (SQLException e) {
      System.out.println("SQL exception occured" + e);
    }
  }
}
