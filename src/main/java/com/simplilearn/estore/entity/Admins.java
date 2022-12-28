package com.simplilearn.estore.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admins {
	//add fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adminid")
	private int adminId;
	private String email;
	private String password;
	@Column(name = "fullname")
	private String fullName;
	@Column(name = "logintype")
	private int loginType;
	@Column(name = "addedon")
	private LocalDate addedOn;
	
	
	//default constructor
	public Admins() {
		super();
	}

	
	//parameterized constructor
	public Admins(int adminId, String email, String password, String fullName, int loginType, LocalDate addedOn) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.loginType = loginType;
		this.addedOn = addedOn;
	}

	
	//getter and setter methods
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getLoginType() {
		return loginType;
	}

	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}

	public LocalDate getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(LocalDate addedOn) {
		this.addedOn = addedOn;
	}


	//override to-string method
	@Override
	public String toString() {
		return "Admins [adminId=" + adminId + ", email=" + email + ", password=" + password + ", fullName=" + fullName
				+ ", loginType=" + loginType + ", addedOn=" + addedOn + "]";
	}
}
