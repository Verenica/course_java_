package by.epam.tr.main;

import java.util.Scanner;
import java.util.Random;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int c = 0;
		int d = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("insert c");
			c = sc.nextInt();
			System.out.println("insert d");
			d = sc.nextInt();
			if (c > d) {
				System.out.println("Wrong");
			}
		} while (c > d);
		String result = "";
		int mas[] = new int[n];
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(10);
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		for (int i = 0; i < n; i++) {
			if (mas[i] >= c && mas[i] <= d) {
				result += mas[i] + ";";
			}
		}
		System.out.println();
		System.out.println("Numbers: " + result);
	}

}
