package com.jdbc.jdbcexample;

import java.sql.Connection;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class InsertExample1 {

	public static Logger log = Logger.getLogger(InsertExample1.class);
	
	public static void main(String[] args) {
		
		InsertExample1.insertData();
	}
	
	public static void insertData()
	{
		Connection con = null;
		
		try
		{
			// Register a Driver class
			// Open a connection
			con = DBConnection.getDBConnection();
			
			// Create a statement and Execute Query
			String sql = "insert into student (LastName, FirstName, Age) values ('Raj', 'Rajesh', 20)";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i > 0)
			{
				log.info("Record Inserted successfully...");
			}
			else
			{
				log.info("Record not inserted....");
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
