package by.epam.tr.main;

public class PartThreeTask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Вычислить значения функции на отрезке [а,b] c шагом h:
		 	int a = -5;
	        int b = 3;
	        int h = 2;
	        int y;

	        for (int i = a; i <= b; i += h) {
	            if (i > 2) {
	                y = i;
	            } else {
	                y = i * (-1);
	            }
	            System.out.println("x = " + i + " y = " + y);
	        }
	        System.out.println();
	    }
	}
