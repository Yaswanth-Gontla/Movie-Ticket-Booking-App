package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Events;
@Repository

public class AdminRepositoryImpl implements AdminRepository {
	List<Events> list=new ArrayList<>();

	@Autowired
	EntityManager entityManager;


	@Override
	public Admin getAdminById(int adminId) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Admin a where a.adminId=:adminId";
		Query<Admin> query = session.createQuery(queryString);
		query.setLong("adminId", adminId);
		
		Admin admin= (Admin) query.getSingleResult();
		
		if(admin!= null)
		{
			return admin;
		}
		else
		{
			throw new javax.persistence.NoResultException("AdminId is Not In The DB");
		}
		
	}

	@Override
	public List<Admin> getAdminByName(String adminName) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Admin a where a.adminName=:adminName";
		Query<Admin> query = session.createQuery(queryString);
		query.setString("adminName", adminName);
		
		List<Admin>  list = (List<Admin>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("AdminName is Not In The DB");
		}
	}

	@Override
	public List<Admin> getAdminByEmail(String adminEmail) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Admin a where a.adminEmail=:adminEmail";
		Query<Admin> query = session.createQuery(queryString);
		query.setString("adminEmail", adminEmail);
		
		List<Admin>  list = (List<Admin>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("AdminEmail is Not In The DB");
		}
	}

}
