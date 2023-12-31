package com.nms.bo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_bo")
public class UsersBo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String roles;

	public UsersBo() {
	}

	public UsersBo(Integer id, String username, String password, String roles) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	
	

	public UsersBo(String username, String password, String roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
//	{
//		"username":"mahesh",
//		"password":"mahesh123",
//		"roles":"admin"
//		}

}
