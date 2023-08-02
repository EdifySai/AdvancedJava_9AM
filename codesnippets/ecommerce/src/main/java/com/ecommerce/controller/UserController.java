package com.ecommerce.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.service.UsersService;
import com.ecommerce.utils.MailSender;
import com.ecommerce.utils.Response;

@RestController
public class UserController {
	
	@Autowired
	UsersService usersService;
	
	@RequestMapping("/health")
	public String healthCheck() {
		return "App is working fine";
		
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody User user) {
		
		Response response = usersService.registerUser(user);
		 if(response.getOperation() == true) {
			 MailSender mailSender = new MailSender();
			 try {
				int statusCode = mailSender.sendRegistrationConfirmation(user.getEmail());
				System.out.println("Status code" +  statusCode);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		return new ResponseEntity(response,response.getOperation()? HttpStatus.CREATED : HttpStatus.BAD_REQUEST);	
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody User user) {
		Response response = usersService.loginUser(user);
		return new ResponseEntity(response,response.getOperation()? HttpStatus.OK : HttpStatus.BAD_REQUEST);	
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/users")
	public ResponseEntity getAllUsers() {
		List<User> users = usersService.getUsers();
		return new ResponseEntity(users, HttpStatus.OK);
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/forgotPassword")
	public ResponseEntity forgotPassword(@RequestBody User user) {
		Response response = usersService.forgotPassword(user);
		 if(response.getOperation() == true) {
			 MailSender mailSender = new MailSender();
			 try {
				int statusCode = mailSender.forgotPassword(user.getEmail());
				System.out.println("Status code" +  statusCode);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		return new ResponseEntity(response,response.getOperation()? HttpStatus.OK : HttpStatus.BAD_REQUEST);	
			
	}
}
