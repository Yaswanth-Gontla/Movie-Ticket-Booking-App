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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customers {
	@Id
	@SequenceGenerator(name="mylogic3",initialValue=300,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic3")
	private int customerId;
	private String password;
    private String customerName;
	private String mobileNumber;
	private int age;
	private int noOfTickets;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Booking_Info",
			joinColumns=@JoinColumn(name="customerdetails"),
			inverseJoinColumns=@JoinColumn(name="bookingdetails"))
	private List<Booking> booking;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public Customers(int customerId, String password, String customerName, String mobileNumber, int age,
			int noOfTickets, List<Booking> booking) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.noOfTickets = noOfTickets;
		this.booking = booking;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", password=" + password + ", customerName=" + customerName
				+ ", mobileNumber=" + mobileNumber + ", age=" + age + ", noOfTickets=" + noOfTickets + ", booking="
				+ booking + "]";
	}

	
    
	
}
