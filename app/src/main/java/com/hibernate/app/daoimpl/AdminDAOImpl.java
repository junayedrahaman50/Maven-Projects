package com.hibernate.app.daoimpl;

import javax.persistence.PersistenceException;

import org.hibernate.HibernateException;

//import javax.swing.JOptionPane;

import org.hibernate.Session;

import com.hibernate.app.config.HibernateUtil;
import com.hibernate.app.dao.AdminDao;
import com.hibernate.app.entity.Admin;




public class AdminDAOImpl implements AdminDao{

	@Override
	public void registerAdmin(Admin admin) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		session.close();
		}

	@Override
	public boolean loginAdmin(String username, String password) {
		Session session = HibernateUtil.getSession();
		//Fetch Data
		Admin admin = (Admin)session.get(Admin.class, 1);
		if(admin.getUserName().equals(username) && admin.getPassword().equals(password))
			return true;
		else
			return false;
	}

	@Override
	public Admin getAdmin(int id) {
		//Fetch admin data
		try(Session session = HibernateUtil.getSession()){
			Admin admin = (Admin)session.get(Admin.class, id);
			return admin;
		}catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Admin updateAdmin(int id, Admin admin) {
		//We use load when we know data exists
		//update admin
		try(Session session = HibernateUtil.getSession()){
			Admin ad = (Admin)session.load(Admin.class, id);
			ad.setAName(admin.getAName());
			ad.setEmail(admin.getEmail());
			ad.setUserName(admin.getUserName());
			ad.setPassword(admin.getPassword());
			//save fetched data
			session.beginTransaction();
			//save and update fetched data
			//pass contains the updated values
			session.saveOrUpdate(ad);
			//commit
			session.getTransaction().commit();
			return ad;
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public void deleteAdmin(int id) throws PersistenceException {
		try(Session session = HibernateUtil.getSession()){
			Admin ad = (Admin)session.load(Admin.class, id);
			session.beginTransaction();
			//Delete fetched admin
			session.delete(ad);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
