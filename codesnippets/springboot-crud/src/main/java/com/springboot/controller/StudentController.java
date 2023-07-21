package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.StudentService;
import com.springboot.utils.Response;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
     public ResponseEntity<Response> addStudent(@RequestBody Student student) {
    	 Response response = studentService.addStudent(student);
    	
    	 return new ResponseEntity<Response>(response, response.getOperation()? HttpStatus.CREATED : HttpStatus.BAD_REQUEST);
     }
	@GetMapping("/list")
	 public ResponseEntity<List<Student>> getStudents(){   
    return new ResponseEntity<List<Student>>( studentService.list(), HttpStatus.OK);
		  		 
	 }
	@GetMapping("/student/{id}")
	  public ResponseEntity<Student> getStudent(@PathVariable int id){
		  Student student = studentService.getStudent(id);
		return new ResponseEntity<Student>( student,HttpStatus.OK);
	  }
	
	@DeleteMapping("/student/{id}")
	   public ResponseEntity<Response> deleteStudent(@PathVariable int id){
		   
		      System.out.println("id:" + id);
		     Response response = studentService.deleteStudent(id);

		   return new ResponseEntity<Response>( response, response.getOperation()? HttpStatus.OK : HttpStatus.BAD_REQUEST);
		   
	   }
	 @PutMapping("/update")
	 public ResponseEntity<Response> updateStudent(@RequestBody Student student) {
    	 Response response = studentService.updateStudent(student);
    	 return new ResponseEntity<Response>(response, response.getOperation()? HttpStatus.OK : HttpStatus.BAD_REQUEST);
     }
	
}


