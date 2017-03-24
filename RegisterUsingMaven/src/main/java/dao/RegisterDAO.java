package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class RegisterDAO {

	public boolean saveData(User user)
	{
		try{
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
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
