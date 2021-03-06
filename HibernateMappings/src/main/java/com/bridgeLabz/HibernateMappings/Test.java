package com.bridgeLabz.HibernateMappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Products products = new Products("Tv");
		
		Specification specification = new Specification();
		specification.setModel("Philips");
		specification.setPrice(13500.00);
		
		products.setSpecification(specification);
		
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction =session.beginTransaction();
		session.save(products);
		transaction.commit();
		session.close();
		
		System.out.println("Product Added");
		
	}
}
