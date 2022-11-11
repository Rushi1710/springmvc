package com.springboot.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.Dto.CustomerDto;
import com.springboot.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String index() {
		System.out.println("login done");
		return "index";
	}

	@RequestMapping("register")
	public String register() {
		return "register";
	}

	@PostMapping("register")
	public String registerCustomer(CustomerDto customerDto) {
		customerService.insertUser(customerDto);
		return "login";
	}

	@RequestMapping("loginuser")
	public String login() {	
		return "login";
	}


	@GetMapping("dashboard")
	public String dashbord() {
		return "dashboard";
	}
	

}
