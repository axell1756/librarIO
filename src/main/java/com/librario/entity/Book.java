package com.librario.entity;

public class Book {

	private int id;
	private String title;
	private int isbn;

	public Book(int id, String title, int isbn) {

		this.setId(id);
		this.setTitle(title);
		this.setIsbn(isbn);

	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
