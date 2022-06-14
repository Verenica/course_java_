package by.epam.tr.main;
import java.util.Scanner;

public class PartOneTask12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Inpit three single integers");
				System.out.print("> ");

				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();

				if (a > 0) {
					System.out.println("a1 = " + Math.pow(a, 2));
					
				} else {
					System.out.println("a2 = " + Math.pow(a, 4));
				}
				if (b > 0) {
					System.out.println("b1 = " + Math.pow(b, 2));
					
				} else {
					System.out.println("b2 = " + Math.pow(b, 4));
				}
				if (c > 0) {
					System.out.println("c1 = " + Math.pow(c, 2));
					
				} else {
					System.out.println("c2 = " + Math.pow(c, 4));
				}
				
	}

}
