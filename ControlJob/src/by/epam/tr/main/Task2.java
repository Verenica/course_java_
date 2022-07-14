package by.epam.tr.main;

import java.util.Scanner;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Программа запрашивает количество чисел, вводит целые числа в соответствии с
		// заявленным
		// количеством ,определяет, сколько чисел больше 15 или <2, чему равна сумма
		// чисел, которые
		// делятся на 5 с остатком 4. Результат вывести на экран.

		Scanner sc = new Scanner(System.in);
		System.out.println("Input single numbers");
		System.out.print("> ");

		int n = sc.nextInt(); // кол-во элементов в массиве

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		System.out.println("Total numbers > 15 or < 2 = " + countNumbers(mas));
		System.out.println("Sum  = " + countDevision(mas));
	}
	// определяет, сколько чисел больше 15 или <2

	public static int countNumbers(int[] mas) {
		int x = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 15 || mas[i] < 2) {
				x++;
			}
		}
		return x;
	}

	// чему равна сумма чисел, которые делятся на 5 с остатком 4
	public static int countDevision(int[] mas) {
		int x = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 5 == 4) {
				x += mas[i];
			}
		}
		return x;
	}
}
