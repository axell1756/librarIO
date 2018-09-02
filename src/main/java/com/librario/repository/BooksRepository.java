package com.librario.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.librario.entity.Book;

@SuppressWarnings("serial")
@Repository
public class BooksRepository{

	private static Map<Integer, Book> books;

	static {
		books = new HashMap<Integer, Book>() {
			{
				put(1, new Book(1, "Book No.1", 1234567890));
				put(2, new Book(2, "Book No.2", 1234457890));
				put(3, new Book(3, "Book No.3", 1232377890));
			}
		};
	}
	
	public Collection<Book> getAllBooks(){
		return this.books.values();
	}

}
