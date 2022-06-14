package by.epam.tr.main;

import java.util.Scanner;
//import java.util.Date; 

public class PartOneTask23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Day =");
		int d = sc.nextInt();
		System.out.print("Month =");
		int m = sc.nextInt();

		if ((d > 0) & (m > 0)) {
			if ((d <= 31) & (m <= 12)) {
				System.out.println("It's a date. [" + d + "." + m + "]");
			} else {
				System.out.println("It's not a date. [" + d + "." + m + "]");
			}
		} else {
			System.out.println("It's not a date. [" + d + "." + m + "]");
		}
	}
}

// Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
//некорректные данные, то сообщить об этом.