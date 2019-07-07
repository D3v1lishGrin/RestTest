package de.oliver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.oliver.entity.Role;
import de.oliver.entity.User;
import de.oliver.repository.RoleRepository;
import de.oliver.repository.UserRepository;

@Component
public class DatabaseLoader {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	
	
	@Autowired
	public DatabaseLoader(UserRepository userRepository, RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		loadUsers();
		loadRoles();
		
	}
	
	
	private void loadUsers() {
		userRepository.save(new User("User 1", "test123"));	
	}
	
	private void loadRoles() {
		roleRepository.save(new Role(1,"standard"));
		roleRepository.save(new Role(2,"admin"));
	}
	
	
}
