package com.cg.mts.exceptions;

public class EventIdException {
  private int eventId;

public EventIdException() {
	super();
	// TODO Auto-generated constructor stub
}
public EventIdException(int eventId) {
	super();
	this.eventId=eventId;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EventIdException [eventId=" + eventId + "]";
}


}
