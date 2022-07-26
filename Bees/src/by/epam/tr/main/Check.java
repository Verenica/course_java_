package by.epam.tr.main;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bees B1 = new Bees();
		Bees B2 = new Bees(-1, 5);
		
		int b = B2.addition();
		int b1 = B2.compare();
		System.out.println(b);
		System.out.println(b1);

	}

}
