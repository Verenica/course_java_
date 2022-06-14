package by.epam.tr.main;
 
public class PartOneTask15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 8;
		double y = 5;

		double s; // временная переменная

		System.out.println("x= " + x);
		System.out.println("y= " + y);

		if ((x < y)) {
			s = x;
			x = (x + y) / 2;
			y = s * y * 2;
		} else {
			s = y;					
			y = (x + y) / 2;
			x = s * x * 2;			
		}
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}

//Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их
//суммы, а большее — их удвоенным произведением.