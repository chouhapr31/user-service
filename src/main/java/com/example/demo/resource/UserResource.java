package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserView;
import com.example.demo.repository.UserRepository;

@RestController
/* @RequestMapping("users") */
public class UserResource {

	@Autowired
	UserRepository repository;
	
	@RequestMapping(method=RequestMethod.GET ,value="users") 
	public List<User> getUsers() {
		return repository.getUsers();
		/* return 5; */
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="users/{userId}") 
	public UserView getUser(@PathVariable("userId")int id) {
		return repository.getUser(id);
		/* return 5; */
	}
	
	
}
