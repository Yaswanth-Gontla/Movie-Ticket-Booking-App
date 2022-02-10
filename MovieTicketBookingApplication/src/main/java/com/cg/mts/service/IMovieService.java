package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Movies;


public interface IMovieService {
	public Movies addMovie(Movies movies);
	public Movies removeMovie(int moviesid) ;
	public Movies updateMovie(Movies movies) ;
	public Movies viewMovies(int moviesid) ;
	public List<Movies> viewMovieList();
	
	
}
