package by.epam.tr.main;

import java.util.Scanner;

public class PartOneTask26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a");
		int a = sc.nextInt();
		System.out.print("b");
		int b = sc.nextInt();
		System.out.print("c");
		int c = sc.nextInt();
		
		int min = 0;
		int max = 0;
		
		
		if (a >= b && a >= c) {
			max = a;
			System.out.println(a + " is maximum number");
		} else if (b >= a && b >= c) {
			max = b;
			System.out.println(b + " is maximum number");
		} else {
			max = c;
			System.out.println(c + " is maximum number");
		}

		if (a <= b && a <= c) {
			min = a;
			System.out.println(a + " is minimum number");
		} else if (b <= a && b <= c) {
			min = b;
			System.out.println(b + " is minimum number");
		} else {
			min = c;
			System.out.println(c + " is minimum number");
		}
		
		int sum = min + max;
		System.out.println("sum = " + sum);
		
	}
}

///Написать программу нахождения суммы большего и меньшего из трех чисел.