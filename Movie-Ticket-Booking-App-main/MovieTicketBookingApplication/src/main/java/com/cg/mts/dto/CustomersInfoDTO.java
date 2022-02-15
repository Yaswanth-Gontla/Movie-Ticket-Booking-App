package com.cg.mts.dto;

public class CustomersInfoDTO {
	private int customerId;
	private String password;
    private String customerName;
	private String mobileNumber;
	private int noOfTickets;
	private int cuscommunicationId;
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
	public int getCuscommunicationId() {
		return cuscommunicationId;
	}
	public void setCuscommunicationId(int cuscommunicationId) {
		this.cuscommunicationId = cuscommunicationId;
	}
	@Override
	public String toString() {
		return "CustomersInfoDTO [customerId=" + customerId + ", password=" + password + ", customerName="
				+ customerName + ", mobileNumber=" + mobileNumber + ", noOfTickets=" + noOfTickets
				+ ", cuscommunicationId=" + cuscommunicationId + "]";
	}
	
	

}
