package com.yrgo.isbntools;

public class Book {
	private String isbn;
	private String title;
	private String author;
	
	public Book(String isb, String title, String author) {
		this.isbn= isb;
		this.title= title;
		this.author= author;
	}
	
	public String isbn() {
		return isbn;
	}
	
	public String title() {
		return title;
	}
	
	public String author() {
		return author;
	}
	
	public String toString() {
		return title + " " + isbn;
	}
	
}
