package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Customers;
import com.cg.mts.repository.IAdminRepository;
@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	IAdminRepository repository;

	@Override
	public Admin createCustomer(Admin admin) {
		// TODO Auto-generated method stub
		return repository.save(admin);
	}

	@Override
	public List<Admin> getAdmins() {
		List<Admin> list=(List<Admin>) repository.findAll();
		return list;
	}

	@Override
	public boolean deleteAdminById(int adminId) {
		repository.deleteById(adminId);
		return true;
	}

	@Override
	public Admin getAdminById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin checkAdminById(int adminId) {
		return repository.findById(adminId).get() ;
	}

	@Override
	public List<Admin> getAdminByName(String adminName) {
		return repository.getAdminByName(adminName);
	}

	@Override
	public List<Admin> getAdminByEmail(String adminEmail) {
		return repository.getAdminByEmail(adminEmail);

	}

}
