package by.epam.tr.main;

public class PartTwoTask19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
		// его высоту, радиусы вписанной
		// и описанной окружностей.

		double a = 8;

		double h = (a * Math.sqrt(a)) / 2;

		double S = (a * a * Math.sqrt(3)) / 4;

		double RIn = a * Math.sqrt(3) / 6;
		
		double ROut = a * Math.sqrt(3) / 3;

		System.out.println("h = " + h);
		System.out.println("S = " + S);
		System.out.println("RIn = " + RIn);
		System.out.println("ROut = " + ROut);


	}

}
