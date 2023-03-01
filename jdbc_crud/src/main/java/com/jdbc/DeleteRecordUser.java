package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecordUser {

	public static void main(String[] args) {
		try(Connection conn = DatabaseConnection.getDbConnection(); Scanner sc  = new Scanner(System.in)){
			String deleteDetails = "delete from student_details where id=?";
			PreparedStatement pr = conn.prepareStatement(deleteDetails);
			System.out.println("Enter Student Id to delete: ");
			int id = sc.nextInt();
			// setter method for prepared statement
			pr.setInt(1, id);
			// Execute Query and store return value in r
			int r = pr.executeUpdate();
			// Print number of records deleted
			System.out.println(r + " Records Deleted!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
