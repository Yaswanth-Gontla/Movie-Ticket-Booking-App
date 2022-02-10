package com.cg.mts.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
@Entity
public class Booking {
private int bookingId;
private int movieId;
private int showId;
private LocalDate bookingDate;
private Show showRef;
private int transactionId;
private double totalCost;
private List<Seat> seatList;
private Ticket ticket;

}
