package by.epam.tr.main;

public class Book {
	// экземпляры класса
	private int id;
	private String name;
	private String author;
	private String publishingHouse;
	private int theYearOfPublished;
	private int numbersOfPages;
	private int price;
	private String bindingType;

	public Book() {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.theYearOfPublished = theYearOfPublished;
		this.numbersOfPages = numbersOfPages;
		this.bindingType = bindingType;
	}
	
	public Book(int id, String name, String author, String publishingHouse, int theYearOfPublished, int numbersOfPages, int price, String bindingType) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.theYearOfPublished = theYearOfPublished;
		this.numbersOfPages = numbersOfPages;
		this.bindingType = bindingType;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getTheYearOfPublished() {
		return theYearOfPublished;
	}

	public void setTheYearOfPublished(int theYearOfPublished) {
		this.theYearOfPublished = theYearOfPublished;
	}

	public int getNumbersOfPages() {
		return numbersOfPages;
	}

	public void setNumbersOfPages(int numbersOfPages) {
		this.numbersOfPages = numbersOfPages;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numbersOfPages;
		result = prime * result + price;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + theYearOfPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numbersOfPages != other.numbersOfPages)
			return false;
		if (price != other.price)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (theYearOfPublished != other.theYearOfPublished)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", theYearOfPublished=" + theYearOfPublished + ", numbersOfPages=" + numbersOfPages + ", price="
				+ price + ", bindingType=" + bindingType + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAuthor()=" + getAuthor() + ", getPublishingHouse()=" + getPublishingHouse()
				+ ", getTheYearOfPublished()=" + getTheYearOfPublished() + ", getNumbersOfPages()="
				+ getNumbersOfPages() + ", getBindingType()=" + getBindingType() + ", hashCode()=" + hashCode()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

}
