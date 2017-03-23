package com.bridgelabz.oneoneutil;

import com.bridgelabz.oneonedao.PersonDao;
import com.bridgelabz.oneonedto.Details;
import com.bridgelabz.oneonedto.Person;


public class PersonUtil {

	public static void main(String[] args) {
		
		Details details=new Details();
		
		details.setCity("Bangaluru");
		details.setAge(30);
		details.setSalary(29000);
		
		
		Person person=new Person();
		person.setName("Mahesh");
		person.setDetails(details);
		details.setPerson(person);
		
		
		
		
		PersonDao dao=new PersonDao();
		dao.save(person);
	}
}
