package com.springboot.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.Dto.CustomerDto;
import com.springboot.conveter.CustomerConverter;
import com.springboot.entity.Customer;
import com.springboot.repo.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	
	// insert user
	public boolean insertUser(CustomerDto customerdto) {
		
	PasswordEncoder delegatingPasswordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	Customer insertDataInMainEntity = CustomerConverter.insertDataInMainEntity(customerdto);

	insertDataInMainEntity.setRole("ROLE_CUSTOMER");
	insertDataInMainEntity.setPassword(delegatingPasswordEncoder.encode(insertDataInMainEntity.getPassword()));

		if(this.customerRepository.existsByUserName(customerdto.getUserName()))
		{
			throw new EntityNotFoundException("Customer not found");
		}
		this.customerRepository.save(insertDataInMainEntity);
		return true;

	}
	
	
	public Customer getCustomerByUsername(String userName)throws EntityNotFoundException
	{
		Optional<Customer> optionalCustometr=this.customerRepository.findByUserName(userName);
		if(optionalCustometr.isPresent()) {
			return optionalCustometr.get();
		}
		else {
			return optionalCustometr.orElseThrow(()->new EntityNotFoundException("Entity with this username not found" + userName));
		}
	}
	
}
