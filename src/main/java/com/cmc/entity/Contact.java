package com.cmc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="major")
	private String major;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="graduate")
	private String graduate;

	public Contact() {
	}

	public Contact(String name, String phone, String major, String address, String email, String graduate) {
		super();
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.address = address;
		this.email = email;
		this.graduate = graduate;
	}

	public Contact(int id, String name, String phone, String major, String address, String email, String graduate) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.address = address;
		this.email = email;
		this.graduate = graduate;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGraduate() {
		return graduate;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", major=" + major + ", address=" + address
				+ ", email=" + email + ", graduate=" + graduate + "]";
	}

	
	
}
