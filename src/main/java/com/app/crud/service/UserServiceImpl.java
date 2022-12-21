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
		return repository.findAll();
	}

	@Override
	public User saveUser(User usuario) {
		return repository.save(usuario);
	}

	@Override
	public User getUserId(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public User updateUser(User usuario) {
		return repository.save(usuario);
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
		
	}

}
