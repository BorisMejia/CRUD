package com.app.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.crud.entity.User;
import com.app.crud.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping({"/user","/"})
	public String listarUsers(Model  model) {
	model.addAttribute( "user", service.listarTodosUser());
	return "user";
	
	}
	
	@GetMapping("/user/new")
	public String CreateUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";
	}
	
}
