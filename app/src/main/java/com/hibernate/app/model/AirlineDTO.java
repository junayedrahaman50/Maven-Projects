package com.hibernate.app.model;

import java.util.List;

import com.hibernate.app.entity.Flight;
public class AirlineDTO {
	private int id;
	private String airlineName;
	private float fare;
	private List<Flight> flights;

}
