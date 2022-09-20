package com.jdbc.jdbcexample;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateExample1 {

	public static void main(String[] args) {

		UpdateExample1.updateData();
	}

	public static void updateData()
	{

		Connection con = null;
		// Register a Driver class
		// Open a connection
		try
		{
			con = DBConnection.getDBConnection();
			// Create a statement and Execute Query
			String sql = "update student set firstname='Ram' where id=2";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i > 0)
			{
				System.out.println("Record updated successfully...");
			}
			else
			{
				System.out.println("Record not updated....");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			// Close connection
			DBConnection.closeDBConnection(con);
		}
	}
}
