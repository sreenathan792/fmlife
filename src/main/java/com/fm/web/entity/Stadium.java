package com.fm.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stadium")
public class Stadium {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "stadium_name")
	private String stadiumName;
	
	@Column(name = "stadium_capacity")
	private String stadiumCapacity;
	
	@Column(name = "location")
	private String location;
	
	@ManyToOne
	@JoinColumn(name = "stadium_country")
	private Country stadiumCountry;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(String stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Country getStadiumCountry() {
		return stadiumCountry;
	}

	public void setStadiumCountry(Country stadiumCountry) {
		this.stadiumCountry = stadiumCountry;
	}
	
}
