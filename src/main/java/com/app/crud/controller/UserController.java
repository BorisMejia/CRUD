package com.app.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
		User usuario = new User();
		model.addAttribute("usuario", usuario);
		return "create_user";
	}
	
	@PostMapping("/user")
	public  String saveUser(@ModelAttribute("user") User user) {
		service.saveUser(user);
		return "redirect:/user";
	}
	
	@GetMapping("/user/edit/{id}")
	public String formEdit(@PathVariable Long id, Model model) {
		model.addAttribute("user", service.getUserId(id));
		return "edit_user";
		
	}
	
	@PostMapping("/user/{id}")
	public String updateUser(@PathVariable Long id, @ModelAttribute("user") User user, Model model) {
		User existingUser = service.getUserId(id);
		existingUser.setId(id);
		existingUser.setName(user.getName());
		existingUser.setLastname(user.getLastname());
		existingUser.setEmail(user.getEmail());
		
		service.updateUser(existingUser);
		return "redirect:/user";
	}
	
	@GetMapping("/user/{id}")
	public String deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
		return "redirect:/user";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
