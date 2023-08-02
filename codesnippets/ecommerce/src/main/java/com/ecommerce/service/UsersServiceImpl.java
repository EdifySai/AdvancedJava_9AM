package com.ecommerce.service;

import java.util.List;

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
	@Override
	public Response loginUser(User user) {
		 return usersDAO.loginUser(user);
		
	}
	@Override
	public List<User> getUsers() {
		return usersDAO.getUsers();
	}
	@Override
	public Response forgotPassword(User user) {
		// TODO Auto-generated method stub
		return usersDAO.forgotPassword(user);
	}
}
