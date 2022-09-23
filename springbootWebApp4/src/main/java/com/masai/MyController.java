package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	public BookServiceLayer books;
	
	@GetMapping("/books")
	public List<Book> getAllTheBooks(){
		
		return books.getAllBooks();
	}
	
	@GetMapping("/books/{Book_id}")
	public Book getBookId(@PathVariable Integer Book_id) {
		
		return books.getBookById(Book_id);
	}
	
	@PostMapping("/books")
	public String saveBook(@RequestBody Book book) {
		
		return books.addBook(book);
		
	}
	
	@DeleteMapping("/books/{Book_id}")
	public String DeleteBookById(@PathVariable Integer Book_id) {
		
		return books.deleteBook(Book_id);
		
		
	}

}
