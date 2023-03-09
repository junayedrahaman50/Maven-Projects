package com.hibernate.app.dao;

import com.hibernate.app.entity.Passenger;

public interface PassengerDao {
void savePassenger(Passenger passenger);
boolean login(String userName, String password);
}
