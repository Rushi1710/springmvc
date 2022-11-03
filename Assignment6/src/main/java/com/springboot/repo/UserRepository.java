package com.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.LoginUser;

public interface UserRepository  extends CrudRepository<LoginUser, String>{

}
