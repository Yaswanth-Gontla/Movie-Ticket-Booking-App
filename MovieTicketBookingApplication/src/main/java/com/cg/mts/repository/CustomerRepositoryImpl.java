package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import com.cg.mts.entities.Customer;
@Repository

public class CustomerRepositoryImpl implements CustomerRepository {
	
	List<Customer> list=new ArrayList<>();
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Customer> viewAllCustomers(String customername) {
		// TODO Auto-generated method stub
		Session session1 = entityManager.unwrap(Session.class);
		String queryString = "from customer where customername=:customername";
		Query<Customer> query1 = session1.createQuery(queryString);
		query1.setString("customername", customername);
		
		List<Customer>  list = (List<Customer>) query1.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Customer name is not In The DB");
		}
	}
		

	@Override
	public List<Customer> viewCustomerList(int customerid) {
		Session session1 = entityManager.unwrap(Session.class);
		String queryString = "from customer where customerid=:customerid";
		Query<Customer> query1 = session1.createQuery(queryString);
		query1.setString(customerid, "customerid");
		
		List<Customer>  list = (List<Customer>) query1.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Customer Id is not In The DB");
		}
	}
}


