package com.capston.realestate.exception;


/*************************************************************************************
 * @author                 ABHISHEK KUMAR
 * Description             It is a exception class that handles the exception occurring at 
 *                         service level when a customer is not found.
 * @version                1.0
 * @since           	   22-01-2023
 *
 ***************************************************************************************/

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException() {

	}

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
