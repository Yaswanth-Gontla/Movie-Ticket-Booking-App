package com.cg.mts.service;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Events;
@Service
public interface IAdminService {

	public Admin addAdmin(Admin admins);
	public boolean removeAdmin(int adminId);
	
}
