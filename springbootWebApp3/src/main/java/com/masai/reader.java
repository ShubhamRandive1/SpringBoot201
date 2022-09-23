package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reader {
	
	
	@GetMapping("/bookservice/books/reader")
	public List<Book> getAllBooks(){
		
			
			List<Book> aa = new ArrayList<>();
			
					
			Book b = new Book(101, "C++", "Nitesh", "", "Computer Programming", 1500, 240, "");
			Book b1 =new Book(102, "python", "Rajesh", "", "Computer Programming", 1400, 250, "");
					
				
			aa.add(b1);
			aa.add(b);
			
			return aa;
		}

}
