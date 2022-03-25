package com.oluwaseun.web;

import com.oluwaseun.web.entity.Todo;
import com.oluwaseun.web.entity.User;
import com.oluwaseun.web.repository.TodoRepository;
import com.oluwaseun.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setPassword("adeoriokin");
		user.setUsername("Seun");

		Todo todo  = new Todo();
		todo.setContent("Worked on LinkedList");

		userRepository.save(user);
	}
}

