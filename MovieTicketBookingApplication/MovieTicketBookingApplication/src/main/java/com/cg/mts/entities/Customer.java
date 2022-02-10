package com.cg.mts.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Customer {
private String userId;
private String customerName;
private String mobileNumber;
private List<Ticket> myTickets;

}
