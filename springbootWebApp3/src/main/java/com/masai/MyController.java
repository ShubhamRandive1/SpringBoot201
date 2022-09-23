package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/bookservice/books")
	public List<Book> getAllbooksList(){
		
		List<Book> aa = new ArrayList<>();
		
				
			Book b = new Book(101, "C++", "Nitesh", "Rajput Publication", "Computer Programming", 1500, 240, "G452");
			Book b1 =new Book(102, "python", "Rajesh", "Rajesh Publication", "Computer Programming", 1400, 250, "B780");
				
			
		aa.add(b1);
		aa.add(b);
		
		return aa;
	}
	
	
	@GetMapping("/bookservice/books/{BookId}")
	public Book getBookById(@PathVariable("BookId") Integer BookId) {
		
		if(BookId < 100) {
			
			throw new BookNotFoundException("no book available");
		}
		
		Book bookByid = new Book(BookId, "Java", "Steve Jobs", "Microsoft Publications", "Computer Programming", 1450, 280, "D690");
		
		return bookByid;
	}
	
	@PostMapping("/bookservice/books")
	public String createNewBook(@RequestBody Book addBook) {
		
		return addBook+"Book is added";
		
		
	}
	
	@DeleteMapping("/bookservice/books/{bookId}")
	public String deleteBook(@RequestBody Book bookId, @PathVariable("BookId") Integer bookid) {
		
		return bookid+"Book deleted";
		
	}
	
	@PutMapping("/bookservice/books/{BookId}")
	public Book updateBook(@PathVariable("BookId")Integer BookId, @RequestBody Book book) {
		
		book = new Book(BookId, "JavaScript", "Ram", "Ram Publication", "Computer programming", 1600, 490, "K086");
		
		
		return book;
		 
	}

}
