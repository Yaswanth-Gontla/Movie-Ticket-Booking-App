package com.cg.mts.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class CustomersSavePostDTO {
	private int customerId;
	private String password;
	@NotNull(message = "Name must be mentioned")
	private String customerName;
	@NotNull(message = "mobileNumber must be mentioned")
	private String mobileNumber;
	@Range(min=1,max=4)
	private int noOfTickets;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	public CustomersSavePostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomersSavePostDTO(int customerId, String password,
			@NotNull(message = "Name must be mentioned") String customerName,
			@NotNull(message = "mobileNumber must be mentioned") String mobileNumber,
			@Range(min = 1, max = 4) int noOfTickets) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.noOfTickets = noOfTickets;
	}
	
	
}
