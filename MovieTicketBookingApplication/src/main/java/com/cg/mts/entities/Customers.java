package com.cg.mts.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customers {
	@Id
	@SequenceGenerator(name="mylogic3",initialValue=300,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic3")
	private String customerId;
	private String password;
    private String customerName;
	private String mobileNumber;
	private int noOfTickets;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Booking_Info",
			joinColumns=@JoinColumn(name="customerdetails"),
			inverseJoinColumns=@JoinColumn(name="bookingdetails"))
	private List<Booking> booking;
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
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(booking, customerId, customerName, mobileNumber, noOfTickets, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(booking, other.booking) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(mobileNumber, other.mobileNumber)
				&& noOfTickets == other.noOfTickets && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", password=" + password + ", customerName=" + customerName
				+ ", mobileNumber=" + mobileNumber + ", noOfTickets=" + noOfTickets + ", booking=" + booking + "]";
	}
	public Customers(String customerId, String password, String customerName, String mobileNumber, int noOfTickets,
			List<Booking> booking) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.noOfTickets = noOfTickets;
		this.booking = booking;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
