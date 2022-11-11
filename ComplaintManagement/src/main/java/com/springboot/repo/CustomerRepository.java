package com.springboot.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.springboot.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
	
	public Optional<Customer> findByUserName(String userName);
	public boolean existsByUserName(String userName);
	

}
