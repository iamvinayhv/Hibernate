package dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class LoginDAO {

	public User login(String email, String password )
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Query query= session.createQuery("from User where mail=:e and password=:p");
		
		query.setString("e", email);
		query.setString("p", password);
		
		User u=(User) query.uniqueResult();
		
		
		return u;
	}
}
