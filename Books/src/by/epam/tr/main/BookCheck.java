package by.epam.tr.main;

import java.util.List;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  equals. hashCode, toString(). 

//Создать второй класс, агрегирующий список типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 

//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
//Найти и вывести: 
//a) список книг заданного автора; 
//b) список книг, выпущенных заданным издательством; 
//c) список книг, выпущенных после заданного года.

public class BookCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group();
		group.add(new Book(1, "Sallon", "Oscar De Lorento", "Paris", 2005, 366, 300660, "hardcover"));
		group.add(new Book(2, "Qaz", "Polly Masady", "Moscow", 1993, 305, 105000, "hardcover"));
		group.add(new Book(3, "Must have", "Oscar De Lorento", "Paris", 2010, 366, 100660, "softcover"));
		group.add(new Book(4, "Go on", "Oscar De Lorento", "Atlanta", 1993, 366, 10660, "softcover"));
		group.add(new Book(5, "Show me", "Tilda", "Peter", 1994, 366, 10660, "softcover"));
		
		//использование метода - хотим узнать какие книги заданного автора
		BookLogic logic = new BookLogic();
		
		List<Book> result1 = logic.listTheAuthor(group.getBooks(), "Oscar De Lorento");
		//result1 = logic.listTheAuthor(group); --второй вариант  решения
		
		List<Book> result2 = logic.listThepublishingHouse(group.getBooks(), "Atlanta");
		List<Book> result3 = logic.listTheYearOfPublished(group.getBooks(), 1994);
		
		//вывод списка на экран
		BookView view = new BookView();
		view.printTheAuthors(result1);
		view.printThepublishingHouse(result2);
		view.printTheYearOfPublished(result3);
	}
}