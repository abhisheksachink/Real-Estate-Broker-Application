package com.capston.realestate.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***************************************************************************
 * 
 * @author 			Abhishek Kumar
 * Description 		It is an entity class that provides all the fields of User
 * @version			1.0
 * @since			20-Jan-2023
 ***************************************************************************/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="customer555")
public class Customer extends User {

	@Column(name="customer_id",nullable=false)
	private String customerId;
	@Column(name="first_name",nullable=false)
	private String firstName;
	@Column(name="last_name",nullable=false)
	private String lastName;
	private String mobile;
	private Address address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "custumer_Id")
	private List<Property> properties;
	private String email;
	
	
	
	public Customer(int userId, String password, String role) {
		super(userId, password, role);
		// TODO Auto-generated constructor stub
	}
	
	
	





	

	

}
