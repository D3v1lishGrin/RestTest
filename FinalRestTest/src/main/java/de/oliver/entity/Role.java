package de.oliver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TM_ROLE")
public class Role {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
	private List<UserRole> users;
	
	public Role() {
		
	}
	
	public Role(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserRole> getUsers() {
		return users;
	}

	public void setUsers(List<UserRole> users) {
		this.users = users;
	}

}
