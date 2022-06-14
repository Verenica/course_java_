package by.epam.tr.main;

public class PartTwoTask18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
		
		double a = 9.8;

        double s = a * a;
        double sqAll = s * 6;
        double v = Math.pow(a, 3);

        System.out.println("S = " + s);
        System.out.println("sqAll = " + sqAll);
        System.out.println("V = " + v);
	}
}
