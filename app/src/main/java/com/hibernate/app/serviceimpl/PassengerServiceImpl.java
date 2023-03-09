package com.hibernate.app.serviceimpl;

import com.hibernate.app.dao.PassengerDao;
import com.hibernate.app.daoimpl.PassengerDAOImpl;
import com.hibernate.app.entity.Passenger;
import com.hibernate.app.service.PassengerService;

public class PassengerServiceImpl implements PassengerService{

	PassengerDao pdao = new PassengerDAOImpl();
	@Override
	public void savePassenger(Passenger passenger) {
		pdao.savePassenger(passenger);
		
	}

	@Override
	public boolean login(String userName, String password) {
		return pdao.login(userName, password);
	}

}
