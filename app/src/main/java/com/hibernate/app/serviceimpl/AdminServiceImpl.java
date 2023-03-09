package com.hibernate.app.serviceimpl;

import com.hibernate.app.dao.AdminDao;
import com.hibernate.app.daoimpl.AdminDAOImpl;
import com.hibernate.app.entity.Admin;
import com.hibernate.app.service.AdminService;

//In service layer data comes from DAO layer
public class AdminServiceImpl implements AdminService {
	AdminDao aDao = new AdminDAOImpl();
	@Override
	public void registerAdmin(Admin admin) {
		aDao.registerAdmin(admin);
		
	}

	@Override
	public boolean loginAdmin(String username, String password) {
		
		return aDao.loginAdmin(username, password);
	}

}
