package com.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Complaint;

public interface ComplaintRepository extends CrudRepository<Complaint, Integer>{

}
