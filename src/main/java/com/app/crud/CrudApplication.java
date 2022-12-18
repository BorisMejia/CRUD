package com.app.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crud.entity.User;
import com.app.crud.repository.UserRepository;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
	/*	
		User user1 = new User("boris", "fernandez", "boris@gmail.com");
		repository.save(user1);
		
		User user2 = new User("adriana", "mejia", "adriana@gmail.com");
		repository.save(user2);
		*/
		}

}
