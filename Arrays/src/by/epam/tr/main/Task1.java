package by.epam.tr.main;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
		// кратны данному K.

		int n = 10;
		int k = 3;
		int sum = 0;

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < n; i++) {
	        mas[i] = rand.nextInt(10);
	        System.out.println("mas["+i+"]=" + mas[i]);
	      }
		for (int i = 0; i < n; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		System.out.println("Sum = " + sum);
	}
}