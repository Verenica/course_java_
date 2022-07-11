package by.epam.tr.main;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		// порядковые номера которых являются
		// простыми числами.

		int n = 20;
		double sum = 0;
		boolean flag = false;
		double mas[] = new double[n];
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextDouble() * 10;
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		for (int i = 2; i < n; i++) {
			flag = false; 
			if (i > 3) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				continue;
			}
			System.out.println("Simple nums: " + i);
			sum += mas[i];
		}
		System.out.println();
		System.out.println("SUM: " + sum);
	}
}