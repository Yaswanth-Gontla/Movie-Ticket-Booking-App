package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Movie;


public interface IMovieService {
	public Movie addMovie(Movie movie);
	public Movie removeMovie(int movieid) ;
	public Movie updateMovie(Movie movie) ;
	public Movie viewMovie(int movieid) ;
	public List<Movie> viewMovieList();
	public List<Movie> viewMovieList(int theatreid);
	public List<Movie> viewMovieList(LocalDate date);
	
}
