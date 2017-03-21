package com.bridgelabz.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee_Info")
public class Employee implements Serializable{

	@Id@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="Emp_Name")
	private String name;
	@Column(name="DEPT_NO")
	private String dept;
	@Column(name="Salary")
	private int salary;
	@Id
	@Column(name="E_mail")
	private String mail;
	@Column(name="Password")
	private  String password;
	
	public Employee() {
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
