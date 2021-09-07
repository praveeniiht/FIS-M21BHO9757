package com.example.springboot.springbootdemo.model;

public class Employee {
	String name;
	String dept;
	String desg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Employee(String name, String dept, String desg) {
		super();
		this.name = name;
		this.dept = dept;
		this.desg = desg;
	}
	public Employee() {
		
	}

}
