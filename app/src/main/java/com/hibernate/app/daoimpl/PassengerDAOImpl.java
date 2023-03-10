package com.hibernate.app.daoimpl;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
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
		//Integer.parseInt(JOptionPane.showInputDialog("enter id", "type here"))
		Passenger p = (Passenger)session.get(Passenger.class, Integer.parseInt(JOptionPane.showInputDialog("enter id", "type here")));
		if(p.getUserName().equals(userName) && p.getPassword().equals(password))
			return true;
		else
			return false;
	}

	@Override
	public Passenger getPassenger(int id) {
		try(Session session = HibernateUtil.getSession()){
			Passenger passenger = (Passenger)session.get(Passenger.class, id);
			return passenger;
		}catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Passenger updatePassenger(int id, Passenger passenger) {

		return null;
	}

	@Override
	public void deletePassenger(int id) throws PersistenceException {

		
	}

}
