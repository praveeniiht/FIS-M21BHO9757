package com.example.rest.restcruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.restcruddemo.model.Employee;
import com.example.rest.restcruddemo.repo.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

	@Override
	public Optional<Employee> searchEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.findById(empid);
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		dao.deleteById(empid);
		
	}

}
