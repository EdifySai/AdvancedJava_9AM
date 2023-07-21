package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentDAO;
import com.springboot.model.Student;
import com.springboot.utils.Response;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	 StudentDAO studentDAO;
	@Override
	public Response addStudent(Student student) {
		return studentDAO.addStudent(student);
	}
	@Override
	public List<Student> list() {
		  return studentDAO.list();
	}
	@Override
	public Response deleteStudent(int id) {
		// TODO Auto-generated method stub
		return studentDAO.deleteStudent(id);
	}
	@Override
	public Student getStudent(int id) {
		return studentDAO.getStudent(id);
	}
	@Override
	public Response updateStudent(Student student) {
		  return studentDAO.updateStudent(student);
	}
}
