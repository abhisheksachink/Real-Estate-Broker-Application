package com.capston.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capston.realestate.exception.BrokerNotFoundException;
import com.capston.realestate.exception.PropertyNotFoundException;
import com.capston.realestate.model.Broker;
import com.capston.realestate.model.Deal;
import com.capston.realestate.model.Property;
import com.capston.realestate.repository.IBrokerRepo;
import com.capston.realestate.repository.IDealRepo;

/****************************************************************************************************************
 *         @author			ABHISHEK KUMAR
 *         @Description  	It is a service class that provides methods for performing CRUD operations on Broker  
 *         @version        	1.0
 *         @since    		22-JAN-2023
 ****************************************************************************************************************/

@Service
public class IBrokerServiceImpl implements IBrokerService {

	@Autowired
	IBrokerRepo bDao;
	
	@Autowired
	IDealRepo dDao;
	

	/*****************************************************
	 * Method			addBroker
	 * Description		To add new Broker to database
	 * @Param bro 		New Broker object
	 * @returns Broker	created Broker field in database
	 * Created By 		ABHISHEK KUMAR
	 * Created Date		22-JAN-2023
	 *****************************************************/
	@Override
	public Broker addBroker(Broker bro) {
		bro.setRole("Broker");
		bDao.saveAndFlush(bro);
		return bro;
	}
	
	/*************************************************************************
	 * Method							editBroker
	 * Description						To update existing Broker in database
	 * @Param bro 						Updating Broker object
	 * @returns Broker					Updated Broker field in database
	 * @throws BrokerNotFoundException	It is raised due to invalid Broker ID
	 * Created By 						ABHISHEK KUMAR
	 * Created Date						22-JAN-2023
	 *************************************************************************/
	@Override
	public Broker editBroker(Broker bro) throws BrokerNotFoundException {
		bro.setRole("Broker");
		bDao.saveAndFlush(bro);
		return bDao.findById(bro.getUserId()).get();
	}
	
	/*****************************************************
	 * Method							removeBroker
	 * Description						To delete Broker from database
	 * @Param broId 					Broker ID to be deleted
	 * @returns Broker					deleted Broker field
	 * @throws BrokerNotFoundException	It is raised due to invalid Broker ID
	 * Created By 						ABHISHEK KUMAR
	 * Created Date						22-JAN-2023
	 * @throws PropertyNotFoundException 
	 *****************************************************/
	@Override
	public Broker removeBroker(int broId) throws BrokerNotFoundException {
		List<Deal> l= dDao.findAll();
		for(Deal i:l) {
			if(i.getProperty().getBroker().getUserId()==broId) {
				dDao.delete(i);
			}
		}
		
		
		
		Broker b = bDao.findById(broId).get();
		bDao.deleteById(broId);
		return b;
	}
	
	/*****************************************************************************************
	 * Method							viewBroker
	 * Description						To view Broker in database based on supplied Broker ID
	 * @Param broId 					Broker ID to be viewed
	 * @returns Broker					Broker record from database with broId
	 * @throws BrokerNotFoundException	It is raised due to invalid Broker ID
	 * Created By 						ABHISHEK KUMAR
	 * Created Date						22-JAN-2023
	 *****************************************************************************************/
	@Override
	public Broker viewBroker(int broId) throws BrokerNotFoundException {
		return bDao.findById(broId).get();
	}
	
	/***************************************************************
	 * Method			listAllBrokers
	 * Description		To get the List of all Brokers from database
	 * @returns List	All Brokers from database
	 * Created By 		ABHISHEK KUMAR
	 * Created Date		22-JAN-2023
	 ****************************************************************/
	@Override
	public List<Broker> listAllBrokers() {
		return bDao.findAll();
	}

	@Override
	public List<Property> getAllProperties(int broid) {
		return bDao.findById(broid).get().getProperties();
	}

	
}
