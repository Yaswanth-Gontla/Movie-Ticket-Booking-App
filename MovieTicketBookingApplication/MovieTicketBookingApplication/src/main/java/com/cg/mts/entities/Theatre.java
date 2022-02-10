package com.cg.mts.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Theatre {
private int theatreId;
private String theatreName;
private String theatreCity;
private List<Movie> listOfMovies;
private List<Screen> listOfScreens;
private String managerName;
private String managerContact;

}
