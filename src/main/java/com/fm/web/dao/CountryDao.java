package com.fm.web.dao;

import java.util.List;

import com.fm.web.entity.Country;

public interface CountryDao {

	public List<Country> getCountries();

	public void saveCountry(Country country);

	public Country fetchCountry(int id);

	public void updateCountry(Country country);

	public void deleteCountry(int id);
	
}
