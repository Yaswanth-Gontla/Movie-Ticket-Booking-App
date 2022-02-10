package com.cg.mts.entities;

import javax.persistence.Entity;

@Entity
public class Admin {
	
private int adminId;
private String adminName;
private String adminMobileNumber;
private String adminAddress;
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminMobileNumber() {
	return adminMobileNumber;
}
public void setAdminMobileNumber(String adminMobileNumber) {
	this.adminMobileNumber = adminMobileNumber;
}
public String getAdminAddress() {
	return adminAddress;
}
public void setAdminAddress(String adminAddress) {
	this.adminAddress = adminAddress;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(int adminId, String adminName, String adminMobileNumber, String adminAddress) {
	super();
	this.adminId = adminId;
	this.adminName = adminName;
	this.adminMobileNumber = adminMobileNumber;
	this.adminAddress = adminAddress;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminMobileNumber=" + adminMobileNumber
			+ ", adminAddress=" + adminAddress + "]";
}




}
