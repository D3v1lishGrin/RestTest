package de.oliver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import de.oliver.entity.User;

@Service
public interface UserService {
	public List<User> retrieveUsers();
	
	public User getUser(Long userID);
	
	public void saveUser(User user);
	
}
