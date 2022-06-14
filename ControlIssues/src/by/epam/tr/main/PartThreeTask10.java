package by.epam.tr.main;

public class PartThreeTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10. Составить программу нахождения произведения квадратов первых двухсот
		// чисел.
		long multiplication = 1;

		for (long i = 1; i <= 200; i++) {
			multiplication = i * i * multiplication;
		}

		System.out.println("Multiplication = " + multiplication);

	}
}