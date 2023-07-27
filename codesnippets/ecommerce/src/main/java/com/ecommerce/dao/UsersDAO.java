package com.ecommerce.dao;

import com.ecommerce.model.User;
import com.ecommerce.utils.Response;

/*
 *      This interface is a contract between UsersDAO and UsersDAOImpl
 * 
 */

public interface UsersDAO {
	 public Response registerUser(User user);
}
