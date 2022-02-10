package com.cg.mts.entities;

import java.time.LocalTime;


import javax.persistence.Entity;

@Entity
public class Show {
private int showId;
private LocalTime showStartTime;
private LocalTime showEndTime;
private String showName;
private Movie movie;
private int screenId;
private int theatreId;

}
