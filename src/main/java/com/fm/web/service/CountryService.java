package com.fm.web.service;

import java.util.List;

import com.fm.web.entity.Country;

public interface CountryService {

	public List<Country> getCountryService();

	public void addNewCountry(Country country);

	public Country fetchCountry(int id);

	public void updateCountry(Country country);

	public void deleteCountry(int id);
	
}
