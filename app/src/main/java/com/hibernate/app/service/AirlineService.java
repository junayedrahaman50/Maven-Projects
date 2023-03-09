package com.hibernate.app.service;

import javax.persistence.PersistenceException;

import com.hibernate.app.entity.Airline;
import com.hibernate.app.model.AirlineDTO;

public interface AirlineService {
	void saveAirline(Airline airline);
	void assignAirlineToFlight(int flightId,int airId);
	AirlineDTO getAirlineByName(String name);
	AirlineDTO updateAirlineById(int id,Airline airline);
	void deleteAirline(int id)throws PersistenceException;

}