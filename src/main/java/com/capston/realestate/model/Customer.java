package com.capston.realestate.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

/***************************************************************************
 * 
 * @author 			Abhishek Kumar
 * Description 		It is an entity class that provides all the fields of User
 * @version			1.0
 * @since			20-Jan-2023
 ***************************************************************************/

@Entity
public class Customer extends User {

	private String customerId;
	private String firstName;
	private String lastName;
	private String mobile;
	private Address address;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "custumerId")
//	private List<Property> properties;
	private String email;
	
	
	
public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customer(int userId, String password, String role) {
		super(userId, password, role);
		// TODO Auto-generated constructor stub
	}



public Customer(String customerId, String firstName, String lastName, String mobile, Address address, String email) {
	super();
	this.customerId = customerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobile = mobile;
	this.address = address;
	this.email = email;
}
	

	

}
