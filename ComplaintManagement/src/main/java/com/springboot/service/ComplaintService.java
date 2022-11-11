package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dto.ComplaintDto;
import com.springboot.conveter.ComplaintConveter;
import com.springboot.conveter.CustomerConverter;
import com.springboot.entity.Complaint;
import com.springboot.entity.Customer;
import com.springboot.entity.Support;
import com.springboot.repo.ComplaintRepository;
import com.springboot.repo.CustomerRepository;
@Service
public class ComplaintService {
	@Autowired
  private ComplaintRepository complaintRepository; 
	
	public boolean registerComplaint(ComplaintDto complaintDto) {
		
		Complaint insertDataMainEntity = ComplaintConveter.insertDataMainEntity(complaintDto);
		
		Support support=new Support();
		support.setStatus("in process");
		support.setComments("in process");
		
		insertDataMainEntity.setSupport(support);
		this.complaintRepository.save(insertDataMainEntity);
		return true ;
		
	}
	

	

}
