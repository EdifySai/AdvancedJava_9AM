package com.spring.hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean add(Employee employee) {
		boolean result = false;
		System.out.println("Inside EmployeeDAOImpl add method ");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
	 Integer id = (Integer)session.save(employee);
	   System.out.println("id :" + id);
		tx.commit();
		session.close();
		if(id > 0) {
		      result = true;
		}
		return result;
	}
	public List<Employee> list() {
		
		Session session = sessionFactory.openSession();
		
	Query query = session.createQuery("from Employee e");
	
 List<Employee> employees =query.getResultList();
 
 return employees;
		
	}
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
