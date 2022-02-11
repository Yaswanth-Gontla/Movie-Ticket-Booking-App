package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Customers;

public interface AdminService {
	public Admin addAdmin(Admin admin);
	public Admin updateAdmin(Admin admin) ;
	public Admin deleteAdmin(Admin admin) ;
	public Admin viewAdmin(int adminId) ;
	public List<Admin> viewAllAdmin(int adminId);


}
