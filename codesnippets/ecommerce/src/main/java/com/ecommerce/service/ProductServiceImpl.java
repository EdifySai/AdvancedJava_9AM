package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;
import com.ecommerce.utils.Response;

public class ProductServiceImpl implements ProductService {

	 @Autowired 
	 ProductDAO productDAO;
	
	@Override
	public Response addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

}
