package com.bridgeLabz.hibrenate.util;

import com.bridgeLabz.hibrenate.dao.NoteBookDAO;
import com.bridgeLabz.hibrenate.dto.NoteBook;
import com.bridgeLabz.hibrenate.dto.Person;

public class NoteTester {

	public static void main(String [] arg)
	{
		
		Person person=new Person();
		person.setName("Anil");
		
		NoteBook nb = new NoteBook();
		nb.setName("abc");
		nb.setBrand("classmate");
		nb.setPrice(100);
		nb.setPerson(person);
		
		NoteBookDAO dao=new NoteBookDAO();
		dao.saveDto(nb);
		
	}
}
