package dbConnection;
/**
 *
 * @author Chadtech
 */
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnect {
  public static Connection initConnection() throws ClassNotFoundException, SQLException{
    String dbDriver = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/work";
    String dbUsername = "root";
    String dbPassword = "@Admin0912";
    Connection con = null;
    
    Class.forName(dbDriver);
    con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
    
    return con;
  }
}
