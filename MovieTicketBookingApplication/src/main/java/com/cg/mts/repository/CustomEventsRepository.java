package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Events;
@Repository
public interface CustomEventsRepository {

	public List<Events> getEventsByGenre(String eventGenre);
	public List<Events> getEventsByLanguage(String eventLanguage);
	public Events getEventsByName(String eventName);
	public List<Events> filterEventsByNoOfHours(int range1,int range2);
	
}
