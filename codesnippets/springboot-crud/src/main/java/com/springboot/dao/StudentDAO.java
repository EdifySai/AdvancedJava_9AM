package com.springboot.dao;

import java.util.List;

import com.springboot.model.Student;
import com.springboot.utils.Response;

public interface StudentDAO {
	 public Response addStudent(Student student);
	 public List<Student> list();
	 public Response deleteStudent(int id);
	 public Student getStudent(int id);
	 public Response updateStudent(Student student);
}
