package by.epam.tr.main;

public class PartTwoOne6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
		// литров молока в m больших бидонах,
		// если в каждом большом бидоне на 12 л. больше, чем в малом?

		int n = 8;
		double nAmount = 80;
		int m = 2;
		double mDiff = 12.0;

		double mAmount = m * (nAmount / n + mDiff);

		System.out.println("n = " + n + ", m = " + m + " in m large tin " + mAmount + " liters milk");
	}
}
