package com.capston.realestate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="Address555")
public class Address extends Customer{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private int AddressId;
	@Column(name="street_no")
	private String streetNo;
	@Column(name="building_name")
	private String buildingName;
	private String city;
	private String state;
	private String country;
	@Column(name="pin_code",nullable=false)
	private String pinCode;
	
	public Address(int userId, String password, String role) {
		super(userId, password, role);
		// TODO Auto-generated constructor stub
	}





	
}


