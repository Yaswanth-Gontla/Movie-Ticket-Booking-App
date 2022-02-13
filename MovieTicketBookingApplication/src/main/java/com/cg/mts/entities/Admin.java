package com.cg.mts.entities;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Admin {

    @Id
	@SequenceGenerator(name="mylogic5",initialValue=2000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic5")
	private int adminId;
	private String adminEmail;
	private String adminName;
	private String password;
	public Admin(int adminId, String adminEmail, String adminName, String password) {
		super();
		this.adminId = adminId;
		this.adminEmail = adminEmail;
		this.adminName = adminName;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adminEmail, adminId, adminName, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(adminEmail, other.adminEmail) && adminId == other.adminId
				&& Objects.equals(adminName, other.adminName) && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminEmail=" + adminEmail + ", adminName=" + adminName + ", password="
				+ password + "]";
	}
	
	
    
}
