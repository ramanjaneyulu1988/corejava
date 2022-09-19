package com.jdbc.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample1 {

	public static void main(String[] args) {
	
		SelectExample1.retriveData();
	}
	
	public static void retriveData()
	{
		Connection con = null;
		// Register a Driver class
		// Open a connection
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/corejava_db","root","root");  
			
			// Create a statement and Execute Query
			String sql = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("Firstname"));
				System.out.println(rs.getString("Lastname"));
				System.out.println(rs.getString("Age"));
				
				System.out.println("================================");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			// Close connection
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
