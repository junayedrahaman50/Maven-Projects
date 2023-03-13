package com.hibernate.app;


import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import com.hibernate.app.entity.Admin;
import com.hibernate.app.entity.Flight;
import com.hibernate.app.entity.Passenger;
import com.hibernate.app.model.AdminDTO;
import com.hibernate.app.model.FlightDTO;
import com.hibernate.app.model.PassengerDTO;
import com.hibernate.app.service.AdminService;
import com.hibernate.app.service.AirlineService;
import com.hibernate.app.service.FlightService;
import com.hibernate.app.service.PassengerService;
import com.hibernate.app.serviceimpl.AdminServiceImpl;
import com.hibernate.app.serviceimpl.AirlineServiceImpl;
import com.hibernate.app.serviceimpl.FlightServiceImpl;
import com.hibernate.app.serviceimpl.PassengerServiceImpl;

public class CrudOperation {

	static AdminService aService=new AdminServiceImpl();
	static AirlineService airService=new AirlineServiceImpl();
	static PassengerService pService=new PassengerServiceImpl();
	static FlightService fService=new FlightServiceImpl();
	static Scanner sc=new Scanner(System.in);
	
	//this method is responsible for CRUD of admin
	public static void crudAdmin()
	{
		String xx;
		while(true)
		{
			System.out.println("=====================================================");
			System.out.println("Press r for read admin \nPress u for update admin \nPress d for delete admin \nPress q for quit");
			xx=JOptionPane.showInputDialog("Enter choice","type here");
			switch(xx)
			{
			case "r":
				try 
				{
					AdminDTO aDto=aService.getAdminById(Integer.parseInt(JOptionPane.showInputDialog("Enter admin ID:","type here")));
					System.out.println("Admin details:");
					System.out.println("ID: "+aDto.getId());
					System.out.println("Name: "+aDto.getAName());
					System.out.println("Email: "+aDto.getEmail());
				}catch (Exception e) 
				{
					System.out.println(e);
				}break;
				
			case "u":
				Admin admin =new Admin();
				String name=JOptionPane.showInputDialog("Enter name","type here");
				String email=JOptionPane.showInputDialog("Enter email","type here");
				String username=JOptionPane.showInputDialog("Enter username","type here");
				String password=JOptionPane.showInputDialog("Enter Password","type here");
				admin.setAName(name);
				admin.setEmail(email);
				admin.setUserName(username);
				admin.setPassword(password);
				AdminDTO upAdmin=aService.updateAdmin(Integer.parseInt(JOptionPane.showInputDialog("Enter admin id to update")), admin);
				System.out.println("Admin updated successfully");
				break;
				
			case "d":
				try
				{
					aService.deleteAdmin(Integer.parseInt(JOptionPane.showInputDialog("Enter Admin ID to delete","type here")));
				}catch (PersistenceException e) {
					System.out.println(e.getMessage());
				}break;
			
			case "q":
				
			}//end of switch
		}//end of while
		
	}//end of CRUD admin
	
	//this method is responsible for CRUD of passenger	
	public static void crudPassenger()
	{
		String xy;
		while(true)
		{
			System.out.println("=====================================================");
			System.out.println("Press r for read passenger \nPress u for update passenger \nPress d for delete passenger");
			xy=JOptionPane.showInputDialog("Enter choice","type here");
			
			switch(xy)
			{
			case "r":
				try
				{
					PassengerDTO pDto=pService.getPassengerById(Integer.parseInt(JOptionPane.showInputDialog("Enter Passenger ID","type here")));
					System.out.println("Passenger Details:");
					System.out.println("ID: "+pDto.getId());
					System.out.println("Name: "+pDto.getName());
					System.out.println("Phone No.: "+pDto.getPhno());
					System.out.println("Email: "+pDto.getEmail());
					
				}catch (Exception e) {
					System.out.println(e);
				}break;
				
			case "u":
				Passenger passenger=new Passenger();
				String name=JOptionPane.showInputDialog("Enter name","type here");
				String email=JOptionPane.showInputDialog("Enter email","type here");
				String phno=JOptionPane.showInputDialog("Enter Phone number","type here");
				String username=JOptionPane.showInputDialog("Enter username","type here");
				String password=JOptionPane.showInputDialog("Enter Password","type here");
				passenger.setName(name);
				passenger.setEmail(email);
				passenger.setPhno(phno);
				passenger.setUserName(username);
				passenger.setPassword(password);
				PassengerDTO upPass=pService.updatePassenger(Integer.parseInt(JOptionPane.showInputDialog("Enter passenger ID for update")), passenger);
				System.out.println("passenger updated successfylly");
				break;
			
			case "d":
				try {
				pService.deletePassenger(Integer.parseInt(JOptionPane.showInputDialog("Enter passenger ID to delete","type here")));
				}catch (PersistenceException e) {
					System.out.println(e.getMessage());
				}break;
				
			case "q":
			}//end of switch
			
		}//end of while
	}// end of CRUD passenger
	
