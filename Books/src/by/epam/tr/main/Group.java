package by.epam.tr.main;

import java.util.List;
import java.util.ArrayList;

public class Group {
	
	private List<Book> books;
	
	public Group() {
		books = new ArrayList<Book>();
	}

	public void add(Book b) {
		books.add(b);
	}
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
