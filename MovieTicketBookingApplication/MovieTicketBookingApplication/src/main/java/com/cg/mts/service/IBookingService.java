package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Booking;


public interface IBookingService {
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking) ;
	public Booking cancelBooking(int bookingid) ;
	public List<Booking> showAllBookings(int movieid);
	public List<Booking> showAllBookings(LocalDate bookingdate);
	public List<Booking> showBookingList(int showid);
	public double calculateTotalCost(int bookingid);
	
}
