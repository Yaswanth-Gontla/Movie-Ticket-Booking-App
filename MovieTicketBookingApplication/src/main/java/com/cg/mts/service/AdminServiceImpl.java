package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admin;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminService AdminRepository;

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.addAdmin(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.updateAdmin(admin);
	}

	@Override
	public Admin deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.deleteAdmin(admin);
	}

	@Override
	public Admin viewAdmin(int adminId) {
		// TODO Auto-generated method stub
		return AdminRepository.viewAdmin(adminId);
	}

	@Override
	public List<Admin> viewAllAdmin(int adminId) {
		// TODO Auto-generated method stub
		return AdminRepository.viewAllAdmin(adminId);
	}

	

}
