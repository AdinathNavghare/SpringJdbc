package com.app.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.app.model.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String qry = "insert into student(id,name,city) values(?,?,?)";
		/*
		 * student.getId(); student.getName(); student.getCity();
		 */
		int result = this.jdbcTemplate.update(qry, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int updateData(Student student) {
		String query="update student set name=?,city=? where id=?";
		int set=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return set;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
