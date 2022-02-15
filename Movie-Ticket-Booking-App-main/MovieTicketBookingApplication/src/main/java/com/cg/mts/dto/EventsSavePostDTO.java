package com.cg.mts.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class EventsSavePostDTO {

	@NotNull(message = "Name must be mentioned")
	private String eventName;
	@NotNull(message = "Genre must be mentioned")
	private String eventGenre;
	@NotNull(message = "Language must be mentioned")
	private String eventLanguage;
	@Range(min=1,max=3)
	private int eventHours;
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
	public String getEventLanguage() {
		return eventLanguage;
	}
	public void setEventLanguage(String eventLanguage) {
		this.eventLanguage = eventLanguage;
	}
	public int getEventHours() {
		return eventHours;
	}
	public void setEventHours(int eventHours) {
		this.eventHours = eventHours;
	}
	public EventsSavePostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventsSavePostDTO(@NotNull(message = "Name must be mentioned") String eventName,
			@NotNull(message = "Genre must be mentioned") String eventGenre,
			@NotNull(message = "Language must be mentioned") String eventLanguage,
			@Range(min = 1, max = 3) int eventHours) {
		super();
		this.eventName = eventName;
		this.eventGenre = eventGenre;
		this.eventLanguage = eventLanguage;
		this.eventHours = eventHours;
	}
	
}
