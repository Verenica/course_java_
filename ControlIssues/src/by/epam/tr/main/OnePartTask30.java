package by.epam.tr.main;

public class OnePartTask30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
		//это не так.
		double a = -5;
		double b = -3;
		double c = -9;
		
		if ((a > b) & (b > c)) {
			System.out.println("a=" + Math.pow(a, 2));
			System.out.println("b=" + Math.pow(b, 2));
			System.out.println("c=" + Math.pow(c, 2));
		} else {
			System.out.println("a=" + Math.abs(a));
			System.out.println("b=" + Math.abs(b));
			System.out.println("c=" + Math.abs(c));
		}
	}}