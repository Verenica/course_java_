package by.epam.tr.main;

import java.util.Scanner;
import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые
		// можно
		// выкинуть из данной последовательности, так чтобы осталась возрастающая
		// подпоследовательность.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size mas->");
		int n = sc.nextInt();

		int mas[] = new int[n];
		// mas1[] = new int[n];
		int c = 0;
		Random rand = new Random();

		System.out.println("Initial data:");
		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
			//System.out.println("mas[" + i + "]=" + mas[i]);
		}

		mas = sortMas(mas);
		System.out.println("Result:");
		for (int i = 0; i < n; i++) {
			if (mas[i] != mas[0])
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		
		
	}

	public static void swap(int[] array, int ind1, int ind2) {
		int tmp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = tmp;
	}

	public static int[] sortMas(int[] a) {
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < a.length; i++) {
				if (a[i] < a[i - 1]) {
					swap(a, i, i - 1);
					needIteration = true;
				}
			}
		}
		return a;
	}
}
