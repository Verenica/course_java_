package by.epam.tr.main;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
		//представить в виде таблицы, первый столбец которой – значения аргумента, второй -
		//соответствующие значения функции.
		//F(x) = tg(x)
		
		double a = 5;
		double b = 7;
		double h = 1;
		
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for (double x = a; x <= b; x = x + h) {
			result(a);
			
		}
		System.out.println("---------------------------------");
		
	}
	
	public static void result(double a) {
		//a = Math.tan(a);
		
		//System.out.println("a = " + a + "tg = " + Math.tan(a)) ;
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", a, Math.tan(a));
		
	}
}
