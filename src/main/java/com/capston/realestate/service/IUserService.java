package com.capston.realestate.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.capston.realestate.exception.PasswordNotMatchException;
import com.capston.realestate.exception.UserNotFoundException;
import com.capston.realestate.model.User;

/*************************************************************************************************************
 * @author 		ABHISHEK KUMAR
 * Description	It is an interface of service layer that provides various methods for its implementation class
 * @version		1.0
 * @since		22-JAN-2023
 **************************************************************************************************************/

@Service
public interface IUserService {


	boolean signIn(User user) throws UserNotFoundException;

	boolean signOut(User user) throws UserNotFoundException;

	User changePassword(int userid, User user) throws UserNotFoundException, PasswordNotMatchException;
	
	List<User> getAllUsers();
	
	User getUserById(int userId);
 
}
