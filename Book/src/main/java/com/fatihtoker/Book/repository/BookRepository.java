package com.fatihtoker.Book.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RestController;

import com.fatihtoker.Book.model.Book;


public interface BookRepository extends MongoRepository<Book, Integer>{
	
	
}
