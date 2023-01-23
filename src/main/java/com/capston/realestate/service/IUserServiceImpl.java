package com.capston.realestate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capston.realestate.exception.PasswordNotMatchException;
import com.capston.realestate.exception.UserNotFoundException;
import com.capston.realestate.model.User;
import com.capston.realestate.repository.IUserRepository;

/**********************************************************************************
 * @author                 Abhishek Kumar
 * Description             It is a user service implementation class that defines the methods
 *                         mentioned in its interface.
 * Version                 1.0
 * created date            22-JAN-2023
 *
 ****************************************************************************************/

@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository uDao;
	
	/************************************************************************************
	 * Method                     signIn
	 * Description                It is used to sign In into application
	 * @param user                user's reference variable
	 * @UserNotFoundException     It is raised due to invalid user details
	 * Created By 		 ABHISHEK KUMAR
	 * Created Date		 22-JAN-2023
	 ***********************************************************************************/

	@Override
	public boolean signIn(User user) throws UserNotFoundException {
		Boolean status= false;
		Optional<User> resultBroker= Optional.ofNullable(uDao.findById(user.getUserId()));
//		Optional<User> resultUser= userRepository.findById(user.getUserId());
//		Optional<User> resultBroker= Optional.of(uDao.findByEmail(user.getEmail()));
		if (resultBroker.isPresent()) {
			if((resultBroker.get().getPassword().equals(user.getPassword()))) 
			{
				status=true;

		} 
			else 
				
			
			throw new UserNotFoundException("User Not Found");
		}
		return status;
	}
	
	/*******************************************************************
	 * Method                                     signOut
	 * Description                                It is used to signout from application
	 * @param user                                user's reference variable
	 * @UserNotFoundException                     It raised due to invalid user details
	* Created By 		 ABHISHEK KUMAR
	 * Created Date		 22-JAN-2023
	 ***********************************************************************/


	@Override
	public boolean  signOut(User user) throws UserNotFoundException {
		Boolean status=false;
		Optional<User> resultBroker=Optional.of(uDao.findById(user.getUserId()));

		if (resultBroker.isEmpty()) {
			throw new UserNotFoundException("User Not Found");
		}
		else if(resultBroker.get().getPassword().equals(user.getPassword())) {
			 status = true;
		}
		return status;
	}
	
	/******************************************************************************
	 * Method                        changePassword
	 * Description                   It is used to change the password
	 * @param user                   User's refernce variable
	 * @throws PasswordNotMatchException 
	 * @UserNotFoundException        It is raised due to invalid user details
	 * Created By 		 ABHISHEK KUMAR
	 * Created Date		 22-JAN-2023
	 ********************************************************************************/

	

	@Override
	public User changePassword(int userid, User user) throws UserNotFoundException, PasswordNotMatchException {

		Optional<User> resultUser=Optional.of(uDao.findById(user.getUserId()));
		if(resultUser.isPresent()) {
				resultUser.get().setPassword(user.getPassword());
				return uDao.save(resultUser.get());
			
		}
		else
		{
			throw new UserNotFoundException("User Not Found");
		}	

}

	@Override
	public List<User> getAllUsers() {
		
		return uDao.findAll();
	}

	@Override
	public User getUserById(int userId) {
		return uDao.findById(userId);
	}


	
}
