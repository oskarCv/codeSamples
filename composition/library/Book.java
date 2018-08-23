package com.oskarcv.java.tutorial.composition.library;
/**
 * POJO Sample
 * @author oskarchavez
 *
 */
public class Book {
	public String title;
	public String author;
	public String description;
	
	public Book(){}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
