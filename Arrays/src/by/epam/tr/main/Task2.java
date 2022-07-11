package by.epam.tr.main;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int[] mas1 = {1, 2, 3, 4, 5, 10, 11, 0, 15, 36, 56, 89, 0, 12, 0};
		
		for(int i = 0; i < mas1.length;i++) {
			if(mas1[i] == 0) {
				count += 1;
			}
		}
		int[] mas2 = new int[count];
		for(int i = 0, j = 0; i < mas1.length; i++) {
			if (mas1[i] == 0) {
				mas2[j] = i;
				j++;
			}
		}
		System.out.println(Arrays.toString(mas2));
	}

}
