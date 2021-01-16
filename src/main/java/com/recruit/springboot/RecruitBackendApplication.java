package com.recruit.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.recruit.springboot.model.Employee;
import com.recruit.springboot.model.Project;
import com.recruit.springboot.repository.EmployeeRepository;
import com.recruit.springboot.repository.ProjectRepository;

@SpringBootApplication
public class RecruitBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RecruitBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("sample employee"));
		this.projectRepository.save(new Project("sample"));
	}

}
