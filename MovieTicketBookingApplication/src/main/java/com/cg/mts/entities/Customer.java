package com.cg.mts.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;


@Entity
public class Customer {
	
	
	private String customerId;

	private String customerName;
	private String mobileNumber;

	private List<Ticket> Tickets;

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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Ticket> getTickets() {
		return Tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		Tickets = tickets;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String customerName, String mobileNumber, List<Ticket> tickets) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		Tickets = tickets;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Tickets, customerId, customerName, mobileNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(Tickets, other.Tickets) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(mobileNumber, other.mobileNumber);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", Tickets=" + Tickets + "]";
	}
	
	

}