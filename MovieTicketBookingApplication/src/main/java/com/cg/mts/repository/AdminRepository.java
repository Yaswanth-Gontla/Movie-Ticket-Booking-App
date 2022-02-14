package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;

@Repository
public interface AdminRepository {
	public Admin getAdminById(int adminId);

	public List<Admin> getAdminByName(String adminName);
	public List<Admin> getAdminByEmail(String adminEmail);

}
