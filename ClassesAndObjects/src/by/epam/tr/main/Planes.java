package by.epam.tr.main;

public class Planes {
	private String place;
	private int number;
	private String name;
	private int hour;
	private int min;
	private int sec;
	private String day;

	public Planes() {
		place="";
		number=0;
		name="";
		hour=0;
		min=0;
		sec=0;
		day="";
	}

	public Planes(String place,int number,String name,int hour,int min,int sec,String day) {
		this.place=place;
		this.number=number;
		this.name=name;
		this.hour=hour;
		this.min=min;
		this.sec=sec;
		this.day=day;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + hour;
		result = prime * result + min;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + sec;
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
		Planes other = (Planes) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (sec != other.sec)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Planes [place=" + place + ", number=" + number + ", name=" + name + ", hour=" + hour + ", min=" + min
				+ ", sec=" + sec + ", day=" + day + "]";
	}

}
