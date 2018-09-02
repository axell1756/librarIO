package com.librario.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librario.entity.Book;
import com.librario.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksService sBooks;
	
	@GetMapping("")
	public Collection<Book> getAllBooks(){
		
		return sBooks.getAllBooks();
		
	}
	
}
