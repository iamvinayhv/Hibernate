package com.bridgeLabz.ManyToMany.util;

import java.util.HashSet;
import java.util.Set;

import com.bridgeLabz.ManyToMany.dao.StudentDAO;
import com.bridgeLabz.ManyToMany.model.Courses;
import com.bridgeLabz.ManyToMany.model.Student;

public class Test6 {

	public static void main(String[] args) {
		
		Set<Courses>courses1 = new HashSet<Courses>();
		courses1.add(new Courses("Java"));
		courses1.add(new Courses("Angular"));
		courses1.add(new Courses("MangoDB"));
		
		
		Set<Courses>courses2 = new HashSet<Courses>();
		courses2.add(new Courses(".net"));
		courses2.add(new Courses("Java"));
		
		
		Student student1 = new Student("Indal Kumar",courses1);
		Student student2 = new Student("Raghava", courses2);
		
		StudentDAO dao = new StudentDAO();
		
		
		boolean result = dao.saveStudent(student1);
		if(result)
			System.out.println("student1 added");
		else
			System.out.println("student1 not added");
		
		
		
		boolean result2 = dao.saveStudent(student2);
		if(result2)
			System.out.println("student2 added");
		else
			System.out.println("student2 not added");
		
	}
}
