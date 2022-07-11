package by.epam.tr.main;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
		// в нем отрицательных,
		// положительных и нулевых элементов.

		double[] array = { 0, -5, -6, 5, 4, 0, 7, -1 };
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positiveCount++;
			} else if (array[i] == 0) {
				zeroCount++;
			} else {
				negativeCount++;
			}
		}

		System.out.println("In the array are " + positiveCount + " positive, " + negativeCount + " negative and "
				+ zeroCount + " zero.");
		System.out.println();
	}

}
