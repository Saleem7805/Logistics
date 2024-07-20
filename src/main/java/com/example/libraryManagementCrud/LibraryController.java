package com.example.libraryManagementCrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LibraryController {
	
	@Autowired 
	LibraryService ls;
	@Autowired
	LibraryRepo lr;

	@RequestMapping("/addBook") 
	@ResponseBody
	public void addBook(LibraryEntity le)
	{
		ls.addBook(le);
	}
	@RequestMapping("/deleteBook") 
	@ResponseBody
	public void deleteBook(@RequestParam int lid)
	{
		ls.deleteBook(lid);
	}
	 @GetMapping("/readBook/{lid}")
	    @ResponseBody
	    public ResponseEntity<LibraryEntity> readBook(@PathVariable int lid) {
	        LibraryEntity book = ls.readBook(lid);
	        if (book != null) {
	            return new ResponseEntity<>(book, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	 @GetMapping("/readAllBooks")
	    @ResponseBody
	    public ResponseEntity<List<LibraryEntity>> readAllBooks() {
	        List<LibraryEntity> books = ls.getAllBooks();
	        if (!books.isEmpty()) {
	            return new ResponseEntity<>(books, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

//	    @PutMapping("/updateBook/{lid}")
//	    @ResponseBody
//	    public ResponseEntity<String> updateBook(@PathVariable int lid, @RequestBody LibraryEntity updatedBookInfo) {
//	        ls.updateBook(lid, updatedBookInfo);
//	        return new ResponseEntity<>("Book updated successfully", HttpStatus.OK);
//	    }
	 
	 @RequestMapping("/updateBook") 
		@ResponseBody
	 public void update(@RequestParam  Integer lid,@RequestParam String newAuthor)   
	 {  
	 lr.updateTheAuthor(lid, newAuthor)  ;
	 }  
	


}
