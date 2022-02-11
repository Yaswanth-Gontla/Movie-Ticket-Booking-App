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
public class AdminRepositoryImpl implements AdminRepository{
	List<Admin> list=new ArrayList<>();
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Admin> viewAllAdmin(int adminId) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from events where eventGenre=:eventGenre";
		Query<Admin> query = session.createQuery(queryString);
		query.setString(adminId, "adminId");
		
		List<Admin>  list = (List<Admin>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("AdminId is Not In The DB");
		}
		
	}
	


}
