package com.forexservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forexservice.entity.Users;
import com.forexservice.exception.UserNotFoundException;
import com.forexservice.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public Users addUser(@RequestBody Users user) throws UserNotFoundException {
		return this.userService.addUser(user);
	}
	
	
	@GetMapping("/user/{id}")
	public Optional<Users> getuserById(@PathVariable("id") Integer userId ) throws UserNotFoundException {
		return this.userService.getUserById(userId);
	}
	
	
	@GetMapping("/users")
	public List<Users> getAllUser(){
		return this.userService.getAllUser();
	}
	
	@DeleteMapping("/user/{userId}")
	public boolean deleteUserById(@PathVariable("userId")Integer userId) throws UserNotFoundException {
		return this.userService.deleteUserById(userId);
	}


}
