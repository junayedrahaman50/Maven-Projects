package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EditRecordUser {

	public static void main(String[] args) {
		try(Connection conn = DatabaseConnection.getDbConnection(); Scanner sc = new Scanner(System.in)){
			String editDetails  = "update student_details set name=?, phone=?, email=?, address=? where id=?";
			PreparedStatement p = conn.prepareStatement(editDetails);
			System.out.println("Enter id to edit: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter new name: ");
			String name = sc.nextLine();
			System.out.println("Enter new phone number: ");
			String phone = sc.nextLine();
			System.out.println("Enter new email: ");
			String email = sc.nextLine();
			System.out.println("Enter new address: ");
			String address = sc.nextLine();
			p.setString(1, name);
			p.setString(2, phone);
			p.setString(3, email);
			p.setString(4, address);
			p.setInt(5, id);
			
			// Execute Update
			int r = p.executeUpdate();
			// Print number of rows returned
			System.out.println(r + " Records Updated!");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
