package com.springmvc.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homepage() {
		System.out.println("home page route called");		
		return "home";
	}
	@GetMapping("/login")
	public String loginPage() {
		 System.out.println("login page called");
		 return "login";
	}
	@PostMapping("/authenticate")
	public String authenticateUser(HttpServletRequest request,ModelMap modelMap) {
		String redirectTo="";
		String username =  request.getParameter("username");
		String password = request.getParameter("password"); 
		System.out.println("username" + username);
		System.out.println("password" + password);
		if(username.contentEquals("sai") && password.contentEquals("sai")) {
			redirectTo="success";
		}
		else {
			modelMap.addAttribute("message", "Username / password incorrect");
			redirectTo="login";
			
		}
		return redirectTo;
	}
}
