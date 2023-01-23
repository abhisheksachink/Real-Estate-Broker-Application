package com.capston.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capston.realestate.model.User;

/********************************************************************************************
 * @author		Abhishek Kumar
 * Description	It is an interface extending JPA Repository for using already defined methods
 * @version		1.0
 * @since		22-JAN-2023
 ********************************************************************************************/
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	public User findById(int id);
}
