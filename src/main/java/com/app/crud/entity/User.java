package com.app.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 15)
	private String name;
	
	@Column(name = "lastname", nullable = false, length = 45)
	private String lastname;
	
	@Column(name = "email", nullable = false, length = 45, unique = true)
	private String email;

	
	
	
	public User() {
		super();
	}

	public User(Long id, String name, String lastname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}

	public User(String name, String lastname, String email) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}
	
	
	
	
}
