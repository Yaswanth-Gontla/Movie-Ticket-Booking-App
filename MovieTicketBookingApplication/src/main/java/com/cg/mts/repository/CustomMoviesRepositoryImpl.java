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
public class CustomMoviesRepositoryImpl implements CustomMoviesRepository {
	
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Movies> getMoviesByLanguage(String movieLanguage) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Movies m where m.movieLanguage=:movieLanguage";
		Query<Movies> query = session.createQuery(queryString);
		query.setString("movieLanguage", movieLanguage);
		
		List<Movies>  list = (List<Movies>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Movie Language is Not In The DB");
		}
	}

	@Override
	public Movies getMoviesByName(String movieName) {
		
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Movies m where m.movieName=:movieName";
		Query<Movies> query = session.createQuery(queryString);
		query.setString("movieName", movieName);
		
		Movies movies = (Movies) query.getSingleResult();
		
		if(movies!= null)
		{
			return movies;
		}
		else
		{
			throw new javax.persistence.NoResultException("Movie Name is Not In The DB");
		}
		
	}

}