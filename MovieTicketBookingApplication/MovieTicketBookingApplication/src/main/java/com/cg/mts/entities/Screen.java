package com.cg.mts.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Screen {
private int screenId;
private int theatreId;
private String screenName;
private List<Show> showList;
private int rows;
private int columns;

}