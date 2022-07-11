package by.epam.tr.main;

//import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
		//отрицательное.
		
		int[] array = new int[] { 23, 0, 15, 5, -43, 4 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.println("Positive");
				return;
			} else if (array[i] < 0) {
				System.out.println("Negative");
				return;
			}
		}

	}
}
