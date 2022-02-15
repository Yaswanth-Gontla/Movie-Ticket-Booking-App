package com.cg.mts.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.dto.EventsInfoDTO;
import com.cg.mts.dto.EventsSavePostDTO;
import com.cg.mts.entities.Events;
import com.cg.mts.exceptions.EventIdException;
import com.cg.mts.service.IEventsService;

@RestController
@RequestMapping("/app")
public class EventsWebController {

  @Autowired	
  IEventsService service;
  
  @PostMapping("/addevent")
	public boolean createEvents(@RequestBody Events events)
	{
		service.createEvents(events);
		return true;
	}
  
  @PostMapping("/eventdto")
	public ResponseEntity<EventsInfoDTO> saveEvents(@RequestBody @Valid EventsSavePostDTO e)
	{
		EventsInfoDTO dto=service.saveEvents(e);
		return new ResponseEntity<EventsInfoDTO>(dto,HttpStatus.OK);
	}
	
  @GetMapping("/getevent/{eventId}") 
	public Events viewEvents(@PathVariable int eventId) throws EventIdException
	{
		return service.viewEvents(eventId);
	}
  
  
  @GetMapping("/events")
	public List<Events> viewAllEvents()
	{
		return service.viewAllEvents();
	}
	
  @DeleteMapping("/removeevent/{eventId}")
	public boolean removeEvent(@PathVariable int eventId) {
		return service.removeEvent(eventId);
	}
  
  @GetMapping("/eventname/{eventName}/{theatreCity}")
	public Events getEventsByName(@PathVariable String eventName,@PathVariable String theatreCity)
	{
		return service.getEventsByName(eventName,theatreCity);
		
	}
  
  @GetMapping("/eventg/{eventGenre}/{theatreCity}")
	public List<Events> getEventsByGenre(@PathVariable String eventGenre,@PathVariable String theatreCity)
	{
		return service.getEventsByGenre(eventGenre,theatreCity);
	}
  
  @GetMapping("/eventl/{eventLanguage}/{theatreCity}")
	public List<Events> getEventsByLanguage(@PathVariable String eventLanguage,@PathVariable String theatreCity)
	{
		return service.getEventsByLanguage(eventLanguage,theatreCity);
	}

}
