package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectRecordUser {

	public static void main(String[] args) {
		try(Connection conn = DatabaseConnection.getDbConnection();Scanner sc = new Scanner(System.in)){
			String selectById = "select * from student_details where id = ?";
			String selectAll = "select * from student_details";
			PreparedStatement p = conn.prepareStatement(selectById);
			PreparedStatement p2 = conn.prepareStatement(selectAll);
			System.out.println("Enter id to read details: ");
			int id = sc.nextInt();
			p.setInt(1, id);
			// Execute Query
			ResultSet rs = p.executeQuery();
			ResultSet rs1 = p2.executeQuery();
			// Looping through returned rows by ResultSet
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Phone: " + rs.getString(3) + ", Email: " + rs.getString(4) + ", Address: " + rs.getString(5));
            }
            
            System.out.println("-- All Student Records --");
            while (rs1.next()) {
                System.out.println(" ID: " + rs1.getInt(1) + ",\n Name: " + rs1.getString(2) + ",\n Phone: " + rs1.getString(3) + ",\n Email: " + rs1.getString(4) + ",\n Address: " + rs1.getString(5));
                System.out.println("=========================================");
            }
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
