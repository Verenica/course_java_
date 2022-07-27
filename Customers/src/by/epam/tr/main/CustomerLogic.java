package by.epam.tr.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Создать второй класс, агрегирующий коллекцию типа Customer, с подходящими конструкторами и методами. 
//Задать критерии выбора данных и вывести эти данные на консоль. 

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
//Найти и вывести: 
//a) список покупателей в алфавитном порядке; 
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class CustomerLogic {

	public List<String> getSurnameCustomers(List<Customer> cs) {
		List<String> resultSurname = new ArrayList<String>();
		
		for (Customer c : cs) {
			resultSurname.add(c.getSurname());
		}
		Collections.sort(resultSurname);
		return resultSurname;
	}
	
	public List<Customer> getListCards(List<Customer> cs, int numberCardFrom, int numberCardTo) {
		List<Customer> resultListCards = new ArrayList<Customer>();
		
		for (Customer c : cs) {
			if ((c.getNumberCard()>= numberCardFrom ) & (c.getNumberCard() <= numberCardTo)) {
				resultListCards.add(c);
			}
		}
		
		return resultListCards;
	}
}
