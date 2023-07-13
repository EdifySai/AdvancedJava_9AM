package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	    		List<Employee> employees  = employeeService.list();
	    		System.out.println("employees" + employees);
	    		model.addAttribute("employees", employees);
		 return "home";
	  }
	
	@PostMapping("/addEmployee")
	   public String addEmployee(@ModelAttribute("employee") Employee employee, ModelMap model) {
		 System.out.println("employee"+ employee.getLocation() +" " +employee.getName());
		       boolean response = employeeService.add(employee);
		       
		        if(response == true) {
		        	List<Employee> employees  = employeeService.list();
		    		System.out.println("employees" + employees);
		    		model.addAttribute("employees", employees);
		        	model.addAttribute("message", "Employee added successfully!");
		        }
		        else {
		        	model.addAttribute("message", "Failure in adding employee");	
		        }
		             return "home";
	   }
	@GetMapping("/showEmployees")
	public String getEmployees(ModelMap model) {
		List<Employee> employees  = employeeService.list();
		System.out.println("employees" + employees);
		model.addAttribute("employees", employees);
		Employee employee = new Employee();
	      model.addAttribute("employee", employee);
		return "home";
	}
	
	@GetMapping("/deleteEmployee")
	 public String deleteEmployee(@RequestParam("id") int id, ModelMap model) {
		 System.out.println("id" + id);
		  employeeService.delete(id);
		  Employee employee = new Employee();
	      model.addAttribute("employee", employee);
	      List<Employee> employees  = employeeService.list();
  		System.out.println("employees" + employees);
  		model.addAttribute("employees", employees);
		  model.addAttribute("message", "Employee Delete Successfully");	
		return "home";
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
