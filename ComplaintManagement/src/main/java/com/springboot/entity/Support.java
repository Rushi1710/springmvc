package com.springboot.entity;

import javax.persistence.Embeddable;

import org.hibernate.annotations.ColumnDefault;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Embeddable
public class Support {

	private String status="in process";
	private String comments="in process";
	public Support() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Support(String status, String comments) {
		super();
		this.status = status;
		this.comments = comments;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Support [status=" + status + ", comments=" + comments + "]";
	}
	
	

	
}
