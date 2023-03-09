package com.hibernate.app;

import com.hibernate.app.entity.Admin;
import com.hibernate.app.entity.Passenger;
import com.hibernate.app.service.AdminService;
import com.hibernate.app.service.PassengerService;
import com.hibernate.app.serviceimpl.AdminServiceImpl;
import com.hibernate.app.serviceimpl.PassengerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        AdminService aService = new AdminServiceImpl();
//        Admin admin = new Admin();
//        admin.setAName("Akash");
//        admin.setEmail("akash@gmail.com");
//        admin.setUserName("akash32");
//        admin.setPassword("A421");
//        admin.setRole("admin");
//        aService.registerAdmin(admin);
//        System.out.println("Admin Registration Successful");
    	
    	PassengerService pService = new PassengerServiceImpl();
    	Passenger passenger1 = new Passenger();
    	passenger1.setName("Adam");
    	passenger1.setEmail("adam@email.com");
    	passenger1.setPhno("8799900509");
    	passenger1.setUserName("Ad77");
    	passenger1.setPassword("23jjjk");
    	passenger1.setRole("user");
    	pService.savePassenger(passenger1);
    	System.out.println("Passenger Registered Successfully");
    }
}
