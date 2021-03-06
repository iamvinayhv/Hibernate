package com.bridgelabz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.dto.Employee;

public class EmployeeDAO {

	
	public void save(Employee employee)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
	}
}
