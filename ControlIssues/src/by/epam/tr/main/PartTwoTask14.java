package by.epam.tr.main;

public class PartTwoTask14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		
		double r = 7.5;

        double l = 2 * Math.PI * r;
        double s = Math.PI * r * r;

        System.out.println("For the circle which has R = " + r + " his length = " + l + ", S of the circle = " + s);
	}

}
