package com.springmvc.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.demo.model.User;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String homepage() {
		System.out.println("home page route called");		
		return "home";
	}
	@GetMapping("/login")
	public String loginPage(Model model) {
		 System.out.println("login page called");
		   User user = new User();
		 model.addAttribute("user",user);
		 return "login";
	}
	@PostMapping("/authenticate")
	public String authenticateUser(@ModelAttribute("user") User user,ModelMap modelMap) {
		String redirectTo="";
		if(user.getUsername().contentEquals("sai") && user.getPassword().contentEquals("sai")) {
			redirectTo="success";
		}
		else {
			modelMap.addAttribute("message", "Username / password incorrect");
			redirectTo="login";
		}
		return redirectTo;
	}
}
