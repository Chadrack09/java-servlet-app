package servlet;
// 100% Working
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import employee.Employee;
import employee.EmployeeCRUD;
/**
 *
 * @author Chadtech
 */
public class UpdateServlet extends HttpServlet {

//  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//          throws ServletException, IOException {
//    try (PrintWriter out = response.getWriter()) {
//      response.setContentType("text/html;charset=UTF-8");
//      String dbURL = "jdbc:mysql://localhost:3306/work";
//      String dbUsername = "root";
//      String dbPass = "@Admin0912";
//      
//      Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPass);
//      out.println("connected");
//    } catch (SQLException ex) {
//      Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
//    }
//  }
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      try {
        Class.forName("com.mysql.jdbc.Driver");
        String dbURL = "jdbc:mysql://localhost:3306/work";
        String dbUsername = "root";
        String dbPass = "@Admin0912";
        Connection con = null;
        
        con = DriverManager.getConnection(dbURL, dbUsername, dbPass);
        
        Statement stat = con.createStatement();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String country = request.getParameter("country");
        
        String sql = "INSERT INTO employee (name, email, password, country) VALUES ('"+name+"', '"+email+"', '"+password+"', '"+country+"')";
        stat.executeUpdate(sql);
        
        out.println("<h1>record inserted</h1>");
      } catch (ClassNotFoundException ex) {
        out.println("error inserting");
        }
      } catch (SQLException ex) {
        Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, "Cannot connect to database", ex);
        }   
  }
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doGet(request, response);
  } 
}
