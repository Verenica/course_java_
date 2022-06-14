package by.epam.tr.main;

public class PartTwoTask35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
		
		int m = 15;
        int n = 4;

        double result = (double) m / n;

        int younger = (int) (result % 10);
        int older = (int) ((result * 10) % 10);

        System.out.println(m + " / " + n + " = " + result);
        System.out.println("Older: " + older);
        System.out.println("Younger: " + younger);
        System.out.println();
	}

}
