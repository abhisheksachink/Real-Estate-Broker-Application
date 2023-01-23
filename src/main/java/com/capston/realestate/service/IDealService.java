package com.capston.realestate.service;
import java.util.List;

import com.capston.realestate.exception.DealNotAvailableException;
import com.capston.realestate.model.Deal;

/*************************************************************************************************************
 * @author 		ABHISHEK KUMAR
 * Description	It is an interface of service layer that provides various methods for its implementation class
 * @version		1.0
 * @since		22-JAN-2023 
 **************************************************************************************************************/

public interface IDealService {

	public Deal addDeal(Deal d) throws DealNotAvailableException;

	public List<Deal> listAllDeals();
}
