package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Complaint {	

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int complaintId;
	@Column(length = 100)
	private String description;
	
	private Support support;
	
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;

	
	public Complaint() {
	}

	public Complaint(int complaintId, String description, Support support, Customer customer) {
		super();
		this.complaintId = complaintId;
		this.description = description;
		this.support = support;
		this.customer = customer;
	}

	public int getComplaintId() {
		return complaintId;
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
		return "Complaint [complaintId=" + complaintId + ", description=" + description + ", support=" + support
				+ ", customer=" + customer + "]";
	}
	
	
	
}
