package com.app.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crud.entity.User;
import com.app.crud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> listarTodosUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
