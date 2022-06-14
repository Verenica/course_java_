package by.epam.tr.main;

public class PartTwoTask31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Составить программу для вычисления пути, пройденного лодкой, если ее скорость
		// в стоячей воде v км/ч, скорость
		// течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки —
		// t2 ч.

		double v = 60;
		double v1 = 45;
		double t1 = 1;
		double t2 = 1.30;

		double S = v * t1 + (v - v1) * t2;

		System.out.println("S = " + S);
	
	}

}
