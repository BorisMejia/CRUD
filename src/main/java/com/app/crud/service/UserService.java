package com.app.crud.service;

import java.util.List;

import com.app.crud.entity.User;

public interface UserService {

	public List<User> listarTodosUser();
	
	public User saveUser(User user);
	
	public User getUserId(Long id);
	
	public User updateUser(User usuario);
	
	public void deleteUser(Long id);
}
