package by.epam.tr.main;

public class Customer {
	// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
	// номер банковского счета.

	private int id;
	private String surname;
	private String name;
	private String middleName;
	private String address;
	private int numberCard;
	private String numberIBAN;

	public Customer() {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.numberCard = numberCard;
		this.numberIBAN = numberIBAN;
	}

	public Customer(int id, String surname, String name, String middleName, String address, int numberCard,
			String numberIBAN) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.numberCard = numberCard;
		this.numberIBAN = numberIBAN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(int numberCard) {
		this.numberCard = numberCard;
	}

	public String getNumberIBAN() {
		return numberIBAN;
	}

	public void setNumberIBAN(String numberIBAN) {
		this.numberIBAN = numberIBAN;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", middleName=" + middleName
				+ ", address=" + address + ", numberCard=" + numberCard + ", numberIBAN=" + numberIBAN + ", getId()="
				+ getId() + ", getSurname()=" + getSurname() + ", getName()=" + getName() + ", getMiddleName()="
				+ getMiddleName() + ", getAddress()=" + getAddress() + ", getNumberCard()=" + getNumberCard()
				+ ", getNumberIBAN()=" + getNumberIBAN() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
