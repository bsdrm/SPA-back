package com.recruit.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recruit.springboot.model.Project;
import com.recruit.springboot.repository.ProjectRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/projects")
public class ProjectControler {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping //("projects")
	public List<Project> getProject() {
		return this.projectRepository.findAll();
	}
	
}
