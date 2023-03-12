package com.hibernate.app.serviceimpl;

import javax.persistence.PersistenceException;

import org.modelmapper.ModelMapper;

import com.hibernate.app.dao.AdminDao;
import com.hibernate.app.daoimpl.AdminDAOImpl;
import com.hibernate.app.entity.Admin;

import com.hibernate.app.exception.GlobalException;
import com.hibernate.app.model.AdminDTO;

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

	@Override
	public AdminDTO getAdminById(int id) throws GlobalException {
		Admin ad = aDao.getAdmin(id);
		return new ModelMapper().map(ad, AdminDTO.class);
	}

	@Override
	public AdminDTO updateAdmin(int id, Admin admin) {
		//DAO to service layer
		Admin ad = aDao.updateAdmin(id, admin);
	//sending object and its class as Modelmapper().map() arguments
		return new ModelMapper().map(ad, AdminDTO.class);
	}

	@Override
	public void deleteAdmin(int id) throws PersistenceException {
		// call deletePassenger of passengerDAOImpl
		 aDao.deleteAdmin(id);
		
	}

}
