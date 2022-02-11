package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.mts.entities.Movies;

public interface IMoviesRepository extends CrudRepository<Movies, Integer>
{

}
