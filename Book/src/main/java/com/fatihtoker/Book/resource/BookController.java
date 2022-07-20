package com.fatihtoker.Book.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatihtoker.Book.model.Book;
import com.fatihtoker.Book.repository.BookRepository;

@RestController
public class BookController {

	
	@Autowired
	private BookRepository repo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repo.save(book);
		return "Added book with id : "+ book.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		return repo.findAll();
	}
	
	public Optional<Book> getBook(int id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repo.deleteById(id);
		return "book deleted with id : "+id;
	}
}
