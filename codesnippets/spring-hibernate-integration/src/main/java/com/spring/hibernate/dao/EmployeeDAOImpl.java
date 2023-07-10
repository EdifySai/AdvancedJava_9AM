package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
