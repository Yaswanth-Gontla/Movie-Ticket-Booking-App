package com.cg.mts.service;

import com.cg.mts.entities.Seats;

public interface ISeatService {
public Seats bookSeat(Seats seats);
public Seats cancelSeatBooking(Seats seats);

}
