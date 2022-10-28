package com.spring.jdbc.databases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.entity.Student;

@Repository
public class Studentdatabases {

	@Autowired
	private JdbcTemplate template;

	// insert
	public int insert(Student student) {
		String queryforstudent = "insert into student(id,name) values(?,?)";
		int update = this.template.update(queryforstudent, student.getId(), student.getName());

		String queryforAddress = "insert into Address(city,pincode,id) values(?,?,?)";
		int r = this.template.update(queryforAddress, student.getAddress().getCity(), student.getAddress().getPincode(),
				student.getId());

		return r;

	}

	// update
	public int chang(Student student) {

		String updatevalue = "update  student set name=? where id=? ";
		int update = this.template.update(updatevalue, student.getName(), student.getId());
		return update;
	}

	// delete
	public int delete(Student student1) {
		String query2 = "Delete from address where id=? ";
		int update2 = this.template.update(query2, student1.getId());
		String query1 = "Delete from student where id=?";
		int update1 = this.template.update(query1, student1.getId());
		return update1;
	
	
	}
}
