package by.epam.tr.main;

import java.util.Scanner;

public class PartOneTask17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inpit two single integers");
		System.out.print("> ");

		int m = sc.nextInt();
		int n = sc.nextInt();
	
		//int s; // временная переменная

		if (m != n) {
			if (m > n) {
			n = m;
			} else {
			m =n;
		}
			} else {
			n = 0;
			m = 0;
		}
		System.out.println("m= " + m);
		System.out.println("n= " + n);
		
		
		//17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
		//из исходных, а если равны, то заменить числа нулями.
		
}
	}