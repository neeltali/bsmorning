package com.webapplication.controller;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/trial";         //db is the name of the database
		String user ="root";                                                  
		String password = "Swapnil1@";

		try {

			//1. Create a connection
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute Query
			String sql = "insert into second "
					+"(id, string)"
					+ " values ('4', ajinkya)";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");

            //4. Close connection
			myConn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
}
