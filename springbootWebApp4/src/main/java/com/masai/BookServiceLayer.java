package com.masai;

import java.util.ArrayList;
import java.util.List;

public class BookServiceLayer {
	
	public static List<Book> books = new ArrayList<>();
	
	public static List<Book> getAllBooks(){
		
		books.add(new Book(101, "Fallen", "Lauren Kate", 1400));
		books.add(new Book(102, "Orient Express", "Augata Christi", 1500));
		books.add(new Book(103, "And Then There Were none", "Augata Christi", 1500));
		books.add(new Book(104, "A Song Of Ice And Fire", "George R R Martin", 2500));
		books.add(new Book(105, "Angels And Demons", "Dan Brown", 2700));
		
		
		return books;
		
	}
	
	public List<Book> getBooks(){
		
		return getAllBooks();
	}
	
	public Book getBookById(Integer book_id) {
		
		Book books = null;
		
		for(Book bb : getAllBooks()) {
			
			if(bb.getBook_id().equals(book_id)) {
				
				books = bb;
				
			}
		}
		
		if(books == null) {
			
			throw new BookNotFoundException("Book not available with id "+book_id);
		}else {
			
			return books;
		}
	}
	
	
	public String addBook(Book books) {
		
		String str = "";
		
		if(books != null) {
			
			getAllBooks().add(books);
			
			str = "book has been added successfully";
			
		}else {
			
			throw new NullValueErrorException("Value of the book is null");
		}
		
		return str;
		
	}
	
	public String deleteBook(Integer book_id) {
		
		String str ="Cannot Delete Book";
		
		Book newBook = null;
		
		for(Book bb : getAllBooks()) {
			
			
			if(bb.getBook_id().equals(book_id)) {
				
				newBook = bb;
				
			}
		}
		
		if(newBook == null) {
			
			throw new BookNotFoundException("Book Not deleted with id "+book_id);
		}else {
			
			getAllBooks().remove(newBook);
			
			str = "Book Has Been Deleted with id "+book_id;
		}
		
		return str;
	}
	

}
