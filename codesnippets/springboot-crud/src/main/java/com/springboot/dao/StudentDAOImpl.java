package com.springboot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.model.Student;
import com.springboot.utils.Response;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Response addStudent(Student student) {
		
		Response response = new Response();
		
		   Session session =  sessionFactory.openSession();
		   
		  Transaction tx = session.beginTransaction();
		  
		       int i = (int)session.save(student);
		       
		        if(i !=0) {
		              response.setMessage("Student added successfully");
		              response.setOperation(true);
		              response.setStatusCode(201);
		        }
		        else {
		        	 response.setMessage("Adding student failed");
		              response.setOperation(false);
		              response.setStatusCode(500);
		        }
		        tx.commit();
		
		return response;
	}
	@Override
	public List<Student> list() {
		 Session session =  sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		 Query<Student> query =  session.createQuery("from Student s");
		return query.getResultList();
		
	}
	@Override
	public Response deleteStudent(int id) {	
		Session session =  sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		    Student student =  session.get(Student.class,id);
		    Response response = new Response();
		    try {
		    session.remove(student);
		    tx.commit();
		    response.setMessage("deleted successfully");
		    response.setOperation(true);
		    response.setStatusCode(200);
		    }catch(Exception error) {
		      System.out.println("error" + error.getMessage());
		      response.setMessage(error.getMessage());
			    response.setOperation(false);
			    response.setStatusCode(200);
		    }
		return response;
	}
	@Override
	public Student getStudent(int id) {
		Session session =  sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		    Student student =  session.get(Student.class,id);
		return student;
	}
	@Override
	public Response updateStudent(Student student) {
		Session session =  sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  Response response = new Response();
		  try {
		  session.update(student);
		  tx.commit();
		    response.setMessage("updated successfully");
		    response.setOperation(true);
		    response.setStatusCode(200);
		  }
		  catch(Exception error) {
			  System.out.println("error" + error.getMessage());
			  response.setMessage("updation failed");
			    response.setOperation(false);
			    response.setStatusCode(200);
		  }
		return response;
	}
}
