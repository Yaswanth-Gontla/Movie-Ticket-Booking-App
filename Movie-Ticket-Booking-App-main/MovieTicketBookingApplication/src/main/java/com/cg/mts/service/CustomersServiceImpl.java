package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.dto.CustomersInfoDTO;
import com.cg.mts.dto.CustomersSavePostDTO;
import com.cg.mts.entities.Customers;
import com.cg.mts.repository.ICustomersRepository;
import com.cg.mts.util.CustomersDTOConvertionClass;

@Service
public class CustomersServiceImpl implements ICustomersService{

	@Autowired
	ICustomersRepository repository;
	@Autowired
	CustomersDTOConvertionClass dtoConvertion;
	
	@Override
	public Customers createCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customers> list=(List<Customers>) repository.findAll();
		return list;
	}

	@Override
	public boolean removeCustomerById(int customerId) {
		// TODO Auto-generated method stub
		repository.deleteById(customerId);
		return true;
	}

	@Override
	public Customers getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return repository.findById(customerId).get() ;
	}

	@Override
	public CustomersInfoDTO saveEvents(CustomersSavePostDTO customerDto) {
		Customers cu=dtoConvertion.getCustomersFromPostCustomersDTO(customerDto);
		Customers savedObj=repository.save(cu);
		CustomersInfoDTO dtoObj=dtoConvertion.getCustomersInfoDTO(savedObj);
		return dtoObj;
	}

}
