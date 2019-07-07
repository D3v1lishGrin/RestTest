package de.oliver.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userrole")
public class UserRole implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	public UserRole() {
		
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
