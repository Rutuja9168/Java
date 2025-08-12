package com.example.Operations.demoOpration.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Operations.demoOpration.EntityClass.Book;
import com.example.Operations.demoOpration.service.Operation;


@RestController
public class ApiController {

	@Autowired
	Operation op;

	@RequestMapping(method = RequestMethod.GET, value = "/api/books/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {

		return op.getData(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/books")
	public List<Book> getBook() {

		return op.findAll();
	}

	
	@RequestMapping(method=RequestMethod.POST ,value="/api/books")
	public Book savetBook(@RequestBody Book book) {
	
		return  op.saveData(book);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT ,value="/api/books/{id}")
	public int udatetBook(@RequestBody Book book) {
	
		return  op.updateData(book);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE ,value="/api/books/{id}")
	public String deletetBook(@PathVariable int id) {
	
		return  op.deleteData(id);
	}
	
}
