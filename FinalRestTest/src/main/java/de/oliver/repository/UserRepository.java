package de.oliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.oliver.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
