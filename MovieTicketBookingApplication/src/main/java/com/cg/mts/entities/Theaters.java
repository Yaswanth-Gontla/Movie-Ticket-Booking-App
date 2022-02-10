package com.cg.mts.entities;

import java.util.List;

public class Theaters {
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private List<Movies> listOfMovies;
	private String managerName;
	private String managerContact;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public List<Movies> getListOfMovies() {
		return listOfMovies;
	}
	public void setListOfMovies(List<Movies> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	public Theaters(int theatreId, String theatreName, String theatreCity, List<Movies> listOfMovies,
			String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.listOfMovies = listOfMovies;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	public Theaters() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Theaters [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", listOfMovies=" + listOfMovies + ", managerName=" + managerName + ", managerContact="
				+ managerContact + "]";
	}
	
	
}
