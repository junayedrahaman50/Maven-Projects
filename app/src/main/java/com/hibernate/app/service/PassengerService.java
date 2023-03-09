package com.hibernate.app.service;

import com.hibernate.app.entity.Passenger;

public interface PassengerService {

void savePassenger(Passenger passenger);
boolean login(String userName, String password);


}
