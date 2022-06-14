package by.epam.tr.main;

public class OnePartTask18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 18. Подсчитать количество отрицательных среди чисел а, b, с.

		int a = 5;
		int b = -6;
		int c = 3;

		int x = 0;

		if (a < 0) {
			x++;
		}
		;
		if (b < 0) {
			x++;
		}
		;

		if (c < 0) {
			x++;
		}
		;
		System.out.println("Total = " + x);
	}

}
