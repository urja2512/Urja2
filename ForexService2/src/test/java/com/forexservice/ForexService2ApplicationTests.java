package com.forexservice;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.forexservice.entity.Users;
import com.forexservice.exception.UserNotFoundException;
import com.forexservice.service.UserService;

@SpringBootTest
class ForexService2ApplicationTests {
	  

	@Autowired
	private UserService userService;



	   @Test
	    void addUserTest() throws UserNotFoundException {
		   Users users = new Users(2,"URMONOHA", "235@Ua45","priya","urja@gmail.com","9453782357");

	        Users testUsers = this.userService.addUser(users);

	        assertNotNull(testUsers);

	    }



	    private void assertNotNull(Users testUser) {

	        // TODO Auto-generated method stub
	    }
	    
	  

   

       

    }



