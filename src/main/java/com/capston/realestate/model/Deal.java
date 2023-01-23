package com.capston.realestate.model;



import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/***************************************************************************
 * 
 * @author 			Abhishek Kumar
 * Description 		It is an entity class that provides all the fields of Deals
 * @version			1.0
 * @since			20-Jan-2023
 ***************************************************************************/



@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="deal555")
public class Deal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="deal_id")
	private int dealId;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@Column(name="deal_date",nullable=false)
	private LocalDate dealDate;
	@Column(name="deal_cost",nullable=false)
	private double dealCost;
	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "user_id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "property_id", referencedColumnName = "propId")
	private Property property;



}
