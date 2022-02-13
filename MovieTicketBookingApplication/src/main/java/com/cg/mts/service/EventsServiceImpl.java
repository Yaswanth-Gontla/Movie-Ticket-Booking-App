package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Events;
import com.cg.mts.repository.IEventsRepository;
@Service
public class EventsServiceImpl implements IEventsService{
	@Autowired
	IEventsRepository repository;

	@Override
	public boolean removeEvent(int eventId) {
		// TODO Auto-generated method stub
		repository.deleteById(eventId);
		return true;
	}

	@Override
	public Events viewEvents(int eventId) {
		// TODO Auto-generated method stub
		return repository.findById(eventId).get();
	}

	@Override
	public List<Events> viewAllEvents() {
		// TODO Auto-generated method stub
		List<Events> list=(List<Events>) repository.findAll();
		return list;
	}

	@Override
	public List<Events> getEventsByGenre(String eventGenre) {
		// TODO Auto-generated method stub
		return repository.getEventsByGenre(eventGenre);
	}

	@Override
	public List<Events> getEventsByLanguage(String eventLanguage) {
		// TODO Auto-generated method stub
		return repository.getEventsByLanguage(eventLanguage);
	}



	@Override
	public Events createEvents(Events events) {
		// TODO Auto-generated method stub
		return repository.save(events);
	}

	@Override
	public boolean checkEventsById(int eventId) {
		// TODO Auto-generated method stub
		return repository.existsById(eventId);
	}

	@Override
	public Events getEventsByName(String eventName) {
		// TODO Auto-generated method stub
		return repository.getEventsByName(eventName);
	}




}
