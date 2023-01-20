package com.capston.realestate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/***************************************************************************
 * 
 * @author 			PRASHANTHI MALLELA
 * Description 		It is an entity class that provides all the fields of Property
 * @version			1.0
 * @since   		20-Jan-2023
 * 
 ***************************************************************************/

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propId;
	private String configuration; // Flat/Shop/Plot
	private String offerType; // Sell/Rent
	private double offerCost;
	private double areaSqft;
	private String city;
	private String address;
	private String street;
	private boolean status; // Available(true)/ Sold(false)
	@ManyToOne(targetEntity = Broker.class)
	@JoinColumn(name = "Broker", referencedColumnName = "user_Id")

	private Broker broker;

	public Property(int propId, String configuration, String offerType, double offerCost, double areaSqft, String city,
			String address, String street, boolean status, Broker broker) {
		super();
		this.propId = propId;
		this.configuration = configuration;
		this.offerType = offerType;
		this.offerCost = offerCost;
		this.areaSqft = areaSqft;
		this.city = city;
		this.address = address;
		this.street = street;
		this.status = status;
		this.broker = broker;
	}

	public Property() {

	}

	@Override
	public String toString() {
		return "Property [propId=" + propId + ", configuration=" + configuration + ", offerType=" + offerType
				+ ", offerCost=" + offerCost + ", areaSqft=" + areaSqft + ", city=" + city + ", address=" + address
				+ ", street=" + street + ", status=" + status + ", broker=" + broker + "]";
	}
	


}
