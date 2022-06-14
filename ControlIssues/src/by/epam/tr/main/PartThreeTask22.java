package by.epam.tr.main;

public class PartThreeTask22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
		// шагом h. Результат
		// представить в виде таблицы, первый столбец которой – значения аргумента,
		// второй - соответствующие
		// значения функции

		double a = 0.0;
		double b = 9;
		double h = 0.1;
		double y = 0.0;

		System.out.println(" ---------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println(" ---------------------------");

		for (double i = a; i <= b; i += h) {

			y = Math.sin(i) * Math.sin(i);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", i, y);

		}

		System.out.println(" ---------------------------");
	}

}