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
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "team_name")
	private String teamName;
	
	@Column(name = "team_code")
	private String teamCode;
	
	@Column(name = "founded")
	private String founded;
	
	@OneToOne
	@JoinColumn(name = "stadium_id")
	private Stadium stadiumId;
	
	@OneToOne
	@JoinColumn(name = "league_id")
	private League leagueId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public Stadium getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Stadium stadiumId) {
		this.stadiumId = stadiumId;
	}

	public League getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(League leagueId) {
		this.leagueId = leagueId;
	}
	
}
