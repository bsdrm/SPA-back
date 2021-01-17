package com.recruit.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recruit.springboot.model.Employee;
import com.recruit.springboot.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employees")
public class EmployeeControler {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping //("employees")
	public List<Employee> getEmployee() {
		return this.employeeRepository.findAll();
	}

}
