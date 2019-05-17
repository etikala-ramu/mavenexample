package com.maven.web.dao;

import com.maven.web.model.Employee;

public class EmpDao {
 public Employee getEmployee(int eid) {
	Employee e=new Employee();
	e.setId(13);
	e.setName("ramu");
	e.setEmail("ramu@gmail.com");
	 return e;
 }
}
