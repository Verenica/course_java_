package by.epam.tr.main;
import java.util.Random;

public class TwoArrays_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Дана матрица. Вывести на экран первый и последний столбцы.
		
		int[][] mas = new int[3][4];
		Random rand = new Random();
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
			mas[i][j] = rand.nextInt(100);
			}
			}
		System.out.println("Initial data:");
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
			System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
			}
		System.out.println("Result:");
		for(int i=0; i<mas.length; i++) {
			System.out.printf("[%4d]", mas[i][0]);
			System.out.printf("[%4d]", mas[i][mas[i].length-1]);
			System.out.println();
		}
			}
	}

