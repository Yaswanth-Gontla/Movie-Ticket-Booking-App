package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Theaterss;

@Service
public interface ITheatersService {
	public boolean addTheater(Theaters theaters);
	public boolean removeTheater(int theatersid);
	public boolean updateTheater(Theaters theaters);
	
	public Movies viewTheaters(int theatersid);
	public List<Theaterss> viewTheaterList();
	
	
}