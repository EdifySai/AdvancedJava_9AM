package com.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.hibernate.model.Employee;
import com.spring.hibernate.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	  EmployeeService employeeService;
	
	@GetMapping("/home")
	  public String employeeHome(Model model) {
		 Employee employee = new Employee();
		      model.addAttribute("employee", employee);
	        System.out.println("employeeHome");
		 return "home";
	  }
	
	@PostMapping("/addEmployee")
	   public String addEmployee(@ModelAttribute("employee") Employee employee) {
		 System.out.println("employee"+ employee.getLocation() +" " +employee.getName());
		        employeeService.add(employee);
		             return " ";
		
	   }
}
