package com.fm.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "league")
public class League {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "league_name")
	private String leagueName;
	
	@Column(name = "league_founded")
	private String leagueFounded;
	
	@Column(name = "league_start")
	private String leagueStart;
	
	@Column(name = "league_end")
	private String leagueEnd;
	
	@Column(name = "total_teams")
	private String totalTeams;
	
	@Column(name = "league_hierarchy")
	private String leagueHierarchy;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country countryId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueFounded() {
		return leagueFounded;
	}

	public void setLeagueFounded(String leagueFounded) {
		this.leagueFounded = leagueFounded;
	}

	public String getLeagueStart() {
		return leagueStart;
	}

	public void setLeagueStart(String leagueStart) {
		this.leagueStart = leagueStart;
	}

	public String getLeagueEnd() {
		return leagueEnd;
	}

	public void setLeagueEnd(String leagueEnd) {
		this.leagueEnd = leagueEnd;
	}

	public String getTotalTeams() {
		return totalTeams;
	}

	public void setTotalTeams(String totalTeams) {
		this.totalTeams = totalTeams;
	}

	public String getLeagueHierarchy() {
		return leagueHierarchy;
	}

	public void setLeagueHierarchy(String leagueHierarchy) {
		this.leagueHierarchy = leagueHierarchy;
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}
	
}
