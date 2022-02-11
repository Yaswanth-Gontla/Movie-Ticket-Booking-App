package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Events;
@Service
public interface IEventsService {
	
	public boolean removeEvent(int eventsId) ;
	public Events viewEvents(int eventId) ;
	public List<Events> viewAllEvents();
	public Events createEvents(Events events);
	public boolean checkEventsById(int eventId);
	
	public List<Events> getEventsByGenre(String eventGenre);
	public List<Events> getEventsByLanguage(String eventLanguage);
	public List<Events> getEventsByName(String eventName);
}
