package com.capston.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capston.realestate.exception.DealNotAvailableException;
import com.capston.realestate.model.Customer;
import com.capston.realestate.model.Deal;
import com.capston.realestate.model.Property;
import com.capston.realestate.repository.ICustomerRepo;
import com.capston.realestate.repository.IDealRepo;
import com.capston.realestate.repository.IPropertyRepo;

/****************************************************************************************************************
 *         @author			PATHAN ARSHIYA SHAHINA
 *         @Description  	It is a service class that provides methods for performing CRUD operations on Broker  
 *         @version        	1.0
 *         @since    		25-MAR-2021
 ****************************************************************************************************************/

@Service
public class IDealServiceImpl implements IDealService {

	@Autowired
	IDealRepo dealDao;
	@Autowired
	ICustomerRepo cDao;
	@Autowired
	IPropertyRepo pDao;

	/*****************************************************
	 * Method							addDeal
	 * Description						To add new Deal to database
	 * @Param deal 						New Deal object
	 * @returns Broker					created Deal field in database
	 * @throws DealNotFoundException	It is raised due to invalid deal
	 * Created By 						PATHAN ARSHIYA SHAHINA
	 * Created Date						25-MAR-2021
	 *****************************************************/
	
	@Override
	public Deal addDeal(Deal deal) throws DealNotAvailableException {
		Property p1 = pDao.findById(deal.getProperty().getPropId()).get();
		Customer c = cDao.findById(deal.getCustomer().getUserId()).get();

		try {
			if (p1.getStatus()== true) {
				p1.setStatus(false);
				pDao.saveAndFlush(p1);
				List<Property> p = c.getProperties();
				p.add(p1);
				c.setProperties(p);
				cDao.saveAndFlush(c);
				return dealDao.saveAndFlush(deal);
			} else {
				throw new DealNotAvailableException();
			}
		} catch (Exception e) {
			throw new DealNotAvailableException(
					"The property is already sold/rented. Please look for other properties.");
		}

	}

	/*****************************************************
	 * Method			listAllDeals
	 * Description		To get all deals from database
	 * @returns List	All deals in database
	 * Created By 		 ABHISHEK KUMAR
	 * Created Date		 22-JAN-2023
	 *****************************************************/
	
	@Override
	public List<Deal> listAllDeals() {
		return dealDao.findAll();
	}

}
