package com.hibernate.app;



import java.util.Scanner;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import com.hibernate.app.entity.Admin;
import com.hibernate.app.model.AdminDTO;
import com.hibernate.app.service.AdminService;
import com.hibernate.app.serviceimpl.AdminServiceImpl;

public class CrudOperation {
	static AdminService aservice=new AdminServiceImpl();
	static Scanner sc=new Scanner(System.in);
	//this method is responsible for CRUD of admin
	public static void crudAdmin()
	{
		String xx;
		while(true)
		{
			System.out.println("==================================================");
			System.out.println("Press r for read admin\nPress u for update admin"
					+ "\nPress d for delete admin\n Press q for quit");
			System.out.println("===================================================");
			xx=JOptionPane.showInputDialog("Enter choice","type here");
			switch(xx)
			{
			case "r":
				try {
					AdminDTO aDto=aservice.getAdminById(Integer.parseInt(JOptionPane.showInputDialog("Enter admin id","type here")));
					System.out.println("Admin detalis");
					System.out.println("id: "+aDto.getId());
					System.out.println("name: "+aDto.getAName());
					System.out.println("Email: "+aDto.getEmail());
				}catch (Exception e) {
					System.out.println(e);
				}
				break;
			case "u":
				Admin admin=new Admin();
				String name=JOptionPane.showInputDialog("Enter name","Type here");
				String email=JOptionPane.showInputDialog("Enter email","Type here");
				String uname=JOptionPane.showInputDialog("Enter Username","Type here");
				String pass=JOptionPane.showInputDialog("Enter password","Type here");
				admin.setAName(name);
				admin.setEmail(email);
				admin.setUserName(uname);
				admin.setPassword(pass);
				
				AdminDTO upAdmin=aservice.updateAdmin(Integer.parseInt(JOptionPane.showInputDialog("enter admin id to update")), admin);
				System.out.println("Admin updated successfully");
			break;
			case "d":
				try {
					aservice.deleteAdmin(Integer.parseInt(JOptionPane.showInputDialog("Enter the admin id to delete","type here")));
					
				}catch (PersistenceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "q":
				
			}// end of switch
		}//end of while
	}//end of CRUD admin
	
	// this method is responsible for CRUD of Passenger
	

}

