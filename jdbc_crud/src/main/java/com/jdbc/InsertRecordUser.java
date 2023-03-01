package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecordUser {

	public static void main(String[] args) {
		try(Connection conn = DatabaseConnection.getDbConnection();Scanner sc = new Scanner(System.in)){
			
			String sql = "insert into student_details values(?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Phone Number: ");
			String phone = sc.nextLine();
			System.out.println("Enter Email: ");
			String email = sc.nextLine();
			System.out.println("Enter Address: ");
			String address = sc.nextLine();
			
			// Passing index and fields as parameter to prepared statement
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, phone);
			ps.setString(4, email);
			ps.setString(5, address);
			
			// Execute Query
			int r = ps.executeUpdate();
			System.out.println(r + " Record Inserted By User!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
