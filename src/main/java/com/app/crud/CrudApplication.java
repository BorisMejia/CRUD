package com.app.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crud.entity.User;
import com.app.crud.repository.UserRepository;

@SpringBootApplication
public class CrudApplication{

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private UserRepository repository;
	


}
