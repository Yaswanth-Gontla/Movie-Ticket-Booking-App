package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Movies;

@Service
public interface IMoviesService {
	public boolean addMovie(Movies movies);
	public boolean removeMovie(int movieId);
	public boolean updateMovie(Movies movies);
	public Movies viewMovies(int movieId);
	
	public List<Movies> viewMovieList();
	public List<Movies> getMoviesByLanguage(String movieLanguage);
	public List<Movies> getMoviesByName(String movieName);
	
	
}