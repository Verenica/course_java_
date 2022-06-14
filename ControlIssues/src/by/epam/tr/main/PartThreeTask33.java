package by.epam.tr.main;

public class PartThreeTask33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 33. Найдите наибольшую цифру данного натурального числа.
		int a = 759;
		int b = 0;
		int max = 0;
		
		while (a >= 1) {
			b = a%10;
			if (b > max) {
				max = b;
			}
			a = a /10;
		}
		System.out.println("Max = " + max);
	}

}
