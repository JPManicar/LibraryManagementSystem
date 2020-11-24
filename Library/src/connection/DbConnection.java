package connection;

import java.sql.*;

/* This is the connection file for MySQL connector in java.
 * params:
 * database/schema name: library
 * user: (username)
 * password: (password)
 * 
 * this is the password connection in my system. you may change 
 * them according to your assigned schema, user and password in your 
 * MySQL workbench
 * 
 * Dependencies:
 * MySQL Server
 * MySQL connector for java
 */

public class DbConnection {
	public static Connection  getConnection() {
		Connection con = null;
	    try {
	     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=UTC","(username)","(password)"); 
		 System.out.println("Connected With the database successfully");
		 
		 } catch (SQLException e) {
		 
		 System.out.println("Error while connecting to the database." + e);
		 
		 }
	    return con;
	 }
}
