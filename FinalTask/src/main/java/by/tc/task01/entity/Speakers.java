package by.tc.task01.entity;

public class Speakers extends Appliance{
	
	// you may add your own code here
	private int powerConsumption;
	private int numberOfSpekers;
	private String frequenceRange;
	private int cordLength;
	
	public Speakers() {
		super();
	}
	
	public Speakers(int powerConsumption, int numberOfSpekers, String frequenceRange, int cordLength) {
		super();
		this.powerConsumption = powerConsumption;
		this.numberOfSpekers = numberOfSpekers;
		this.frequenceRange = frequenceRange;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpekers() {
		return numberOfSpekers;
	}

	public void setNumberOfSpekers(int numberOfSpekers) {
		this.numberOfSpekers = numberOfSpekers;
	}

	public String getFrequenceRange() {
		return frequenceRange;
	}

	public void setFrequenceRange(String frequenceRange) {
		this.frequenceRange = frequenceRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cordLength;
		result = prime * result + ((frequenceRange == null) ? 0 : frequenceRange.hashCode());
		result = prime * result + numberOfSpekers;
		result = prime * result + powerConsumption;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (frequenceRange == null) {
			if (other.frequenceRange != null)
				return false;
		} else if (!frequenceRange.equals(other.frequenceRange))
			return false;
		if (numberOfSpekers != other.numberOfSpekers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpekers=" + numberOfSpekers
				+ ", frequenceRange=" + frequenceRange + ", cordLength=" + cordLength 
				+ "]";
	}

	
}
