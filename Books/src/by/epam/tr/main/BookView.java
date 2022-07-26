package by.epam.tr.main;

import java.util.List;

public class BookView {
	public static void printTheAuthors(List<Book> bs) {
		for (Book b : bs) {
			System.out.println("Booksoftheauthor: " + b.getName());
		}
	}

	public static void printThepublishingHouse(List<Book> bs) {
		for (Book b : bs) {
			System.out.println("BooksofpublishingHouse: " + b.getName());
		}
	}

	public static void printTheYearOfPublished(List<Book> bs) {
		for (Book b : bs) {
			System.out.println("BookstheYearOfPublished: " + b.getName());
		}
	}

}
