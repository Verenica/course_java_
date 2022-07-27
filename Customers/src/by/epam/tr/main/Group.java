package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Customer> customers;

	public Group() {
		customers = new ArrayList<Customer>();
	}

	public void add(Customer c) {
		customers.add(c);
	}

	public List<Customer> getCustomers()  {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
