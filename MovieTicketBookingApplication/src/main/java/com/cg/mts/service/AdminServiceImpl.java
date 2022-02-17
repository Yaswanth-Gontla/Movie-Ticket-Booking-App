package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Events;
import com.cg.mts.repository.IAdminRepository;
import com.cg.mts.repository.IEventsRepository;

@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	IAdminRepository repository;
	@Override
	public Admin addAdmin(Admin admins) {
		// TODO Auto-generated method stub
		return repository.save(admins);
	}

	@Override
	public boolean removeAdmin(int adminId) {
		// TODO Auto-generated method stub
		repository.deleteById(adminId);
		return true;
	}

}
