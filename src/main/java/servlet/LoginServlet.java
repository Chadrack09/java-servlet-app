package servlet;

import dbConnection.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import employee.LoginBean;
import employee.LoginDAO;
/**
 *
 * @author Chadtech
 */
public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    try {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
      try {
//        Connection con = DBConnect.initConnection();
        DBConnect.initConnection();
        
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        LoginBean bean = new LoginBean();
        LoginDAO loginDAO = new LoginDAO();
        bean.setName(name);
        bean.setPassword(password);
        
        if(loginDAO.validate(bean)){
          response.sendRedirect("home.jsp");
        }else response.sendRedirect("index.jsp");
      } 
      catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        out.println("not connected");
      } 
    }
    catch (SQLException ex) {
      Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
  }


  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doGet(request, response);
  }
}
