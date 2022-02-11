package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customer;
@Repository

public interface CustomerRepository {
	public List<Customer> viewAllCustomers(String customername);
	public List<Customer> viewCustomerList(int customerid);
	

}
