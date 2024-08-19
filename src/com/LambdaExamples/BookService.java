package com.LambdaExamples;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class BookService {

	public List<Book> getBooksInSorted(){
		List<Book> book = new BookDOA().getBooks();
		//By creating an anonymous class
//		Collections.sort(book, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book arg0, Book arg1) {
//				// TODO Auto-generated method stub
//				return arg1.getName().compareTo(arg0.getName());
//			}
//			
//		});
		
		//Using Lambda Expression
		Collections.sort(book, (arg0, arg1) -> arg1.getName().compareTo(arg0.getName()));
		return book;
	}
	
	public static void main(String[] args) {
		System.out.print(new BookService().getBooksInSorted());;
	}
	
}

//By Creating My own Comparator class
//class MyComparator implements Comparator<Book>{
//
//	@Override
//	public int compare(Book arg0, Book arg1) {
//		// TODO Auto-generated method stub
//		return arg1.getName().compareTo(arg0.getName());
//	}
//	
//	
//}