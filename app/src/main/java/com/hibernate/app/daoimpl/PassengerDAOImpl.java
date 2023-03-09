package com.hibernate.app.daoimpl;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import com.hibernate.app.config.HibernateUtil;
import com.hibernate.app.dao.PassengerDao;
import com.hibernate.app.entity.Passenger;

public class PassengerDAOImpl implements PassengerDao{

	@Override
	public void savePassenger(Passenger passenger) {
		try(Session session = HibernateUtil.getSession()){
			session.beginTransaction();
			session.save(passenger);
			session.getTransaction().commit();
			session.clear();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public boolean login(String userName, String password) {
		Session session = HibernateUtil.getSession();
		//Fetch Data
		Passenger p = (Passenger)session.get(Passenger.class, (JOptionPane.showInputDialog("enter id", "type here")));
		if(p.getUserName().equals(userName) && p.getPassword().equals(password))
			return true;
		else
			return false;
	}

}
