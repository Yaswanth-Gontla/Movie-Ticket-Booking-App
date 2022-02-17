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
	@SequenceGenerator(name="mylogic5",initialValue=500,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic5")
	private int adminId;
	private String adminMail;
	private String adminPassword;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminMail() {
		return adminMail;
	}
	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Admin(int adminId, String adminMail, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminMail = adminMail;
		this.adminPassword = adminPassword;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adminId, adminMail, adminPassword);
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
		return adminId == other.adminId && Objects.equals(adminMail, other.adminMail)
				&& Objects.equals(adminPassword, other.adminPassword);
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminMail=" + adminMail + ", adminPassword=" + adminPassword + "]";
	}
 	
	
}
