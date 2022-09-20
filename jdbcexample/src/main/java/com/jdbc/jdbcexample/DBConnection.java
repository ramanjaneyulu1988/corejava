package com.jdbc.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/corejava_db","root","root");
		
		return con;  
	}
	
	public static void closeDBConnection(Connection con)
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
