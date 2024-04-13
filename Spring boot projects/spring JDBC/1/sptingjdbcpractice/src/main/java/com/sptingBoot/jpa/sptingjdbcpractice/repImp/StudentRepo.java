package com.sptingBoot.jpa.sptingjdbcpractice.repImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
	
	@Autowired
	JdbcTemplate JdbcTemplate;
	
	String insert="""
			
			insert into Student(id,name,marks) values (1,'r',100)""";
	
	public void ins() {
		JdbcTemplate.update(insert);
	}
	

}
