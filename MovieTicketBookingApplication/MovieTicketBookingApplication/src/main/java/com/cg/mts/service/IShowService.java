package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Show;


public interface IShowService {

	public Show addShow(Show show);
	public Show updateShow(Show show);
	public Show removeShow(int showid);
	public Show viewShow(int showid);
	public List<Show> viewAllShows();
	public List<Show> viewShowList(int theatreid);
	public List<Show> viewShowList(LocalDate date);
}
