## Java Servlet App
This is a java servlet app build with Java maven, It allows users to ```login``` and ```registrater```. mySQL server was used to store data.

Java dependies (maven mySQL-connector) 
```java
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
```