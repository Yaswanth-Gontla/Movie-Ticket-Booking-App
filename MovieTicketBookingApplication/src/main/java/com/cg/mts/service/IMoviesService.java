package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Movies;

@Service
public interface IMoviesService {
	public boolean addMovie(Movies movies);
	public boolean removeMovie(int moviesid);
	public boolean updateMovie(Movies movies);
	
	public Movies viewMovies(int moviesid);
	public List<Movies> viewMovieList();
	
	
}
