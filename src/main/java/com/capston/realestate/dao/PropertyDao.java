package com.capston.realestate.dao;

import java.util.List;

import com.capston.realestate.model.Property;
import com.capston.realestate.pojo.PropertyCriteria;
/********************************************************************************************************
 * @author 		Abhishek Kumar
 * Description	It is an interface of service layer that provides various methods for its implementation class
 * @version		1.0
 * @since	22-JAN-2023
 ********************************************************************************************************/
public interface PropertyDao {


	public List<Property> fetchPropertyByCriteria(PropertyCriteria criteria);
}
