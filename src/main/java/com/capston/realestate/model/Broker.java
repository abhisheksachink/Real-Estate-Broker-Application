package com.capston.realestate.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
 * Description 		It is an entity class that provides all the fields of Broker
 * Version			1.0
 * Created Date		20-Jan-2023
 ***************************************************************************/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name="broker555")
@Entity
public class Broker extends User {
	@Column(name="bro_name",nullable=false)
	private String broName;
	@OneToMany(targetEntity = Property.class, mappedBy = "broker",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Property> properties;

	
}
