package com.cg.mts.entities;

import java.util.List;


public class Customer {
private String customerId;
private String customerName;
private String customerMobileNumber;
private String customeraddress;

public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerMobileNumber() {
	return customerMobileNumber;
}
public void setCustomerMobileNumber(String customerMobileNumber) {
	this.customerMobileNumber = customerMobileNumber;
}
public String getCustomeraddress() {
	return customeraddress;
}
public void setCustomeraddress(String customeraddress) {
	this.customeraddress = customeraddress;
}
public Customer(String customerId, String customerName, String customerMobileNumber, String customeraddress) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerMobileNumber = customerMobileNumber;
	this.customeraddress = customeraddress;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobileNumber="
			+ customerMobileNumber + ", customeraddress=" + customeraddress + "]";
}



}
