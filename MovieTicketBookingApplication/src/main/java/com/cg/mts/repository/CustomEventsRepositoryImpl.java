package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import com.cg.mts.entities.Events;

@Repository
public class CustomEventsRepositoryImpl implements CustomEventsRepository {

	List<Events> list=new ArrayList<>();
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Events> getEventsByGenre(String eventGenre) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from events where eventGenre=:eventGenre";
		Query<Events> query = session.createQuery(queryString);
		query.setString("eventGenre", eventGenre);
		
		List<Events>  list = (List<Events>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event Genre is Not In The DB");
		}
	}

	@Override
	public List<Events> getEventsByName(String eventName) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from events where eventName=:eventName";
		Query<Events> query = session.createQuery(queryString);
		query.setString("eventName", eventName);
		
		List<Events>  list = (List<Events>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event name is Not In The DB");
		}
	}


	@Override
	public List<Events> getEventsByLanguage(String eventLanguage) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from events where eventLanguage=:eventLanguage";
		Query<Events> query = session.createQuery(queryString);
		query.setString("eventLanguage", eventLanguage);
		
		List<Events>  list = (List<Events>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event name is Not In The DB");
		}
	}



}
