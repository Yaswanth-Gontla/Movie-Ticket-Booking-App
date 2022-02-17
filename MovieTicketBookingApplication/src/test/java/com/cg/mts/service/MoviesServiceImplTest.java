package com.cg.mts.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.mts.entities.Movies;
import com.cg.mts.repository.IMoviesRepository;

@SpringBootTest
class MoviesServiceImplTest {

	@Mock
    IMoviesRepository repository;
	
	@Test
	void testViewMovies() {
		Movies actualMovie = new Movies();
        Optional<Movies> output = Optional.of(actualMovie); 
        when((repository.findById(201))).thenReturn(output);
        assertEquals(new Movies(), actualMovie);
	}

	@Test
	void testViewMovieList() {
		 List<Movies> actualOutput = new ArrayList<>();

	        when(repository.findAll()).thenReturn(actualOutput);
	        // verify
	        assertIterableEquals(new ArrayList<Movies>(), actualOutput);
	}

}
