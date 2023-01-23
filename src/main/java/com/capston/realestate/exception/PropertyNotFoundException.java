package com.capston.realestate.exception;

/*************************************************************************************
 * @author                 ABHISHEK KUMAR
 * Description             It is a exception class that handles the exception occurring at 
 *                         service level when a Property is not found 
 * @version                1.0
 * @since           	   22-01-2023
 *
 ***************************************************************************************/

@SuppressWarnings("serial")
public class PropertyNotFoundException extends Exception {

	public PropertyNotFoundException() {

	}

	public PropertyNotFoundException(String message) {
		super(message);
	}
}
