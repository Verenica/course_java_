package by.epam.tr.main;

public class PartOneTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1, a2;
		int b1, b2;
		int c1, c2;

		int S1, S2;

		a1 = 2;
		b1 = 3;
		c1 = 2;

		S1 = a1 * b1 * c1;
		
		a2 = 4;
		b2 = 4;
		c2 = 6;
		
		S2 = a2 * b2 * c2;
		
		if (S1 > S2) {
			System.out.println("Площадь первого треугольника = " + S1);
		} else {
			System.out.println("Площадь второго треугольника =" + S2);
		// Составить программу, которая определит площадь какого треугольника больше

	}
}
}