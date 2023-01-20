package com.capston.realestate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address extends Customer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AddressId;
	private String streetNo;
	private String buildingName;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int userId, String password, String role) {
		super(userId, password, role);
		// TODO Auto-generated constructor stub
	}
	public Address(String customerId, String firstName, String lastName, String mobile, Address address, String email) {
		super(customerId, firstName, lastName, mobile, address, email);
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String streetNo, String buildingName, String city, String state, String country,
			String pinCode) {
		super();
		AddressId = addressId;
		this.streetNo = streetNo;
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	
}


