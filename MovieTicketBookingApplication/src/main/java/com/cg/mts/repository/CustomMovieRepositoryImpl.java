package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Movies;

@Repository
public class CustomMovieRepositoryImpl implements CustomMovieRepository {
	
	List<Movies> list=new ArrayList<>();
	@Autowired
	EntityManager entityManager;
	
	

	@Override
	public List<Movies> getMoviesByLanguage(String movieLanguage) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from movies where movieLanguage=:movieLanguage";
		Query<Movies> query = session.createQuery(queryString);
		query.setString("movieLanguage", movieLanguage);
		
		List<Movies>  list = (List<Movies>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Movie Name is Not In The DB");
		}
	}

	@Override
	public List<Movies> getMoviesByName(String movieName) {
		
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from movies where movieName=:movieName";
		Query<Movies> query = session.createQuery(queryString);
		query.setString("movieName", movieName);
		
		List<Movies>  list = (List<Movies>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Movie Name is Not In The DB");
		}
		
	}

}
