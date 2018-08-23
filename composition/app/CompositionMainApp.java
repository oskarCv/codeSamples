package com.oskarcv.java.tutorial.composition.app;
import java.util.ArrayList;
import java.util.List;

import com.oskarcv.java.tutorial.composition.library.*;
public class CompositionMainApp {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.setTitle("EffectiveJ Java");
		b1.setAuthor("Joshua Bloch");
		b1.setDescription("programmer reference book");
        
        b2.setTitle("Java 9 Developer");
        b2.setAuthor("Deitel");
        b2.setDescription("programmer reference book");
        
        b3.setTitle("Java: The Complete Reference");
        b3.setAuthor("Herbert Schildt");
        b3.setDescription("Reference manual");
         
        // creating and adding the library book list 
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        
        //setting the book list into the library 
        Library library = new Library(books);
         
        //retrieving the book list from the library
        List<Book> bks = library.getLibraryBooks();
        
        //iterating over the book list
        for(Book bk : bks){             
            System.out.println(
            		"Title : " + bk.title + "\n >>>>> "+" Author : " + bk.author +
            		"\n >>>>>  Description: "+ bk.description);
        }

	}

}
