package com.utility;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class EmpUtility {

	public static void main(String[] args) {
		
		/*Employee emp= new Employee();
		emp.setId(3);
		emp.setName("Zakir");
		emp.setSalary(25000);
		emp.setDepartment("Android");
		
		EmployeeDao dao=new EmployeeDao();
		dao.insert(emp);*/
		
		
		/*EmployeeDao dao=new EmployeeDao();
		Employee emp=dao.fetch(2);
		System.out.println(emp);*/
		
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		List <Employee> employees= session.createQuery("From Employee").list();
		
		for(Employee emp:employees)
		{
			System.out.println(emp.getId()+".	"+emp.getDepartment()+"		"+emp.getName()+"	"+emp.getSalary());
		}
		
	}

}
