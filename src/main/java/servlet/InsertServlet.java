package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dbConnection.DBConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import employee.*;
/**
 *
 * @author Chadtech
 */
public class InsertServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    try {
//      Connection con = null;
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      try {
        // Calling connection method
        DBConnect.initConnection();
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String country = request.getParameter("country");
        
        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmail(email);
        emp.setPassword(password);
        emp.setCountry(country);
        
        EmployeeCRUD.insertRecords(emp);
        out.print("record inserted");
        
        response.sendRedirect("index.jsp");
      } catch (ClassNotFoundException ex) {
        out.println("not inserted");
        Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
      } 
    }
    catch (SQLException ex) {
      Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
    } 
  }

  
  //Do Post Method
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doGet(request, response);
  }
}
