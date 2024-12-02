import java.sql.*;

public class Testdb {
    public static void main(String[] args) {
        Connection con = null;
        String url ="jdbc:mysql://localhost:3306/db1";
        try {
            con =DriverManager.getConnection(url,"root","Abvic@1060");
            System.out.println("Connection done");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}