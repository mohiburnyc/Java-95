package co.edureka.lambdas;

import java.util.Arrays;
import java.util.List;

public class BookDAO {
	static public List<Book> getBooks(){
		List<Book> books = Arrays.asList(
					new Book(234, "Java Complete Reference", 525.5f),
					new Book(512, "Spring Made Easy", 650f),
					new Book(387, "Spring Boot Ultimate", 725f),
					new Book(128, "Microservices Reference", 325.5f)
				);
		
		return books;
	}
}
