package by.epam.tr.main;

import java.util.List;

public class CustomerView {
	public static void printSurnames(List<String> cs) {
		for (String s : cs) {
			System.out.println("Surname: " + s);
		}
}

	public static void printCards(List<Customer> cs) {
		for (Customer c : cs) {
			System.out.println("numderCards: " + c.getNumberCard());
		}
	}
}