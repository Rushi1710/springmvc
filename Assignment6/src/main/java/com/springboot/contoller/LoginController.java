package com.springboot.contoller;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.LoginUser;
import com.springboot.repo.UserRepository;
import com.springboot.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService service;

	@RequestMapping("/")
	public String user() {
		System.out.println("login done");
		return "index";
	}

	@RequestMapping("register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String addingUser(LoginUser user) {
		System.out.println(user);
		LoginUser adduser = service.adduser(user);
		return "redirect:login";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	

	@RequestMapping("/update")
	public String updateuser() {
		return"update";
}
	@PostMapping("/login")
	public String validateUser(LoginUser loginUser, HttpSession session) {
		session.setAttribute("userName", loginUser.getUserName());
		System.out.println(loginUser);
		if (service.validate(loginUser))
			return "redirect:dashbord";
		return "redirect:login?msg=Invelid Credentials";
	}
	
	
	@RequestMapping("dashbord")
	public String dashbord() {
		return "dashbord";
	}
	
	
	@PostMapping("/update")
	public String update(LoginUser loginUser,HttpSession session) {
		String username=(String)session.getAttribute("userName");
	String email=loginUser.getEmail();
	String mobileNo=loginUser.getMobile();
	if(this.service.update(email, mobileNo, username))
		return "redirect:update?msg=successfull";
	return "redirect:update?msg=something went wrong";
	
	}

}
