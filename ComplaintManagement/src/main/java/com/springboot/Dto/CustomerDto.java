package com.springboot.Dto;

public class CustomerDto {
	
	private int customerid;
	private String customerName;
	private String userName;
	private String mobile;
	private String email;
	private String password;
	private String address;
	
	
	
	public CustomerDto() {
		super();
		
	}
	public CustomerDto(int customerid, String customerName, String userName, String mobile, String email,
			String password, String address) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.userName = userName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.address = address;
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
	@Override
	public String toString() {
		return "CustomerDto [customerid=" + customerid + ", customerName=" + customerName + ", userName=" + userName
				+ ", mobile=" + mobile + ", email=" + email + ", password=" + password + ", address=" + address + "]";
	}

	
}
