package com.recruit.springboot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
//	@Column(name = "employess")
//	private List<Employee> employees = new ArrayList<>();
	
	
	public Project() {
		
	}
	
	


//	public Project(String name, List<Employee> employees) {
	public Project(String name) {
		super();
		this.name = name;
//		this.employees = employees;
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public List<Employee> getEmployees() {
//		return employees;
//	}
//
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
	
	
}
