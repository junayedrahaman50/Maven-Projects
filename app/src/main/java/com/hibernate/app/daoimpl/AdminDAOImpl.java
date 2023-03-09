package com.hibernate.app.daoimpl;

import javax.swing.JOptionPane;

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
		Admin admin = (Admin)session.get(Admin.class, (JOptionPane.showInputDialog("enter id", "type here")));
		if(admin.getUserName().equals(username) && admin.getPassword().equals(password))
			return true;
		else
			return false;
	}

}
