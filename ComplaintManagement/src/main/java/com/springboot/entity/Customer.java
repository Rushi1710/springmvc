package com.springboot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	@Column(nullable=false,length=30)
	private String customerName;
	@Column(nullable=false,unique=true)
	private String userName;
	@Column(nullable=false,unique=true)
	private String mobile;
	@Column(nullable=false,unique=true)
	private String email;
	@Column(nullable=false,unique=false)
	private String password;
	@Column(nullable=false,length=50)
	private String address;
	
	@OneToMany(mappedBy = "customer")
	private List<Complaint> complaint ;
	
	private String role;

	public Customer() {
		super();

	}

	public Customer(int customerid, String customerName, String userName, String mobile, String email, String password,
			String address, List<Complaint> complaint, String role) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.userName = userName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.address = address;
		this.complaint = complaint;
		this.role = role;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", userName=" + userName
				+ ", mobile=" + mobile + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", complaint=" + complaint + ", role=" + role + "]";
	}

	
	
}
