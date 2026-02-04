package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.UserService;

import lombok.RequiredArgsConstructor;


//http://localhost:8080/users?name=Vishal 
//http://localhost:8080/h2-console                    // use this to see h2 db tables data , use jdbc:h2:mem:db1 as url to connect with h2 db in h2-console page

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
	private final UserService service;
	
	@PostMapping
	public String createUser(@RequestParam String name) {
		service.createUser(name);
		return "User saved in DB1 and Audit saved in DB2";
	}
}
