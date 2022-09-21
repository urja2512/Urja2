package com.forexservice.service;

import java.util.List;
import java.util.Optional;

import com.forexservice.entity.Users;
import com.forexservice.exception.UserNotFoundException;


public interface UserService {

	public Users addUser(Users user) throws UserNotFoundException;
	Optional<Users> getUserById(Integer userId) throws UserNotFoundException;
	public boolean deleteUserById(Integer userId) throws UserNotFoundException;
	
	List<Users> getAllUser();
	public Users updateUser(Users user) throws UserNotFoundException;
	
	
	

}
