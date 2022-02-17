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
import com.cg.mts.dto.MoviesInfoDTO;
import com.cg.mts.dto.MoviesSavePostDTO;
import com.cg.mts.entities.Customers;
import com.cg.mts.entities.Events;
import com.cg.mts.entities.Movies;
import com.cg.mts.service.ICustomersService;
import com.cg.mts.service.IEventsService;
import com.cg.mts.service.IMoviesService;

@RestController
@RequestMapping("/app")
public class CustomersWebContorller {

	@Autowired
	ICustomersService service;
	
	@Autowired	
	IEventsService eventService;
	
	@Autowired	
	IMoviesService movieService;
	
	@GetMapping("/getcustomer/{customerId}")
	public Customers getCustomerById(@PathVariable int customerId)
	{
		return service.getCustomerById(customerId);
	}
	
	@PostMapping("/addcustomer") 
	public boolean createCustomer(@RequestBody Customers c) 
	{
		service.createCustomer(c);
		return true;
	}
	
	@DeleteMapping("/customer/{customerId}")
	public boolean removeCustomer(@PathVariable int customerId) {
		return service.removeCustomerById(customerId);
	}
	
	@GetMapping("/customers")
	public List<Customers> listCustomers()
	{
		return service.getAllCustomers();
	}
	/********************/
	@GetMapping("/customern/{eventName}/{theatreCity}")
	public Events getEventsByName(@PathVariable String eventName,@PathVariable String theatreCity)
	{
		return eventService.getEventsByName(eventName,theatreCity);
		
	}
  
  @GetMapping("/customerg/{eventGenre}/{theatreCity}")
	public List<Events> getEventsByGenre(@PathVariable String eventGenre,@PathVariable String theatreCity)
	{
		return eventService.getEventsByGenre(eventGenre,theatreCity);
	}
  
  @GetMapping("/customerl/{eventLanguage}/{theatreCity}")
	public List<Events> getEventsByLanguage(@PathVariable String eventLanguage,@PathVariable String theatreCity)
	{
		return eventService.getEventsByLanguage(eventLanguage,theatreCity);
	}
  
   /********************/
  
  @GetMapping("/customerlang/{movieLanguage}/{theatreCity}")
	public List<Movies> getMoviesByLanguage(@PathVariable String movieLanguage,@PathVariable String theatreCity)
	{
		return movieService.getMoviesByLanguage(movieLanguage,theatreCity);
	}
	
	@GetMapping("/customername/{movieName}/{theatreCity}")
	public Movies getMoviesByName(@PathVariable String movieName,@PathVariable String theatreCity)
	{
		return movieService.getMoviesByName(movieName,theatreCity);
		
	}
  
}
