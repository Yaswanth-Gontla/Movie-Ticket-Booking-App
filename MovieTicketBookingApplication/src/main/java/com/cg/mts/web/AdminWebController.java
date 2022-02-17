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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.dto.EventsInfoDTO;
import com.cg.mts.dto.EventsSavePostDTO;
import com.cg.mts.dto.MoviesInfoDTO;
import com.cg.mts.dto.MoviesSavePostDTO;
import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Events;
import com.cg.mts.entities.Movies;
import com.cg.mts.exceptions.InvalidEventDurationException;
import com.cg.mts.exceptions.InvalidMovieDurationException;
import com.cg.mts.service.IAdminService;
import com.cg.mts.service.IEventsService;
import com.cg.mts.service.IMoviesService;

@RestController
@RequestMapping("/app")
public class AdminWebController {
	
	@Autowired
	IAdminService adminService;
	
	@Autowired	
	IMoviesService movieService;
	
	@Autowired	
	IEventsService eventService;

	@PostMapping("/addadmin")
	public boolean addAdmin(@RequestBody Admin admin)
	{
		adminService.addAdmin(admin);
		return true;
	}
	
	@DeleteMapping("/removeadmin")
	public boolean removeAdmin(@RequestParam int adminId)
	{
		return adminService.removeAdmin(adminId);
	}
	
	@PostMapping("/adminaddmovie")
	public boolean addMovie(@RequestBody Movies movies) throws InvalidMovieDurationException
	{
		if(movies.getMovieHours()>3)
			throw new InvalidMovieDurationException(movies.getMovieHours());
		movieService.addMovie(movies);
		return true;
	}
	
	@PostMapping("/adminmoviedto")
	public ResponseEntity<MoviesInfoDTO> saveMovies(@RequestBody @Valid MoviesSavePostDTO e)
	{
		MoviesInfoDTO dto=movieService.saveMovies(e);
	 	return new ResponseEntity<MoviesInfoDTO>(dto,HttpStatus.OK);
	}
	 
	@GetMapping("/admingetmovie/{movieId}")
	public Movies viewMovie(@PathVariable int movieId)
	{
		return movieService.viewMovies(movieId);
	}
	
	@GetMapping("/admingetmovies")
	public List<Movies> viewAllMovies()
	{
		return movieService.viewMovieList();
	}
	
	@DeleteMapping("/adminremovemovie")
	public boolean removeMovie(@RequestParam int movieId)
	{
		return movieService.removeMovie(movieId);		
	}
	
	@PostMapping("/admineventdto")
	public ResponseEntity<EventsInfoDTO> saveEvents(@RequestBody @Valid EventsSavePostDTO e)
	{
	 	EventsInfoDTO dto=eventService.saveEvents(e);
	 	return new ResponseEntity<EventsInfoDTO>(dto,HttpStatus.OK);
	}
	@GetMapping("/adminmovielang/{movieLanguage}/{theatreCity}")
	public List<Movies> getMoviesByLanguage(@PathVariable String movieLanguage,@PathVariable String theatreCity)
	{
		return movieService.getMoviesByLanguage(movieLanguage,theatreCity);
	}
	
	@GetMapping("/adminmoviename/{movieName}/{theatreCity}")
	public Movies getMoviesByName(@PathVariable String movieName,@PathVariable String theatreCity)
	{
		return movieService.getMoviesByName(movieName,theatreCity);
		
	}
	@PostMapping("/adminaddevent")
	public boolean createEvents(@Valid  @RequestBody Events events) throws InvalidEventDurationException
	{
		if(events.getEventHours()>3)
		  	throw new InvalidEventDurationException(events.getEventHours());
		eventService.createEvents(events);
		return true;
		}
	  
	  @GetMapping("/admingetevent/{eventId}") 
		public Events viewEvents(@PathVariable int eventId)
		{
		  	return eventService.viewEvents(eventId);
		}
	  
	  @GetMapping("/admingetevents")
		public List<Events> viewAllEvents()
		{
			return eventService.viewAllEvents();
		}
		
	  @DeleteMapping("/adminremoveevent/{eventId}")
		public boolean removeEvent(@PathVariable int eventId) {
			return eventService.removeEvent(eventId);
		}
	  
	  @GetMapping("/admineventname/{eventName}/{theatreCity}")
		public Events getEventsByName(@PathVariable String eventName,@PathVariable String theatreCity)
		{
			return eventService.getEventsByName(eventName,theatreCity);
			
		}
	  
	  @GetMapping("/admineventg/{eventGenre}/{theatreCity}")
		public List<Events> getEventsByGenre(@PathVariable String eventGenre,@PathVariable String theatreCity)
		{
			return eventService.getEventsByGenre(eventGenre,theatreCity);
		}
	  
	  @GetMapping("/admineventl/{eventLanguage}/{theatreCity}")
		public List<Events> getEventsByLanguage(@PathVariable String eventLanguage,@PathVariable String theatreCity)
		{
			return eventService.getEventsByLanguage(eventLanguage,theatreCity);
		}
}