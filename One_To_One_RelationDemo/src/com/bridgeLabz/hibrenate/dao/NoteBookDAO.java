package com.bridgeLabz.hibrenate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeLabz.hibrenate.dto.NoteBook;

public class NoteBookDAO {
	
	public NoteBookDAO() {
		System.out.println(this.getClass().getSimpleName()+" Created....");
	}
	
	public void saveDto(NoteBook dto){
		System.out.println("Inside Save method");
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(NoteBook.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.saveOrUpdate(dto);
			tx.commit();
		}catch (HibernateException e)
		{
			e.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
		}
	}
}