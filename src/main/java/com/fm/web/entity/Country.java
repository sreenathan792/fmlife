package com.fm.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="federation")
	private String federation;
	
	@Column(name="continental_federation")
	private String continentalFederation;
	
	@OneToOne
	@JoinColumn(name = "national_team_id")
	private Team nationalTeamId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getFederation() {
		return federation;
	}

	public void setFederation(String federation) {
		this.federation = federation;
	}

	public String getContinentalFederation() {
		return continentalFederation;
	}

	public void setContinentalFederation(String continentalFederation) {
		this.continentalFederation = continentalFederation;
	}

	public Team getNationalTeamId() {
		return nationalTeamId;
	}

	public void setNationalTeamId(Team nationalTeamId) {
		this.nationalTeamId = nationalTeamId;
	}

}
