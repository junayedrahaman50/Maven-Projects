package com.hibernate.app.serviceimpl;

import javax.persistence.PersistenceException;

import org.modelmapper.ModelMapper;

import com.hibernate.app.dao.PassengerDao;
import com.hibernate.app.daoimpl.PassengerDAOImpl;
import com.hibernate.app.entity.Passenger;
import com.hibernate.app.exception.GlobalException;
import com.hibernate.app.model.PassengerDTO;
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

	@Override
	public PassengerDTO getPassengerById(int id) throws GlobalException {
		Passenger passenger1 = pdao.getPassenger(id);
		return new ModelMapper().map(passenger1, PassengerDTO.class);
	}

	@Override
	public PassengerDTO updatePassenger(int id, Passenger passenger) {
	
		return null;
	}

	@Override
	public void deletePassenger(int id) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

}
