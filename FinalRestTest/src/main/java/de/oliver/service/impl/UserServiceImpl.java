package de.oliver.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import de.oliver.entity.User;
import de.oliver.repository.UserRepository;
import de.oliver.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<User> retrieveUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public User getUser(Long userID) {
		Optional<User> optUsr = userRepository.findById(userID);		
		return optUsr.get();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void saveUser(User user) {
		userRepository.save(user);	
	}

	

}
