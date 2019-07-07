package de.oliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.oliver.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
