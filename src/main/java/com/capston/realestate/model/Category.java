package com.capston.realestate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="category555")
public class Category {
	@Column(name="cat_id",nullable=false)
	private String catId;
	@Column(name="category_name",nullable=false)
	private String categoryName;
	
	

	
	

}
