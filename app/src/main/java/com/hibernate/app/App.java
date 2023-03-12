package com.hibernate.app;

import com.hibernate.app.entity.Admin;
import com.hibernate.app.entity.Passenger;
import com.hibernate.app.model.AdminDTO;
import com.hibernate.app.model.PassengerDTO;
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
        AdminService aService = new AdminServiceImpl();
        // ----------- Create Admin -----------------
//        Admin admin = new Admin();
//        admin.setAName("Akash");
//        admin.setEmail("akash@gmail.com");
//        admin.setUserName("akash32");
//        admin.setPassword("A421");
//        admin.setRole("admin");
//        aService.registerAdmin(admin);
//        System.out.println("Admin Registration Successful");
    	
    	PassengerService pService = new PassengerServiceImpl();
    // -------------- Create Passenger ----------------
//    	Passenger passenger1 = new Passenger();
//    	passenger1.setName("Adam");
//    	passenger1.setEmail("adam@email.com");
//    	passenger1.setPhno("8799900509");
//    	passenger1.setUserName("Ad77");
//    	passenger1.setPassword("23jjjk");
//    	passenger1.setRole("user");
//    	pService.savePassenger(passenger1);
//    	System.out.println("Passenger Registered Successfully");
    	
    	// --------- Check Login -------------
//        boolean status = aService.loginAdmin("akash32", "A421");
//        if(status == true)
//        	System.out.println("login successful");
//        else
//        	System.out.println("Invalid Credentials");
//        
//        boolean status2 = pService.login("Ad77", "23jjj");
//        if(status2 == true)
//        	System.out.println("login successful");
//        else
//        	System.out.println("Invalid Credentials");
    	
    //  -------------- Read Passenger ------------------	
//    	PassengerDTO pdto = pService.getPassengerById(2);
//    	System.out.println("Passenger Details..");
//    	System.out.println("id: " + pdto.getId());
//    	System.out.println("Name: " + pdto.getName());
//    	System.out.println("Phone Number: " + pdto.getPhno());
//    	System.out.println("Email: " + pdto.getEmail());
    	
   // 	------- Update Passenger ---------
//    	Passenger passenger = new Passenger();
//    	passenger.setName("Ankit Sharma");
//    	passenger.setEmail("ankit@gmail.com");
//    	passenger.setPhno("9000000000");
//    	passenger.setUserName("AKSharma7");
//    	passenger.setPassword("s@123");
//    	//call update method
//    	PassengerDTO upPass = pService.updatePassenger(2, passenger);
//    	System.out.println("Details updated successfully");
    	
    	Admin admin = new Admin();
    	admin.setAName("Nicola Tesla");
    	admin.setEmail("nicola@tesla.com");
    	admin.setUserName("NTesla007");
    	admin.setPassword("secret");
    	AdminDTO upAdmin = aService.updateAdmin(1, admin);
    	System.out.println("Details updated successfully");
    	
    	// ------ Delete Passenger ---------
//    	pService.deletePassenger(2);
//    	System.out.println("Deleted Successfully");
    }
}
