package com.fm.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fm.web.entity.Country;

@Repository
public class CountryDaoImpl implements CountryDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Country> getCountries() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Country> theQuery = currentSession.createQuery("from Country order by countryName", Country.class);
		List<Country> countryList = theQuery.getResultList();
		return countryList;
	
	}

	@Override
	public void saveCountry(Country country) {

		Session session = sessionFactory.openSession();
		session.save(country);
		session.close();
		
	}
	
}
