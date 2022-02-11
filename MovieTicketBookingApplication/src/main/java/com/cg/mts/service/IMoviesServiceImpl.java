package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Movies;
import com.cg.mts.repository.IMoviesRepository;

@Service
public class IMoviesServiceImpl implements IMoviesService {

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
	public boolean updateMovie(Movies movies) {
		// TODO Auto-generated method stub
		repository.save(movies);
		return true;
	}
	
	@Override
	public Movies viewMovies(int moviesid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> viewMovieList() {
		// TODO Auto-generated method stub
		return null;
	}

}
