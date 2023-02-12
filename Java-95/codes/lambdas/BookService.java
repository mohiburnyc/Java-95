package co.edureka.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Book> getBooksInSortedOrder(){
		List<Book> books = BookDAO.getBooks();
		
		System.out.println("------ Before Sorting in Service Layer ------");
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		
		//Collections.sort(books, new BooksComparator());
		/* 
		//--- traditional approach using anonymous classes 
		Collections.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return (o1.getBookId() > o2.getBookId())? 1 :-1;
			}
		});
		*/
		
		//--- approach using lambda expression
		Collections.sort(books, (o1, o2) -> (o1.getBookId() > o2.getBookId())? 1 :-1);
		
		return books;
	}
}

class BooksComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return (o1.getBookId() > o2.getBookId())? 1 :-1;
	}
	
}