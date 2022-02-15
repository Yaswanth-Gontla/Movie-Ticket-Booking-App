package com.cg.mts.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventsInfoDTO {

	private int eventId;
	private String eventName;
	private String eventGenre;
	private int eventHours;
	private String eventLanguage;
	private LocalDate eventDate;
	private LocalTime eventTime;
	private int communicationId;
	public int getCommunicationId() {
		return communicationId;
	}
	public void setCommunicationId(int communicationId) {
		this.communicationId = communicationId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventGenre() {
		return eventGenre;
	}
	public void setEventGenre(String eventGenre) {
		this.eventGenre = eventGenre;
	}
	public int getEventHours() {
		return eventHours;
	}
	public void setEventHours(int eventHours) {
		this.eventHours = eventHours;
	}
	public String getEventLanguage() {
		return eventLanguage;
	}
	public void setEventLanguage(String eventLanguage) {
		this.eventLanguage = eventLanguage;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public LocalTime getEventTime() {
		return eventTime;
	}
	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}
	public EventsInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EventsInfoDTO [eventId=" + eventId + ", eventName=" + eventName + ", eventGenre=" + eventGenre
				+ ", eventHours=" + eventHours + ", eventLanguage=" + eventLanguage + ", eventDate=" + eventDate
				+ ", eventTime=" + eventTime + ", communicationId=" + communicationId + "]";
	}
	
	
	
}
