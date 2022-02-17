package com.cg.mts.util;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.cg.mts.dto.CustomersInfoDTO;
import com.cg.mts.dto.CustomersSavePostDTO;
import com.cg.mts.entities.Customers;
@Component
public class CustomersDTOConvertionClass {



	public CustomersInfoDTO getCustomersInfoDTO(Customers customers) {

		CustomersInfoDTO dtoObj1=new CustomersInfoDTO();
		dtoObj1.setCustomerId(customers.getCustomerId());
		dtoObj1.setCustomerName(customers.getCustomerName());
		dtoObj1.setMobileNumber(customers.getMobileNumber());
		dtoObj1.setNoOfTickets(customers.getNoOfTickets());
		dtoObj1.setCuscommunicationId((new Random().nextInt(4000)));
		return dtoObj1;
		
	}
	public Customers getCustomersFromPostCustomersDTO(CustomersSavePostDTO customerDto) {
		// TODO Auto-generated method stub
		Customers c=new Customers();
		c.setCustomerId(customerDto.getCustomerId());
		c.setCustomerName(customerDto.getCustomerName());
		c.setMobileNumber(customerDto.getMobileNumber());
		c.setNoOfTickets(customerDto.getNoOfTickets());
		return c;
	}

}
