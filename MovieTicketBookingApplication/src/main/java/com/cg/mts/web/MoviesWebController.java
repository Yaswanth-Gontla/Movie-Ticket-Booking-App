package com.cg.mts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Movies;
import com.cg.mts.service.IMoviesService;

@RestController
@RequestMapping("/app")
public class MoviesWebController {

	@Autowired	
	IMoviesService service;
	
	@PostMapping("/addmovie")
	public boolean addMovie(@RequestBody Movies movies)
	{
		service.addMovie(movies);
		return true;
	}
	
	@GetMapping("/getmovie/{movieId}")
	public Movies viewMovie(@PathVariable int movieId)
	{
		return service.viewMovies(movieId);
	}
	
	@GetMapping("/movies")
	public List<Movies> viewAllMovies()
	{
		return service.viewMovieList();
	}
	
	@DeleteMapping("/removemovie")
	public boolean removeMovie(@RequestParam int movieId)
	{
		return service.removeMovie(movieId);		
	}
	
	@GetMapping("/movielang/{movieLanguage}/{theatreCity}")
	public List<Movies> getMoviesByLanguage(@PathVariable String movieLanguage,@PathVariable String theatreCity)
	{
		return service.getMoviesByLanguage(movieLanguage,theatreCity);
	}
	
	@GetMapping("/moviename/{movieName}/{theatreCity}")
	public Movies getMoviesByName(@PathVariable String movieName,@PathVariable String theatreCity)
	{
		return service.getMoviesByName(movieName,theatreCity);
		
	}
	
}