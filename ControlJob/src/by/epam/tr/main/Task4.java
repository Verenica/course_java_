package by.epam.tr.main;

import java.util.Scanner;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Задан целочисленный массив размерности N. Есть ли среди элементов массива
		// простые числа?
		// Если да, то вывести номера этих элементов.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size mas->");
		int n = sc.nextInt();
		
		int mas[] = new int[n];
		boolean flag = false;
		
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(10);
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		
		for (int i = 0; i < n; i++) {
			flag = isSimple(mas[i]);
			if (flag) {
				continue;
			}
			System.out.println("Simple nums index: " + i);
		}
			System.out.println();
	}

	// Есть ли среди элементов массива простые числа?
	public static boolean isSimple(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return true;
			}
		}
		return false;
	}
}
