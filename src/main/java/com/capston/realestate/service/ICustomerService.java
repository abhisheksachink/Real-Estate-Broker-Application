package com.capston.realestate.service;

import java.util.List;

import com.capston.realestate.exception.CustomerNotFoundException;
import com.capston.realestate.model.Customer;
import com.capston.realestate.model.Property;

/*************************************************************************************************************
 * @author 		ABHISHEK KUMAR
 * Description	It is an interface of service layer that provides various methods for its implementation class
 * @version		1.0
 * @since		22-JAN-2023 
 **************************************************************************************************************/

public interface ICustomerService {

	public Customer addCustomer(Customer customer);

	public Customer editCustomer(Customer customer);

	public Customer removeCustomer(int custId) throws CustomerNotFoundException;

	public Customer viewCustomer(int custid) throws CustomerNotFoundException;

	public List<Customer> listAllCustomers();
	
	public List<Property> getAllProperties(int custId);

	
}
