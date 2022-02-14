package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Events;
import com.cg.mts.entities.Movies;
@Service
public interface IEventsService {
	
	public boolean removeEvent(int eventId) ;
	public Events viewEvents(int eventId) ;
	public List<Events> viewAllEvents();
	public Events createEvents(Events events);
	public boolean checkEventsById(int eventId);
	
	public List<Events> getEventsByGenre(String eventGenre,String theatreCity);
	public List<Events> getEventsByLanguage(String eventLanguage,String theatreCity);
	public Events getEventsByName(String eventName,String theatreCity);
}
