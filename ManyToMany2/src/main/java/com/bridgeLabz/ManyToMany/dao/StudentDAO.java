package com.bridgeLabz.ManyToMany.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeLabz.ManyToMany.model.Student;

public class StudentDAO {

	public boolean saveStudent(Student student) {
		
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(student);
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
