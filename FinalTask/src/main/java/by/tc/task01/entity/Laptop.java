package by.tc.task01.entity;

public class Laptop extends Appliance{
	
	// you may add your own code here
	private double batteryCapacity;
	private String Os;
	private int memoryRom;
	private int systemMemory;
	private int displayInchs;
	private int cpu;
	
	public Laptop() {
		super();
	}
	
	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, int displayInchs, int cpu) {
		super();
		this.batteryCapacity = batteryCapacity;
		Os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.displayInchs = displayInchs;
		this.cpu = cpu;
	}
	
	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return Os;
	}

	public void setOs(String os) {
		Os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Os == null) ? 0 : Os.hashCode());
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + cpu;
		result = prime * result + displayInchs;
		result = prime * result + memoryRom;
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Os == null) {
			if (other.Os != null)
				return false;
		} else if (!Os.equals(other.Os))
			return false;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (cpu != other.cpu)
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", Os=" + Os + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", displayInchs=" + displayInchs + ", cpu=" + cpu + "]";
	}
	
	


	
	
	
}
