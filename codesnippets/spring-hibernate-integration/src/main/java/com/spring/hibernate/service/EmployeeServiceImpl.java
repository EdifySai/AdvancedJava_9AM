package com.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.dao.EmployeeDAO;
import com.spring.hibernate.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@Transactional
	public boolean add(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Inisde EmployeeServiceImpl");
		System.out.println(employee.getLocation());
		return employeeDAO.add(employee);
	
	}
	public List<Employee> list() {
		// TODO Auto-generated method stub
		 return employeeDAO.list();
	
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
