package com.springboot.Dto;

import com.springboot.entity.Customer;
import com.springboot.entity.Support;

public class ComplaintDto {
	
	private int complaintId;	
	private String description;
	private Support support;
	private Customer customer;
	
	public ComplaintDto() {
		super();
	}
	public ComplaintDto(int complaintId, String description, Support support, Customer customer) {
		super();
		this.complaintId = complaintId;
		this.description = description;
		this.support = support;
		this.customer = customer;
	}
	
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "ComplaintDto [complaintId=" + complaintId + ", description=" + description + ", support=" + support
				+ ", customer=" + customer + "]";
	}
	public int getComplaintId() {
		return complaintId;
	}
	

}
