package com.hibernate.app.dao;

import com.hibernate.app.entity.Airline;

import javax.persistence.PersistenceException;

public interface AirlineDAO {
	void saveAirline(Airline airline);
	void assignAirlineToFlight(int flightId,int airId);
	Airline getAirlineByName(String name);
	Airline updateAirlineById(int id,Airline airline);
	void deleteAirline(int id)throws PersistenceException;
	

}