package com.capston.realestate.model;



import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
/***************************************************************************
 * 
 * @author 			Abhishek Kumar
 * Description 		It is an entity class that provides all the fields of Deals
 * @version			1.0
 * @since			20-Jan-2023
 ***************************************************************************/


@Entity

public class Deal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dealId;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dealDate;
	private double dealCost;
	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "user_id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "property_id", referencedColumnName = "propId")
	private Property property;

	public Deal() {

	}

	public Deal(LocalDate dealDate, double dealCost, Customer customer, Property property) {
		super();

		this.dealDate = dealDate;
		this.dealCost = dealCost;
		this.customer = customer;
		this.property = property;
	}

}
