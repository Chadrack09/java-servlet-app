package employee;

import dbConnection.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chadtech
 */
public class LoginDAO {
  public boolean validate(LoginBean bean) throws ClassNotFoundException{
    boolean result = false;
    
    try {
      Connection con = DBConnect.initConnection();
      DBConnect.initConnection();
      
      Statement state = con.createStatement();
      String name = bean.getName();
      String password = bean.getPassword();
      
      String sql = "SELECT * FROM employee WHERE name = '"+name+"' AND password = '"+password+"' ";
      
      ResultSet results = state.executeQuery(sql);
      result = results.next();
    } catch (SQLException ex) {
      Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
  }
}
