package com.capston.realestate.exception;


/*************************************************************************************
 * @author                 ABHISHEK KUMAR
 * Description             It is an exception class that handles the exception occurring at 
 *                         service level when a broker is not found.
 * @version                1.0
 * @since           	   22-JAN-2023
 *
 ***************************************************************************************/

@SuppressWarnings("serial")
public class BrokerNotFoundException extends Exception {

	public BrokerNotFoundException() {

	}

	public BrokerNotFoundException(String message) {
		super(message);
	}
}
