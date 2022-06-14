package by.epam.tr.main;

public class PartTwoTask21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
		// дробную и целую части числа и вывести полученное значение числа.
		
		double R = 777.331;

        int firstPart = (int) R;
        int secondPart = (int)((R - firstPart) * 1000);
        double result = secondPart + firstPart * 0.001;

        System.out.println("Input number " + R);
        System.out.println("Output number " + result);
	}

}
