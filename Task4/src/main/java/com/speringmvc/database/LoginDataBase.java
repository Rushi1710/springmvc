package com.speringmvc.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.speringmvc.entity.LoginUser;

@Repository
public class LoginDataBase {

	@Autowired
	private JdbcTemplate template;

	public boolean validateUser(LoginUser user) {

		String sql = "select password from loginuser where email=?";
		String password = template.queryForObject(sql, String.class, user.getEmail());
		if (password != null && password.equals(user.getPassword())) 
			return true;
		
		return false;
	}

	public boolean insetuser(LoginUser loginUser) {
		try {
			String sql = "INSERT INTO loginuser VALUES(?,?,?)";
			int a = template.update(sql, loginUser.getEmail(), loginUser.getUsername(), loginUser.getPassword());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
