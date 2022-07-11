package by.epam.tr.main;

import java.util.Random;

import java.util.Random;

public class TwoArrays_Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. Дана матрица. Вывести на экран все четные строки, то есть с четными
		// номерами.

		int[][] mas = new int[3][4];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		System.out.println("Initial data:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("Result:");
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("[%4d]", mas[i][j]);
					// System.out.printf("[%4d]", mas[i][mas[i].length-1]);
					
				}
				System.out.println();
			}
		}
	}
}
