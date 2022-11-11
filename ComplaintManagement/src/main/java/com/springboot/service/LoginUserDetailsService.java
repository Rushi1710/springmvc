package com.springboot.service;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.entity.Customer;
import com.springboot.repo.CustomerRepository;

@Service
public class LoginUserDetailsService implements UserDetailsService {
	@Autowired
	private CustomerRepository customerRepository;

	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Optional<Customer> optional = this.customerRepository.findByUserName(username);
		return optional.map(user->new User(user.getUserName(),user.getPassword(),
				Arrays.stream(user.getRole().split(",")).map(SimpleGrantedAuthority:: new).collect(Collectors.toList()))).
				get();
	
	}
}
