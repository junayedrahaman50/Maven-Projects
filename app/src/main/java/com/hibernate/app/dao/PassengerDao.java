package com.hibernate.app.dao;

import javax.persistence.PersistenceException;

import com.hibernate.app.entity.Passenger;

public interface PassengerDao {
void savePassenger(Passenger passenger);
boolean login(String userName, String password);
Passenger getPassenger(int id);
Passenger updatePassenger(int id, Passenger passenger);
void deletePassenger(int id) throws PersistenceException;
}
