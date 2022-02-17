package com.cg.mts.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Booking {
	@Id
	@SequenceGenerator(name="mylogic4",initialValue=400,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic4")
	private int bookingId;
	private String eventName;
	private String movieName;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Booking(int bookingId, String eventName, String movieName) {
		super();
		this.bookingId = bookingId;
		this.eventName = eventName;
		this.movieName = movieName;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", eventName=" + eventName + ", movieName=" + movieName + "]";
	}

}
