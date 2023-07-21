package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "students")
public class Student {
	
	@Id @GeneratedValue
	private int id; 
	@Column(nullable = false,columnDefinition = "varchar(100)")
	private String name;
	@Column
	private String course; 
	@Column
	private String currentModule;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCurrentModule() {
		return currentModule;
	}
	public void setCurrentModule(String currentModule) {
		this.currentModule = currentModule;
	}
	
	

}
