package com.cg.mts.util;


import java.util.Random;

import org.springframework.stereotype.Component;

import com.cg.mts.dto.MoviesInfoDTO;
import com.cg.mts.dto.MoviesSavePostDTO;
import com.cg.mts.entities.Movies;
@Component
public class MoviesDTOConvertionClass {

	public MoviesInfoDTO getMoviesInfoDTO(Movies movies) {
		MoviesInfoDTO dtoObj=new MoviesInfoDTO();
		dtoObj.setMovieId(movies.getMovieId());
		dtoObj.setMovieName(movies.getMovieName());
		dtoObj.setMovieGenre(movies.getMovieGenre());
		dtoObj.setMovieHours(movies.getMovieHours());
		dtoObj.setMovieLanguage(movies.getMovieLanguage());
		dtoObj.setMovieDescription(movies.getMovieDescription());
		dtoObj.setmCommunicationId((new Random().nextInt(4000)));
		return dtoObj;
		
		
	}
	public Movies getMoviesFromPostMoviesDTO(MoviesSavePostDTO dto) {
		
		Movies m=new Movies();
		m.setMovieName(dto.getMovieName());;
		m.setMovieGenre(dto.getMovieGenre());
		m.setMovieHours(dto.getMovieHours());
		m.setMovieLanguage(dto.getMovieLanguage());
		m.setMovieDescription(dto.getMovieDescription());
		return m;
	}
	
}
