package by.epam.tr.main;
//import java.util.Scanner;
import java.util.Random;
public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
	      int maxNum = 0;
	      int tmpSum = 0;
	      int tmpSum1 = 0;
	      int [] mas = new int[n];
	      Random rand = new Random();

	      for (int i = 0; i < n; i++) {
	        mas[i] = rand.nextInt(10);
	        System.out.println("mas["+i+"]=" + mas[i]);
	      }
	      for (int i = 0; i < n; i++) {
	        if((i+2)>n){
	          break;
	        }
	        tmpSum= mas[1]+mas[2]*i;
	        tmpSum1= mas[2]+mas[2]*(i-1)^(mas[i]+mas[i+1]);
	        System.out.println("SUM1: "  + tmpSum + " AND SUM2: "  + tmpSum1);
	        if(tmpSum1>tmpSum) {
	          tmpSum = tmpSum1;
	        }
	        if(maxNum < tmpSum) {
	          maxNum = tmpSum;
	        }
	      }
	      System.out.println();
	      System.out.println("Max: "  + maxNum);
	    
	    }
	}

