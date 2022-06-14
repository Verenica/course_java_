package by.epam.tr.main;

public class PartTwoTask26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
		double a = 3.5;
        double b = 6.0;
        double y = 30;

        double radiana = y * Math.PI / 180.0;

        double S = 0.5 * a * b * Math.sin(radiana);

        System.out.println("S triangle a = " + a + ", b = " + b + " and alpha = " + y + " = " + S);
	}

}
