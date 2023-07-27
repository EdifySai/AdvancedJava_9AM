package com.ecommerce.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;
import com.ecommerce.utils.Response;


/*
 *   UsersDAOImpl class implements the methods of UsersDAO
 *   Performs Database related operations
 */
@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	  SessionFactory sessionFactory;
	
	@Override
	public Response registerUser(User user) {
		
		Response response = new Response();
		
		   Session session =  sessionFactory.openSession();
		   
		  Transaction tx = session.beginTransaction();
		  
		       int i = (int)session.save(user);
		       
		        if(i!=0) {
		              response.setMessage(" Registration Success");
		              response.setOperation(true);
		              response.setStatusCode(201);
		        }
		        else {
		        	 response.setMessage("Registration failed");
		              response.setOperation(false);
		              response.setStatusCode(500);
		        }
		        tx.commit();
		
		return response;
	}

}
