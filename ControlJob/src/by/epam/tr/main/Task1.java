package by.epam.tr.main;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 5.7;
		double y = 7.0;

		double sum;

		sum = method(x, y);

		System.out.println("sum = " + sum);
	}

	public static double method(double x, double y) {
		double sum;

		sum = (1 + Math.sqrt(Math.sin(x + y))) / (2 + Math.abs(x - ((2 * x) / (1 + Math.sqrt(x) * Math.sqrt(y))))) + x;

		return sum;
	}

}
