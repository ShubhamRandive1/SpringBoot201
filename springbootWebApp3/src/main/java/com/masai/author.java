package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class author {
	
	@GetMapping("/bookservice/books/author")
	public List<Book> getAllBooks(){
		
			
			List<Book> aa = new ArrayList<>();
			
					
			Book b = new Book(101, "C++", "Nitesh", "Rajput Publication", "Computer Programming", 1500, 240, "G452");
			Book b1 =new Book(102, "python", "Rajesh", "Rajesh Publication", "Computer Programming", 1400, 250, "B780");
					
				
			aa.add(b1);
			aa.add(b);
			
			return aa;
		}
	
	
	
		
		
		
	
	
	

}
