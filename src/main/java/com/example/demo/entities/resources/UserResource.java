package com.example.demo.entities.resources;

import javax.persistence.Table;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
@RequestMapping(value = "/userss")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(null, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
