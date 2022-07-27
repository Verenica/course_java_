package by.epam.tr.main;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group();
		group.add(new Customer(1, "Ivanova", "Mary", "Petrovna", "Minsk, 220054, Nezavisimisty, 89, 17", 41023333, "BY78PR200300600500"));
		group.add(new Customer(2, "Petrova", "Elena", "Pavlovna", "Grodno, 210333, Barashka, 9", 41035555, "BY99PR200301700999"));
		group.add(new Customer(3, "Pavlova", "Inessa", "Ivanovna", "Grodno, 210333, Mira, 19, 78", 21565555, "BY99PR310301700569"));
		group.add(new Customer(4, "Aleksandrova", "Inna", "Pavlovna", "Brest, 284333, Lenina, 19, 7", 40346699, "BY99PR589301810999"));
		group.add(new Customer(5, "Buhanov", "Petr", "Petrovich", "Minsk, 220058, K.Marksa, 9, 3", 21006669, "BY99PR530302890999"));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter numberCardFrom: ");
        int numberCardFrom = scanner.nextInt();
        System.out.println("Enter numberCardTo: ");
        int numberCardTo = scanner.nextInt();
       
		// список покупателей в алфавитном порядке
		CustomerLogic logic = new CustomerLogic();
		List<String> result = logic.getSurnameCustomers(group.getCustomers());
		List<Customer> result1 = logic.getListCards(group.getCustomers(), numberCardFrom, numberCardTo);

		// вывод на экран
		CustomerView view = new CustomerView();
		view.printSurnames(result);
		view.printCards(result1);

	}

}
