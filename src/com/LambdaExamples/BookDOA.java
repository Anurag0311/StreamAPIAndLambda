package com.LambdaExamples;

import java.util.*;

public class BookDOA {
	
	public List<Book> getBooks(){
		List<Book> book = new ArrayList<>();
		book.add(new Book(101,"Core JAVA", 400));
		book.add(new Book(336,"Hibernate", 180));
		book.add(new Book(275,"Spring", 200));
		book.add(new Book(893,"WebService", 300));
		return book;
	}
	
}
