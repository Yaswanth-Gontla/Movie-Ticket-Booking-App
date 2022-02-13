package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Admin;

public interface IAdminService {

	public Admin createCustomer(Admin admin);
	public List<Admin> getAdmins();
	public boolean deleteAdminById(int adminId);
	public Admin getAdminById(int adminId);
	public boolean checkAdminById(int adminId);
	
	public List<Admin> getAdminByName(String adminName);
	public List<Admin> getAdminByEmail(String adminEmail);
	
}
