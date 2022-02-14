package com.cg.mts.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customers;

@Repository

public class CustomerRepositoryImpl implements CustomerRepository {
	@Autowired
	EntityManager entityManager;


	@Override
	public Customers getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Customers c where c.customerId=:customerId";
		Query<Customers> query = session.createQuery(queryString);
		query.setLong("customerId", customerId);
		
		Customers customer = (Customers) query.getSingleResult();
		
		if(customer!= null)
		{
			return customer;
		}
		else
		{
			throw new javax.persistence.NoResultException("CustomerId is Not In The DB");
		}
		
	}
	}
	
