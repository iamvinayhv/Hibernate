package com.bridgelabz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.dto.Student;

public class StudentDAO {

	public void save(Student student)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(student);
		transaction.commit();
		
		session.close();
	}
}