	//this method is responsible for CRUD flight
	public static void crudFlight()
	{
		String xy;
		while(true)
		{
			System.out.println("=====================================================");
			System.out.println("Press c for  \nPress u for update passenger \nPress d for delete passenger");
			xy=JOptionPane.showInputDialog("Enter choice","type here");
			
			switch(xy)
			{
			case "c":
				Flight flight=new Flight();
				System.out.println("Enter available seats: ");
				int aseat=sc.nextInt();
				System.out.println("Enter Total seats: ");
				int tseat=sc.nextInt();
				sc.nextLine();
				System.out.println("Enetr traveller class: ");
				String tclass=sc.nextLine();
				System.out.println("Enter the time: ");
				String t=sc.nextLine();
				System.out.println("Enter the date: ");
				String d=sc.nextLine();
				LocalDate date1=LocalDate.parse(d);
				System.out.println("Enter the Source: ");
				String fSource=sc.nextLine();
				System.out.println("Enter destination: ");
				String fDestination=sc.nextLine();
				
				flight.setAvilableSeats(tseat);
				flight.setTotalSeats(tseat);
				flight.setTravellerClass(tclass);
				flight.setTime(t);
				flight.setDate(date1);
				flight.setSource(fSource);
				flight.setDestination(fDestination);
				fService.saveFlight(flight);
				
				System.out.println("Flight created successfully");
				
			case "r":
				try
				{
					int id;
					System.out.println("Enter flight ID: ");
					id=sc.nextInt();
					FlightDTO fDto=fService.getFlight(id);
					System.out.println("Flight details:");
					System.out.println("Flight ID: "+fDto.getFlight_id());
					System.out.println("Available seats: "+fDto.getAvilableSeats());
					System.out.println("Total Seats: "+fDto.getTotalSeates());
					System.out.println("Date: "+fDto.getDate());
					System.out.println("Time: "+fDto.getTime());
					System.out.println("Source: "+fDto.getSource());
					System.out.println("Destination: "+fDto.getDestination());
					System.out.println("Traveller class: "+fDto.getTravellerClass());
					System.out.println("Airline id: "+fDto.getAirline());
					
					
				}catch (Exception e) {
					System.out.println(e);
				}break;
				
			case "u":
				Flight flight1=new Flight();
				int aSeat=Integer.parseInt((JOptionPane.showInputDialog("Enter available seats")));
				int tSeat=Integer.parseInt(JOptionPane.showInputDialog("Enter Total seats","type here"));
				String date=JOptionPane.showInputDialog("Enter Date","type here");
				String time=JOptionPane.showInputDialog("Enter Time","type here");
				String fsource=JOptionPane.showInputDialog("Enter Source","type here");
				String fdestination=JOptionPane.showInputDialog("Enter Destination","type here");
				String tClass=JOptionPane.showInputDialog("Enter Traveller Class","type here");
				LocalDate date2=LocalDate.parse(date);
				flight1.setAvilableSeats(tSeat);
				flight1.setTravellerClass(tClass);
				flight1.setDate(date2);
				flight1.setSource(fsource);
				flight1.setDestination(fdestination);
				flight1.setTime(time);
				flight1.setTotalSeats(tSeat);
				
				
				FlightDTO upFlight=fService.updateFlight(Integer.parseInt(JOptionPane.showInputDialog("Enter Flight ID")), flight1);
				System.out.println("Flight updated successfully");
				break;
				
			case "d":
				try
				{
					fService.deleteFlight(Integer.parseInt(JOptionPane.showInputDialog("Enter Flight ID to delete","type here")));
					
				}catch (PersistenceException e) {
					System.out.println(e.getMessage());
				}break;
			}
	}
	
	
}
	//this method is responsible for assign flight to airline
	public static void assignAirlineToFlight()
	{
		System.out.println("Enter flight ID: ");
		int fId=sc.nextInt();
		System.out.println("Enter airline ID: ");
		int airId=sc.nextInt();
		airService.assignAirlineToFlight(fId, airId);
		System.out.println("Flight assigned to Airline successfully");
	}
}