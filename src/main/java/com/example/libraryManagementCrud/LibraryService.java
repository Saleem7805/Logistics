package com.example.libraryManagementCrud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LibraryService {

	
	@Autowired
	LibraryRepo lr;
	public void addBook(LibraryEntity le)
	{
		lr.save(le);
	}
	
	public void deleteBook(int lid)
	{
		lr.deleteById(lid);
	}
//	public void updateBook(int lid, LibraryEntity updatedBookInfo) {
//        Optional<LibraryEntity> optionalBook = lr.findById(lid);
//        if (optionalBook.isPresent()) {
//            LibraryEntity existingBook = optionalBook.get();
//            existingBook.setAuthor(updatedBookInfo.getAuthor());
//            existingBook.setDateOfIssue(updatedBookInfo.getDateOfIssue());
//            lr.save(existingBook);
//        } else {
//            System.out.println("No update required");
//        }
//		}
	
	public LibraryEntity readBook(int lid) {
        Optional<LibraryEntity> optionalBook = lr.findById(lid);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            
            return null; 
        }
}

	 public List<LibraryEntity> getAllBooks() {
	        return lr.findAll();
	    }
	 
	 
	 
	
	}

