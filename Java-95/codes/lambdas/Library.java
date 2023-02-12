package co.edureka.lambdas;

import java.util.List;

public class Library {

	public static void main(String[] args) {
		BookService libraryService = new BookService();
		
		List<Book> books = libraryService.getBooksInSortedOrder();
		
		System.out.println(" listing Books in presentation layer");

		for(Book book : books) {
			System.out.println(book);
		}
	}

}
