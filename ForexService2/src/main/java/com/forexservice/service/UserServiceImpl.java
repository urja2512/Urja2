package com.forexservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forexservice.entity.Users;
import com.forexservice.exception.UserNotFoundException;
import com.forexservice.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	

	@Override
	public Users addUser(Users user) throws UserNotFoundException {
	
		return this.userRepo.save(user);
	}

	@Override
	public List<Users> getAllUser() {
		
		return this.userRepo.findAll();
	}

	@Override
	public Optional<Users> getUserById(Integer id) throws UserNotFoundException {
		Optional<Users> appointmentOpt = this.userRepo.findById(id);
		if(appointmentOpt==null)
			throw new UserNotFoundException("User Not Found");
		return  appointmentOpt;
	}

	@Override
	public boolean deleteUserById(Integer id) throws UserNotFoundException {
		try {
		    this.userRepo.deleteById(id);
		    return true;
		  }
		catch(Exception e) {
		   return false;
		}
	}
	
	@Override
	public Users updateUser(Users user) throws UserNotFoundException {
		if(this.userRepo.findById(user.getId())==null)
		{
			return this.userRepo.save(user);
			
		}
		else {
//		User updated=user;
//		Optional<User> tem=this.userRepo.findById(user.getId());
			return null;
		}
	}


 

}
