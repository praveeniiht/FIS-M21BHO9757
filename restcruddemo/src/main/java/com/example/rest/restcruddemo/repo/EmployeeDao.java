package com.example.rest.restcruddemo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.restcruddemo.model.Employee;


@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
