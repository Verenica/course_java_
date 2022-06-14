package by.epam.tr.main;

import java.util.Scanner;

public class PartOneTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Inpit two single integers");
		System.out.print("> ");

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}