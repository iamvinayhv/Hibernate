package com.bridgelabz.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.dto.Members_123;

public class MembersUpdate {

	public void save(Members_123 mem) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(mem);
		transaction.commit();
		session.close();
	}
	
	public List fetch()
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Query query=(Query) session.createQuery("from Members_Info");
		
		List<Members_123> members=query.getResultList();
		
		return members;
	}
}
