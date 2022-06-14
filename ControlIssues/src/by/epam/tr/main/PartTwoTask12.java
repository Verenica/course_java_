package by.epam.tr.main;

public class PartTwoTask12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		
		double xa = -1;
        double xb = 3.0;
        double ya = 6;
        double yb = 2;

        double l = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));

        System.out.println("Length between points  (" + xa + ", " + ya + ") and (" + xb + ", " + yb + ") = " + l);
	}

}
