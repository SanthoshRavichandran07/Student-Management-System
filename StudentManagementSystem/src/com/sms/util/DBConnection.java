package com.sms.util;

//here we performing the Data Base connection between java and mysql database
import java.sql.*;
public class DBConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/student_db";
	private static String username = "root";
	private static String password = "";
	
	public static Connection getConnection() {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
