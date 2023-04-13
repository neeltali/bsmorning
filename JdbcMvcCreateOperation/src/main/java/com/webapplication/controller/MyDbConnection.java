package com.webapplication.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyDbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Connection connetion=DriverManager.getConnection("jdbc:mysql://localhost:3306/trial","root","Swapnil1@");
	System.out.println("success");
	PreparedStatement preparedStatement=connetion.prepareStatement("insert into second values(?,?)");
	preparedStatement.setNString(1,"551");
	preparedStatement.setNString(2,"fddd");
	
	preparedStatement.executeUpdate();
	System.out.println("Data inserted");
}

catch(Exception e){
	System.out.println("not connect");
	
}

	}

}
