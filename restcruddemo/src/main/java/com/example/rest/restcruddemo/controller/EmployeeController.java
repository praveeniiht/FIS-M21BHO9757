package com.example.rest.restcruddemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> data = service.getAllEmployees();
		ResponseEntity response = new ResponseEntity(data,HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> insertEmployee(@RequestBody Employee employee ){
		Employee emp = service.addEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@GetMapping("/search/{empid}")
	public ResponseEntity<Optional<Employee>> searchEmployee(@PathVariable Integer empid){
		Optional<Employee> emp = service.searchEmployee(empid);
		return new ResponseEntity<Optional<Employee>>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/delete/{empid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer empid){
		service.deleteEmployee(empid);
		return new ResponseEntity<String>("Person data deleted",HttpStatus.OK);
	}
	
}
