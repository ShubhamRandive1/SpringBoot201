package com.masai;

public class Book {
	
	private Integer Book_id;
	
	private String name;
	
	private String author;
	
	private Integer price;
	
	

	public Book() {
		super();
	}

	public Book(Integer book_id, String name, String author, Integer price) {
		super();
		Book_id = book_id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Integer getBook_id() {
		return Book_id;
	}

	public void setBook_id(Integer book_id) {
		Book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
