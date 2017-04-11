package com.bridgeLabz.ManyToMany.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="MM_Student_Info")
public class Student implements Serializable {

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int studentId;
	private String studentName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private Set<Courses> course;

	public Student() {}
	
	public Student(String studentName, Set<Courses> course) {
		
		this.studentName = studentName;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Courses> getCourse() {
		return course;
	}

	public void setCourse(Set<Courses> course) {
		this.course = course;
	}

	
	
	
}
