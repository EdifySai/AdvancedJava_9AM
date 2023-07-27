package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.UsersDAO;
import com.ecommerce.model.User;
import com.ecommerce.utils.Response;

@Service
public class UsersServiceImpl implements UsersService {

	 @Autowired
	 UsersDAO usersDAO;
	
	@Override
	public Response registerUser(User user) {
		 return usersDAO.registerUser(user);
	}

	
}
