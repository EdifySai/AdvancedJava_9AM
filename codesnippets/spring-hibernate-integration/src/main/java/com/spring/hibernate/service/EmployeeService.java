package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.model.Employee;

public interface EmployeeService {
	
	   public void add(Employee employee);
	   public List<Employee> list();
	   public void update(Employee employee); 
	   public void delete(int id);
}
