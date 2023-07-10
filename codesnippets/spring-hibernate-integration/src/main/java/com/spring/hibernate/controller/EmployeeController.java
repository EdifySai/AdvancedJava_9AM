package com.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.hibernate.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	  EmployeeService employeeService;
	
	
}
