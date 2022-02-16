package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Theaters;

@Repository
public interface CustomTheatersRepository {

	public List<Theaters> getTheatersByCity(String theaterCity,String movieLanguage);
	public Movies getTheatersByName(String theaterName,String movieLanguage);
}