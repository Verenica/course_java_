package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
	// Найти и вывести:
	// a) список книг заданного автора;
	// b) список книг, выпущенных заданным издательством;
	// c) список книг, выпущенных после заданного года.

	// a) список книг заданного автора;
	public List<Book> listTheAuthor(List<Book> bs, String author) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bs) {
			if (b.getAuthor() == author) {
				// если книга заданного автора, тогда
				result.add(b);
			}
		}
		// метод возвращает результат
		return result;
	}

	// b) список книг, выпущенных заданным издательством;
	public List<Book> listThepublishingHouse(List<Book> bs, String publishingHouse) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bs) {
			if (b.getPublishingHouse() == publishingHouse) {
				// если книга заданного автора, тогда
				result.add(b);
			}
		}
		// метод возвращает результат
		return result;
	}

	// c) список книг, выпущенных после заданного года.
	public List<Book> listTheYearOfPublished(List<Book> bs, int theYearOfPublished) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bs) {
			if (b.getTheYearOfPublished() > theYearOfPublished) {
				// если книга заданного автора, тогда
				result.add(b);
			}
		}
		// метод возвращает результат
		return result;
	}
}