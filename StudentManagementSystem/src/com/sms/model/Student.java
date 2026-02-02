package com.sms.model;

public class Student {
	private int id;
	private String name;
	private String email;
	private String department;
	
	public Student(){}
	
	public Student(String name,String email ,String department){
		this.name = name;
		this.email = email;
		this.department = department;
	}
	
	public Student(int id,String name,String email ,String department){
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	
	//Getters & Setters
	
	
	//student id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//student name
	public String getName() {
		return name;
	}
	
	public void setNamw(String name) {
		this.name = name;
	}
	
	//student email
	public String getEmail() {
		return email;
	}
	
	public void setId(String email) {
		this.email = email;
	}
	
	//student department
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
}
