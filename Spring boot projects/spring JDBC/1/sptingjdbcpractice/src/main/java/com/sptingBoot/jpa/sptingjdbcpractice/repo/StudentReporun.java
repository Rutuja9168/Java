package com.sptingBoot.jpa.sptingjdbcpractice.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sptingBoot.jpa.sptingjdbcpractice.repImp.StudentRepo;
@Component 
public class StudentReporun implements CommandLineRunner {
 @Autowired
 StudentRepo studentrepo;
 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		studentrepo.ins();
		
	}

}
