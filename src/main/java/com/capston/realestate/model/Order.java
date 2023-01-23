//package com.capston.realestate.model;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@Getter
//@Setter
//@Entity
//@Table(name="order555")
//public class Order extends Address{
//	@Column(name="order_id",nullable=false)
//	private String orderId;
//	@Column(name="order_date",nullable=false)
//	private LocalDate orderDate;
//	@Column(name="order_status",nullable=false)
//	private String orderStatus;
//	private Customer customer;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "order_Id")
//	private List<Address> products ;
//	private Address address;
//	
//
//}
