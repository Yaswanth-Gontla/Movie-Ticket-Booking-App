package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Movies;

@Repository
public interface CustomMovieRepository {

	public List<Movies> getMoviesByLanguage(String movieLanguage);
	public List<Movies> getMoviesByName(String movieName);
	
}
