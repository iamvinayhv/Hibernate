package com.bridgeLabz.OneToMany.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeLabz.OneToMany.model.Country;

public class CountryDAO {

	public boolean addCountry(Country country) {
		
		try{
			Configuration configuration = new Configuration();
			configuration.configure();
			
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			session.save(country);
			transaction.commit();
			session.close();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
