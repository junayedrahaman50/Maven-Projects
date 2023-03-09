//package com.hibernate.app.serviceimpl;


//
//import javax.persistence.PersistenceException;
//
//import org.modelmapper.ModelMapper;
//
//import com.hibernate.app.dao.AirlineDAO;
//import com.hibernate.app.daoimpl.AirlineDAOImpl;
//import com.hibernate.app.entity.Airline;
//import com.hibernate.app.exception.GlobalException;
//import com.hibernate.app.model.AirlineDTO;
//import com.hibernate.app.service.AirlineService;
//
//public class AirlineServiceImpl implements AirlineService{
//AirlineDAO airlineDAO=new AirlineDAOImpl();
//	@Override
//	public void saveAirline(Airline airline) {
//		airlineDAO.saveAirline(airline);
//		
//	}
//
//	@Override
//	public void assignAirlineToFlight(int flightId, int airId) {
//		airlineDAO.assignAirlineToFlight(flightId, airId);
//		
//	}
//
//	@Override
//	public AirlineDTO getAirlineByName(String name)throws GlobalException {
//		Airline airline=airlineDAO.getAirlineByName(name);
//		if(airline!=null) {
//			return new ModelMapper().map(airline, AirlineDTO.class);
//		}
//		throw new GlobalException("Airline detalis not exsit!!");
//	}
//
//	@Override
//	public AirlineDTO updateAirlineById(int id, Airline airline) {
//	Airline a= airlineDAO.updateAirlineById(id, airline);
//		return new ModelMapper().map(a, AirlineDTO.class);
//	}
//
//	@Override
//	public void deleteAirline(int id) throws PersistenceException {
//	airlineDAO.deleteAirline(id);
//		
//	}
//
//}