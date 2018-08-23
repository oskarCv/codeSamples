package com.oskarcv.java.tutorial.composition.library;

import java.util.List;

public class Library {
	//high dependence to book class
	private final List<Book> books;
	public Library (List<Book> books){
		this.books = books;
	}
	public List<Book> getLibraryBooks(){
		return books;
	}
}
