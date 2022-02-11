package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Theaters;
import com.cg.mts.repository.ITheatersRepository;

@Service
public class ITheatersServiceImpl implements ITheatersService {

	@Autowired
	ITheatersRepository repository;

	@Override
	public boolean addTheater(Theaters theaters) {
		repository.save(theaters);
		return true;
	}

	@Override
	public boolean removeTheater(int theatersid) {
		repository.deleteById(theatersid);
		return true;
	}

	@Override
	public boolean updateTheater(Theaters theaters) {
		// TODO Auto-generated method stub
		repository.save(theaters);
		return true;
	}

	@Override
	public Movies viewTheaters(int theatersid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Theaters> viewTheaterList() {
		// TODO Auto-generated method stub
		return null;
	}

}