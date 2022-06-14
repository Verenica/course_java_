package by.epam.tr.main;

public class PartThreeTask19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
		//равен заданному е. 
		double sum = 0.0;
        double e = 0.7;
        double an = 0.0;
        double n = 7;

        for (double i = 0; i <= n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Sum = " + sum);
	}

}
