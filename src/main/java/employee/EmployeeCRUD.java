package employee;

import java.sql.Connection;
import dbConnection.DBConnect;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chadtech
 */
public class EmployeeCRUD {
  public static void insertRecords(Employee emp) throws ClassNotFoundException {
    try {     
      Connection con = DBConnect.initConnection();
      Statement state = con.createStatement();
      String name = emp.getName();
      String email = emp.getEmail();
      String password = emp.getPassword();
      String country = emp.getCountry();
      
      String sql = "INSERT INTO employee (name, email, password, country) VALUES ('"+name+"', '"+email+"', '"+password+"', '"+country+"')";
      
      state.executeUpdate(sql);
      
    } catch (SQLException ex) {
      Logger.getLogger(EmployeeCRUD.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
