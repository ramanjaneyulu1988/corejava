package com.jdbc.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample1 {

	public static void main(String[] args) {

		DeleteExample1.deleteData();
	}

	public static void deleteData()
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
			String sql = "delete from student where id = 10";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i > 0)
			{
				System.out.println("Record deleted successfully...");
			}
			else
			{
				System.out.println("Record not deleted....");
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
