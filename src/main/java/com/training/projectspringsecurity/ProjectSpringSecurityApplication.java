package com.training.projectspringsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.training.projectspringsecurity.entities.Role;
import com.training.projectspringsecurity.entities.User;
import com.training.projectspringsecurity.repositories.UserRepository;

@SpringBootApplication
public class ProjectSpringSecurityApplication implements CommandLineRunner{

	
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringSecurityApplication.class, args);
	}

	public void run(String... args) throws Exception {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if(adminAccount == null) {
			User user = new User();

			user.setEmail("admin@example.com");
			user.setFirstname("Admin");
			user.setLastname("Admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("password"));

			userRepository.save(user);
		}
	}

}
