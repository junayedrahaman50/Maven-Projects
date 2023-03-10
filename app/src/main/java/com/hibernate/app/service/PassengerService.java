package com.hibernate.app.service;

import javax.persistence.PersistenceException;

import com.hibernate.app.entity.Passenger;
import com.hibernate.app.exception.GlobalException;
import com.hibernate.app.model.PassengerDTO;

public interface PassengerService {

void savePassenger(Passenger passenger);
boolean login(String userName, String password);
// throw global exception if don't find passenger
PassengerDTO getPassengerById(int id) throws GlobalException;
PassengerDTO updatePassenger(int id, Passenger passenger);
void deletePassenger(int id) throws PersistenceException;
}
