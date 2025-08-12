package com.example.Operations.demoOpration.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Operations.demoOpration.EntityClass.Book;

public interface BookRpository extends JpaRepository<Book,Integer> {
	

}
