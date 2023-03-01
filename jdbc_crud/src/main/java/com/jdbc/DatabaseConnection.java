package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
static Connection con = null;
public static Connection getDbConnection() {
	// Register the driver class
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	// Create the connection object
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	return con;
}
}
