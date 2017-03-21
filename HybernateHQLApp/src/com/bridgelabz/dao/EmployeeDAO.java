package com.bridgelabz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.dto.Employee;

public class EmployeeDAO {
	
	private static SessionFactory factory;
	
	static{
		Configuration configuration=new Configuration();
		
	
		
		factory=configuration.buildSessionFactory();
	
	}
	
	public SessionFactory getSession()
	{
		return factory;
	}

	public boolean registerData(Employee emp)
	{
		try{
			
			SessionFactory factory=getSession();
			Session session=factory.openSession();

			Transaction tx=session.beginTransaction();
			session.save(emp);
			tx.commit();
			session.close();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Employee login(Employee emp)
	{
		SessionFactory factory=getSession();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee e=session.get(Employee.class,emp.getId());
		session.close();
		return e;
	}
	
}
