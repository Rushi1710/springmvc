package com.springboot.conveter;

import com.springboot.Dto.ComplaintDto;
import com.springboot.entity.Complaint;

public class ComplaintConveter {

	private ComplaintConveter()
	{
		
	}
	
	public static Complaint insertDataMainEntity (ComplaintDto complaintDto) {
		Complaint complaint = new Complaint();
		
		//complaint.setComplaintId(complaintDto.getComplaintId());
		complaint.setDescription(complaintDto.getDescription());
		complaint.setSupport(complaintDto.getSupport());
		complaint.setCustomer(complaintDto.getCustomer());
		return complaint;
		
	}

}
