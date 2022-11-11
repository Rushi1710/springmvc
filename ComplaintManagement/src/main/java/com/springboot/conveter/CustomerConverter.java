package com.springboot.conveter;

import com.springboot.Dto.CustomerDto;
import com.springboot.entity.Customer;

public class CustomerConverter {
	private CustomerConverter() {
		
	}

	
	public static Customer insertDataInMainEntity(CustomerDto customerdto) {
		Customer customer = new Customer();
		customer.setCustomerName(customerdto.getCustomerName());
		customer.setUserName(customerdto.getUserName());
		customer.setMobile(customerdto.getMobile());
		customer.setEmail(customerdto.getEmail());
		customer.setPassword(customerdto.getPassword());
		customer.setAddress(customerdto.getAddress());
		return customer;
	}
}
