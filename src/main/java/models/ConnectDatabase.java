package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {

  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava", "root", "root");
    } catch (Exception e) {
      connection = null;
    }
    return connection;

  }

}
