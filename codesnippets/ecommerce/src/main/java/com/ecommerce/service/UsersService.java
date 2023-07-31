package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.User;
import com.ecommerce.utils.Response;

public interface UsersService {

	public Response registerUser(User user);
	public Response loginUser(User user);
	 public List<User> getUsers(); 
	
}
