package com.utility;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class EmpUtility {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.setId(3);
		emp.setName("jaggu");
		emp.setSalary(15000);
		emp.setDepartment("Angular");
		
		EmployeeDao dao=new EmployeeDao();
		dao.insert(emp);
		
		
		/*EmployeeDao dao=new EmployeeDao();
		Employee emp=dao.fetch(2);
		System.out.println(emp);*/
	}

}
