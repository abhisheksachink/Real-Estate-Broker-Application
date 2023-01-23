package com.capston.realestate.service;

import java.util.List;

import com.capston.realestate.exception.PropertyNotFoundException;
import com.capston.realestate.model.Property;
import com.capston.realestate.pojo.PropertyCriteria;


/*************************************************************************************************************
 * @author 		ABHISHEK KUMAR
 * Description	It is an interface of service layer of property module that provides various methods for its implementation class
 * @version		1.0
 * @since		22-JAN-2023
 **************************************************************************************************************/

public interface IPropertyService {

	public Property addProperty(Property property);

	public Property editProperty(Property property);

	public Property removeProperty(int propId) throws PropertyNotFoundException;

	public Property viewProperty(int propId) throws PropertyNotFoundException;

	public List<Property> listAllProperties();

	public List<Property> ListPropertyByCriteria(PropertyCriteria criteria);

}
