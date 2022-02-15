package com.cg.mts.dto;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class MoviesSavePostDTO {

	@NotNull(message = "Name must be mentioned")
	private String movieName;
	@NotNull(message = "Genre must be mentioned")
	private String movieGenre;
	@Range(min=1,max=3)
	private String movieHours;
	@NotNull(message = "Language must be mentioned")
	private String movieLanguage;
	@NotNull(message = "Description must be mentioned")
	private String movieDescription;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieHours() {
		return movieHours;
	}
	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public MoviesSavePostDTO(@NotNull(message = "Name must be mentioned") String movieName,
			@NotNull(message = "Genre must be mentioned") String movieGenre, @Range(min = 1, max = 3) String movieHours,
			@NotNull(message = "Language must be mentioned") String movieLanguage,
			@NotNull(message = "Description must be mentioned") String movieDescription) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.movieDescription = movieDescription;
	}

	
}
