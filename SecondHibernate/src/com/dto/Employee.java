package com.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Info")
public class Employee implements Serializable {

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="Emp_Name")
	private String name;
	@Column(name="Emp_Sal")
	private double salary;
	@Column(name="Dept")
	private String department;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id +", name=" + name + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
}
