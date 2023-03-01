package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try(Connection conn = DatabaseConnection.getDbConnection()){
			// Create Statement
			Statement st = conn.createStatement();
			String sql = "insert into student_details values(101, 'John', '9837119000', 'john@gmail.com', '123 Main Street')";
			// row contains number of rows returned by st.executeUpdate()
			int row = st.executeUpdate(sql);
			System.out.println(row + " record inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
