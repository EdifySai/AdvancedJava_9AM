package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.model.Employee;

public interface EmployeeDAO {
	
	   public boolean add(Employee employee);
	   public List<Employee> list();
	   public void update(Employee employee); 
	   public void delete(int id);

}
