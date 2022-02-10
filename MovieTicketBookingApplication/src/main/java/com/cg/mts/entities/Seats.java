package com.cg.mts.entities;

public class Seats {
	private int seatId;
	private String seatNumber;
	private String type;
	private int price;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Seats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seats(int seatId, String seatNumber, String type, int price) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Seats [seatId=" + seatId + ", seatNumber=" + seatNumber + ", type=" + type + ", price=" + price + "]";
	}
	
	
}
