package com.example.rest.restcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.restcruddemo.model.Employee;
import com.example.rest.restcruddemo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/all")
	public ResponseEntity<Employee> getAllEmployees(){
		List<Employee> data = service.getAllEmployees();
		ResponseEntity response = new ResponseEntity(data,HttpStatus.OK);
		return response;
	}
}
