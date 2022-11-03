package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="loginuserndata")
public class LoginUser {
	

	@Id
	private String userName;
	private String email;
	private String password;
	private String mobile;
	private String address;
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUser(String userName, String email, String password, String mobile, String address) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
	}
	@Override
	public String toString() {
		return "LoginUser [userName=" + userName + ", email=" + email + ", password=" + password + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

