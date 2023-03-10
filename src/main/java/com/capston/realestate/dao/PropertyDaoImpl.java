package com.capston.realestate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capston.realestate.model.Property;
import com.capston.realestate.pojo.PropertyCriteria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class PropertyDaoImpl implements PropertyDao {
	/***********************************************************************************************
	 * @author 			ABHISHEK KUMAR
	 * Description		It is a dao layer which is used to get all properties and all properties with
	 * 					given criteria
	 * @version			1.0
	 * @since    		22-JAN-2023
	 ***********************************************************************************************/
	@PersistenceContext
	EntityManager em;
	
	
	
	/*****************************************************************************************************************
	 * Method                          fetchPropertyByCriteria
     * Description                     It is used to get all Property from Broker entity which meets the user criteria
	 * @returns List  	               All Properties with given criteria
     * Created By                      RAKSHITH VUPPALA
     * Created Date                    24-MAR-2021                            
	 
	 *****************************************************************************************************************/

	@Override
	public List<Property> fetchPropertyByCriteria(PropertyCriteria criteria) {
		String i =criteria.getConfig();
		String j =criteria.getOffer();
		String k =criteria.getCity();
		double l =criteria.getMinCost();
		double m=criteria.getMaxCost();
		if(i ==null || i=="")
			i="%";
		if(j==null || j=="")
			j="%";
		if(k==null || k=="")
			k="%";
		if(m==0)
			m=Double.MAX_VALUE;
			
		TypedQuery<Property> q = em.createQuery("select p from Property p where  p.configuration like :i  and p.offerType like:j and  p.city like :k and (p.offerCost Between :l and :m )", Property.class);
		
		q.setParameter("i", i);
		q.setParameter("j", j);
		q.setParameter("k", k);
		q.setParameter("l", l);
		q.setParameter("m", m);
		return q.getResultList();
	}
}
