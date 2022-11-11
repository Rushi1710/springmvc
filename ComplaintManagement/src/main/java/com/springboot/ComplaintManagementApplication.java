package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.entity.Customer;
import com.springboot.repo.CustomerRepository;

@SpringBootApplication
public class ComplaintManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplaintManagementApplication.class, args);
	}
	@Autowired
	private CustomerRepository customerRepository;
	
//	@Bean
	public void initailzie() {
	 
	PasswordEncoder delegatingPassword = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	Customer customer = new Customer(1,"shubham","shubham12","2345678912","shubham@123",delegatingPassword.encode("123") ,"kalamboli",null, "ROLE_ADMIN");
	this.customerRepository.save(customer);
	}
	
}
