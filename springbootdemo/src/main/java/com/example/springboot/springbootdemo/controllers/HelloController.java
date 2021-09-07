package com.example.springboot.springbootdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.springbootdemo.model.Employee;


@RestController
@RequestMapping("/classa")
public class HelloController {
	
	
	@PostMapping("/first/{name}")
	public String first(@PathVariable String name) {
		return "Hello,"+name+" Welcome ";
		
	}
	@GetMapping("/second")
	public String second() {
		return "Hello,  iam from second method";
		
	}
	
	@PostMapping("/getData")
	public Employee getData(@RequestBody Employee emp) {
		System.out.println(emp.getName()+" "+emp.getDept()+" "+emp.getDesg());
		emp.setDesg("Sr Manager");
	return emp;
	}

}
