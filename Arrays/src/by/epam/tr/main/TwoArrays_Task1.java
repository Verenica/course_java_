package by.epam.tr.main;
//import java.util.Random;

public class TwoArrays_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
		// вывести на экран.
		
		int[][] mas = new int[3][4];
		//Random rand = new Random();
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
			mas[i][0] = 1;
			}
			}
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
			System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
	}
	}
}
