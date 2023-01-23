package com.capston.realestate.service;

import java.util.List;

import com.capston.realestate.exception.BrokerNotFoundException;
import com.capston.realestate.model.Broker;
import com.capston.realestate.model.Property;


/********************************************************************************************************
 * 
 * @author 		ABHISHEK KUMAR
 * Description	It is an interface of service layer that provides various methods for its implementation class
 * Version		1.0
 * Created Date	22-JAN-2023 
 ********************************************************************************************************/



public interface IBrokerService {

	public Broker addBroker(Broker bro);
	public Broker editBroker(Broker bro) throws BrokerNotFoundException;
	public Broker removeBroker(int broId) throws BrokerNotFoundException;

	public Broker viewBroker(int broId) throws BrokerNotFoundException;

	public List<Broker> listAllBrokers();
	
	public List<Property> getAllProperties(int broid);
}
