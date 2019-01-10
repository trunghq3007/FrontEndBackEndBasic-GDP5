package com.cmc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_name")
	private String usernName;
	
	@Column(name = "password")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsernName() {
		return usernName;
	}
	public void setUsernName(String usernName) {
		this.usernName = usernName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}
	public User(String usernName, String password) {
		super();
		this.usernName = usernName;
		this.password = password;
	}
	public User(int id, String usernName, String password) {
		super();
		this.id = id;
		this.usernName = usernName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", usernName=" + usernName + ", password=" + password + "]";
	}
	

	
}
