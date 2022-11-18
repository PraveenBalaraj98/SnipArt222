package com.tyssmps.snippart.GenericUtility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBaseUtility {
	static Driver driver;
	Statement state;
	static Connection conn;

	public void connectToDataBase() throws SQLException
	{
         driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		 conn = DriverManager.getConnection("IConstants.Jdbc_Url,IConstants.JDBC_USERNAME,IConstants.JDBC_Password");
		
	}
	
    public  ResultSet Execute(String query) throws SQLException
		{
    	state = conn.createStatement();
    	
	 query="Select * from emp";
		ResultSet result = state.executeQuery(query);
		return result;
				
		}
    
    public void closeDBConnection() throws Throwable {
    	conn.close();
    	System.out.println("Database connection is closed");
    }
        
	
}


