package com.librario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librario.entity.Book;
import com.librario.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	private BooksRepository rBooks;
	
	public Collection<Book> getAllBooks(){
		return rBooks.getAllBooks();
	}
	
}
