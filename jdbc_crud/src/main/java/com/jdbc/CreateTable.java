package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
public static void main(String args[]) {
	try(Connection conn = DatabaseConnection.getDbConnection()){
		// Create Statement
		Statement st = conn.createStatement();
		String sql = "create table student_details(id int not null, name varchar(30), phone varchar(15), email varchar(50), address varchar(100), primary key(id))";
		// Execute Query
		st.executeUpdate(sql);
		System.out.println("Table created successfully");
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
