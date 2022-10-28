
package com.speringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.speringmvc.database.LoginDataBase;
import com.speringmvc.entity.LoginUser;
@Controller
public class HomeController {
	
	@Autowired
	private LoginDataBase loginDataBase;
	
	public HomeController() {
		System.out.println("home Controller started");
	}
	
	
	
	@RequestMapping("register")
	public String registeruser() {
		System.out.println("register done");
		return "register";		
	}
	
	
	@RequestMapping("/")
	public String user() {
		System.out.println("login done");
		return"index";
	}
	
	
	
	@PostMapping("/register")
	public String insertUser(LoginUser user){
		System.out.println("insert post");
		System.out.println(user);
		if(user.getUsername()!=null && user.getEmail()!=null&&user.getPassword()!=null)
		{
			loginDataBase.insetuser(user);
		return null;
		}
		return "register";
	}
	
	@RequestMapping("/login")
	public String loginuser() {
		System.out.println("login done");
		return "login";
		
	}
	@PostMapping("/login")
	public String validateuser(LoginUser user1) {
		System.out.println("validate done");
		System.out.println(user1);
		
		
		
		if(loginDataBase.validateUser(user1))
			return"dashbord";
		return "redirect:login?errormsg= Invalid User";
				
		
		
	}
	
	

	
	
}
