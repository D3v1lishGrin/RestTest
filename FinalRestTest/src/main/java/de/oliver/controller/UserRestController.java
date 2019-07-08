package de.oliver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import de.oliver.entity.User;
import de.oliver.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@CrossOrigin
	@GetMapping("/api/users")
		public List<User> getUsers() {
		List<User> users = userService.retrieveUsers();
		return users;
	}
	@CrossOrigin
	@GetMapping("/api/users/{userId}")
		public User getUser(@PathVariable(name ="userId")Long userId) {
			return userService.getUser(userId);
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/api/user")
	 public void saveEmployee(User user){
	  userService.saveUser(user);
	  System.out.println("User Saved Successfully");
	 }
	
}
