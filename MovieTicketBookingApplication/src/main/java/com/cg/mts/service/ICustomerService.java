package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Customer;


public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) ;
	public Customer deleteCustomer(Customer customer) ;
	public Customer viewCustomer(int custid) ;
	public List<Customer> viewAllCustomers(int movieid);
	public List<Customer> viewCustomerList(int showid);
	//public List<Customer> viewCustomerList(int theatreid);

}
