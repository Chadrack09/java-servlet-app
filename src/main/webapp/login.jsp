<%-- 
    Document   : login
    Created on : 07 May 2021, 20:34:29
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
      <h1>Log In Page</h1>
      
      <form action="" method="POST">
        <table>
          <tr>
            <td><input type="text" placeholder="Name" name="name"></td>
          </tr>
          <tr>
            <td><input type="password" placeholder="Password" name="password"></td>
          </tr>
          <tr>
            <td><input type="submit" value="Log In"></td>
          </tr>
        </table>
      </form>
    </center>
  </body>
</html>
