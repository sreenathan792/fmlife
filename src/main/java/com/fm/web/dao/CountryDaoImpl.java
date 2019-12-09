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

		Session session = sessionFactory.getCurrentSession();
		session.save(country);
		
	}

	@Override
	public Country fetchCountry(int id) {

		Session session = sessionFactory.getCurrentSession();
		Country country = session.get(Country.class, id);
		return country;
		
	}

	@Override
	public void updateCountry(Country country) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(country);
		
	}

	@Override
	public void deleteCountry(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("delete from Country where id = :theId").setParameter("theId", id);
		theQuery.executeUpdate();
	
	}
	
}
