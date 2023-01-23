package com.capston.realestate.exception;

/*************************************************************************************
 * @author                 ABHISHEK KUMAR
 * Description             It is a exception class that handles the exception occurs at 
 *                         service level
 * @version                1.0
 * @since           	   22-01-2023
 *
 ***************************************************************************************/

public class PasswordNotMatchException extends Exception {


	private static final long serialVersionUID = 1L;

	public PasswordNotMatchException(String msg) {
		super(msg);
	}

}
