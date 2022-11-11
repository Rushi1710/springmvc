package com.springboot.contoller;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.Dto.ComplaintDto;
import com.springboot.entity.Customer;
import com.springboot.service.ComplaintService;
import com.springboot.service.CustomerService;

@Controller
public class ComplaintController {
	
	@Autowired
	private ComplaintService complaintService;
	
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/complaint")
	public String complaint() {
		return "complaint";
		
	}
	
	@PostMapping("/complaint")
	public String addComplaint(ComplaintDto complaintDto,Principal p) {
	System.out.println("Username from principal " +p.getName());
	
	Customer customer=this.customerService.getCustomerByUsername(p.getName());
        complaintDto.setCustomer(customer);
		this.complaintService.registerComplaint(complaintDto);
		return "redirect:status";
	}
}
