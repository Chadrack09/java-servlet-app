<%-- 
    Document   : index
    Created on : 07 May 2021, 13:52:06
    Author     : Chadtech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <center>
      <h1>Registration Page</h1>
      <h3>This is employee records</h3>
      <form action="InsertServlet" method="POST">
        <table class="table">
          <tr>
            <td><input type="text" name="name" placeholder="Name"></td>
          </tr>
          <tr>
            <td><input type="text" name="email" placeholder="Email"></td>
          </tr>
          <tr>
            <td><input type="password" name="password" placeholder="Password"></td>
          </tr>
          <tr>
            <td>
              <select name="country" style="width: 100%;">
                <option value="congo">Congo</option>
                <option value="southafrica">South Africa</option>
                <option value="france">France</option>
                <option value="america">America</option>
                <option value="others">Others</option>
              </select>
            </td>
          </tr>
          <tr>
            <td><input type="submit" value="Save Employee" style="width: 100%;background-color: #333;color:#fff"></td>
          </tr>
        </table>
      </form>
    </center>
    
  </body>
</html>
