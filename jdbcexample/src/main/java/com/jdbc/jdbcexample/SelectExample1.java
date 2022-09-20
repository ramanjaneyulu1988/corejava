package com.jdbc.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class SelectExample1 {

	public static Logger log = Logger.getLogger(InsertExample1.class);
	
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
			con = DBConnection.getDBConnection();
			
			// Create a statement and Execute Query
			String sql = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				log.info(rs.getString("id"));
				log.info(rs.getString("Firstname"));
				log.info(rs.getString("Lastname"));
				log.info(rs.getString("Age"));
				
				log.info("================================");
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
