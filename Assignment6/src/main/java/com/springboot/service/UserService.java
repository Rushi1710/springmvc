package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.LoginUser;
import com.springboot.repo.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//adding data 
	public LoginUser adduser (LoginUser loginUser) {
	 return this.repository.save(loginUser);
	}
	
	//validate data
	public boolean validate (LoginUser loginUser1) {
		System.out.println(loginUser1);
		if(this.repository.existsById(loginUser1.getUserName())) {
			Optional<LoginUser> login = this.repository.findById(loginUser1.getUserName());
			String pass = login.get().getPassword();
			if(pass.equals(loginUser1.getPassword()))
				return true;
			return false;
		}
		return false;
		
	}

	// update data
	public boolean update(String email,String mobileNo,String userName) {
		
		if(this.repository.existsById(userName))
		{
			
		LoginUser user=	this.repository.findById(userName).get();
		user.setEmail(email);
		user.setMobile(mobileNo);
		this.repository.save(user);
		return true;
		}
		return false;
	
	}
	

}
