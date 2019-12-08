package com.fm.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fm.web.dao.CountryDao;
import com.fm.web.entity.Country;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryDao countryDao;
	
	@Override
	@Transactional
	public List<Country> getCountryService() {
		return countryDao.getCountries();
	}

	@Override
	@Transactional
	public void addNewCountry(Country country) {
		countryDao.saveCountry(country);
	}

	@Override
	@Transactional
	public Country fetchCountry(int id) {
		Country country = countryDao.fetchCountry(id);
		return country;
	}

	@Override
	@Transactional
	public void updateCountry(Country country) {
		countryDao.updateCountry(country);
	}

}
