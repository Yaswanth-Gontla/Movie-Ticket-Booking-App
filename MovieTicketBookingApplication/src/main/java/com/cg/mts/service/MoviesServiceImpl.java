package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Movies;
import com.cg.mts.repository.IMoviesRepository;

@Service
public class MoviesServiceImpl implements IMoviesService {

	@Autowired
	IMoviesRepository repository;
	
	@Override
	public boolean addMovie(Movies movies) {
		repository.save(movies);
		return true;
	}

	@Override
	public boolean removeMovie(int moviesid) {
		repository.deleteById(moviesid);
		return true;
	}
	
	@Override
	public Movies viewMovies(int movieId) {
		// TODO Auto-generated method stub
		return repository.findById(movieId).get();
	}

	@Override
	public List<Movies> viewMovieList() {
		// TODO Auto-generated method stub
		List<Movies> list=(List<Movies>) repository.findAll();
		return list;
	}

	@Override
	public List<Movies> getMoviesByLanguage(String movieLanguage,String theatreCity) {
		// TODO Auto-generated method stub
		return repository.getMoviesByLanguage(movieLanguage,theatreCity);
	}

	@Override
	public Movies getMoviesByName(String movieName,String theatreCity) {
		// TODO Auto-generated method stub
		return repository.getMoviesByName(movieName,theatreCity);
	}

}