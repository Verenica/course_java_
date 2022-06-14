package by.epam.tr.main;

public class PartTwoTask25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
		// коэффициентами a, b и с (предполагается,
		// что а≠0 и что дискриминант уравнения неотрицателен).

		double a = 3;
		double b = 7;
		double c = -4;

		double d = b * b - 4 * a * c;
		double x1 = (-b + Math.sqrt(d)) / (2 * a);
		double x2 = (-b - Math.sqrt(d)) / (2 * a);

		System.out.println(a + " x2 + " + b + " x + " + c + " = 0");
		System.out.println("x1 = " + x1 + ", x2 = " + x2);
	}

}
