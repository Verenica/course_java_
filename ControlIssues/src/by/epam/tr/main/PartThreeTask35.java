package by.epam.tr.main;

public class PartThreeTask35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 35. Найдите количество четных цифр данного натурального числа.
		
		int a = 222;
		int b = 0;
		int c = 0;
		
		while (a >= 1) {
			b = a%10;
			 if (b%2 == 0) {
				 c++;
			 }
			a = a/10; 
		}
		System.out.println("Countable numbers = " + c);
}

}
