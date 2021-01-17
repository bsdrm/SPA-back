package com.recruit.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.recruit.springboot.repository.EmployeeRepository;
import com.recruit.springboot.repository.ProjectRepository;

@EnableJpaRepositories(basePackages = "com.recruit.springboot.repository")
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
		
	}

}
