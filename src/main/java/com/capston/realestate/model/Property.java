package com.capston.realestate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***************************************************************************
 * 
 * @author 			PRASHANTHI MALLELA
 * Description 		It is an entity class that provides all the fields of Property
 * @version			1.0
 * @since   		20-Jan-2023
 * 
 ***************************************************************************/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="property555")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prop_id")
	private int propId;
	private String configuration; // Flat/Shop/Plot
	@Column(name="offer_type",nullable=false)
	private String offerType; // Sell/Rent
	@Column(name="offer_cost",nullable=false)
	private double offerCost;
	@Column(name="area_sqft",nullable=false)
	private double areaSqft;
	private String city;
	private String address;
	private String street;
	private boolean status; // Available(true)/ Sold(false)
	@ManyToOne(targetEntity = Broker.class)
	@JoinColumn(name = "Broker", referencedColumnName = "user_Id")
	
	private Broker broker;



	public int getPropId() {
		return propId;
	}



	public void setPropId(int propId) {
		this.propId = propId;
	}



	public String getConfiguration() {
		return configuration;
	}



	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}



	public String getOfferType() {
		return offerType;
	}



	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}



	public double getOfferCost() {
		return offerCost;
	}



	public void setOfferCost(double offerCost) {
		this.offerCost = offerCost;
	}



	public double getAreaSqft() {
		return areaSqft;
	}



	public void setAreaSqft(double areaSqft) {
		this.areaSqft = areaSqft;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public Broker getBroker() {
		return broker;
	}



	public void setBroker(Broker broker) {
		this.broker = broker;
	}



	@Override
	public String toString() {
		return "Property [propId=" + propId + ", configuration=" + configuration + ", offerType=" + offerType
				+ ", offerCost=" + offerCost + ", areaSqft=" + areaSqft + ", city=" + city + ", address=" + address
				+ ", street=" + street + ", status=" + status + ", broker=" + broker + "]";
	}
	
	


}
