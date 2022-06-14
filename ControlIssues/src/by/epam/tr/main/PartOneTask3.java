package by.epam.tr.main;

import java.util.Scanner;

public class PartOneTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Inpit two single integers");
		System.out.print("> ");

		int a = sc.nextInt();

		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
