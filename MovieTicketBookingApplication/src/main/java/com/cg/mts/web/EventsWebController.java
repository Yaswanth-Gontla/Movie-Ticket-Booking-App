package com.cg.mts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Events;
import com.cg.mts.service.IEventsService;

@RestController
@RequestMapping("/app")
public class EventsWebController {

  @Autowired	
  IEventsService service;
  
  @PostMapping("/event")
	public boolean createEvents(@RequestBody Events events)
	{
		service.createEvents(events);
		return true;
	}
  
  @GetMapping("/Event/{eventId}")
	public Events viewEvents(@PathVariable int eventId)
	{
		return service.viewEvents(eventId);
	}
  
  @GetMapping("/events")
	public List<Events> viewAllEvents()
	{
		return service.viewAllEvents();
	}
	
  @DeleteMapping("/event/{eventId}")
	public boolean removeEvent(@PathVariable int eventId) {
		return service.removeEvent(eventId);
	}
  
  @GetMapping("/eventid/{eventId}")
	public boolean checkEventsById(@PathVariable int eventId) {
		return service.checkEventsById(eventId);
	}
  
  @GetMapping("/event/{eventGenre}")
	public List<Events> getEventsByGenre(@PathVariable String eventGenre)
	{
		return service.getEventsByGenre(eventGenre);
	}
  
  @GetMapping("/event/{eventLanguage}")
	public List<Events> getEventsByLanguage(@PathVariable String eventLanguage)
	{
		return service.getEventsByLanguage(eventLanguage);
	}
  
  @GetMapping("/event/{eventName}")
	public List<Events>  getEventsByName(@PathVariable String eventName)
	{
		return service. getEventsByName(eventName);
	}
}
