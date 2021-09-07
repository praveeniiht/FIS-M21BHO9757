package com.example.rest.restcruddemo.service;
import java.util.*;

import com.example.rest.restcruddemo.model.Employee;
public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public Optional<Employee> searchEmployee(int empid);
	public void deleteEmployee(int empid);
}
