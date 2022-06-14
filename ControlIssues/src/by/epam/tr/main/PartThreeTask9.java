package by.epam.tr.main;

public class PartThreeTask9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9. Найти сумму квадратов первых ста чисел.
		
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("Sum = " + sum);
	}

}
