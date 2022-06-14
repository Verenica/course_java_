package by.epam.tr.main;

public class PartOneTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
		//запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
		//«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
		//денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
		
		double price = 100; // стоимость книг
		double payment = 100; // внесенная сумма денег покупателем
		double change = 0; // сдача
		
		if(payment != price) {
			if (payment > price) {
				change = payment - price;
				System.out.println("Here's your change " + change);
			} else {
				change = price - payment;
				System.out.println("There's not enough money " + change);
			}
		}
		else {
			System.out.println("Thank you");
		}
	}

}
