package com.cg.mts.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Movies {

	@Id
	@SequenceGenerator(name="mylogic1",initialValue=200,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic1")
	private int movieId;
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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Movies_Theater_Info",
			joinColumns=@JoinColumn(name="moviedetails"),
			inverseJoinColumns=@JoinColumn(name="theaterdetails"))
	private List<Theaters> theaters;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Movie_Info",
			joinColumns=@JoinColumn(name="moviedetails"),
			inverseJoinColumns=@JoinColumn(name="customersdetails"))
	private List<Customers> customers;

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

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

	public List<Theaters> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theaters> theaters) {
		this.theaters = theaters;
	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	public Movies(int movieId, @NotNull(message = "Name must be mentioned") String movieName,
			@NotNull(message = "Genre must be mentioned") String movieGenre, @Range(min = 1, max = 3) String movieHours,
			@NotNull(message = "Language must be mentioned") String movieLanguage,
			@NotNull(message = "Language must be mentioned") String movieDescription, List<Theaters> theaters,
			List<Customers> customers) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.movieDescription = movieDescription;
		this.theaters = theaters;
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieHours=" + movieHours + ", movieLanguage=" + movieLanguage + ", movieDescription="
				+ movieDescription + ", theaters=" + theaters + ", customers=" + customers + "]";
	}


	
}