package by.epam.tr.main;

public class PartThreeTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11. Составить программу нахождения разности кубов первых двухсот чисел
		double diff = 1;

		for (double i = 1; i <= 200; i++) {
			diff = Math.pow(i, 3) - diff;
		}

		System.out.println("diff = " + diff);
	}

}
