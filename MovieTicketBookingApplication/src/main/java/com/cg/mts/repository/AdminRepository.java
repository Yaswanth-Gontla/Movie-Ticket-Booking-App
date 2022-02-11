package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;
@Repository
public interface AdminRepository {
	public List<Admin> viewAllAdmin(int adminId);

}
