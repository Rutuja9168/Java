package com.example.Operations.demoOpration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Operations.demoOpration.EntityClass.Book;
import com.example.Operations.demoOpration.Repo.BookRpository;

@Service
public class Operation {
	@Autowired
	BookRpository repo;
	
	
	public Optional<Book> getData(int id) {
		return repo.findById(id);
	}


	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public Book saveData(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}


	public int updateData(Book book) {
		// TODO Auto-generated method stub
		
		repo.deleteById(book.getId());
		repo.save(book);
		
		return book.getId();
	}


	public String deleteData(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
		return  " Book Deleted";
	}

}
