package com.capston.realestate.exception;
/*************************************************************************************
 * @author                 ABHISHEK KUMAR
 * Description             It is a exception class that handles the exception occurring at 
 *                         service level when a user is not found.
 * @version                1.0
 * @since           	   22-01-2023
 *
 ***************************************************************************************/

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception{

	public UserNotFoundException() {
		
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
}
