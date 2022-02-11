package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customer;
@Service
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerService customerrepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerrepository.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerrepository.updateCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		return customerrepository.deleteCustomer(customer);
	}

	@Override
	public Customer viewCustomer(int custid) {
		return customerrepository.viewCustomer(custid);
	}

	@Override
	public List<Customer> viewAllCustomers(String customername) {
		return customerrepository.viewAllCustomers(customername);
	}

	@Override
	public List<Customer> viewCustomerList(int customerid) {
		return customerrepository.viewCustomerList(customerid);
	}
	

}
