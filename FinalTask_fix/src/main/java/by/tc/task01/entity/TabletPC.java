package by.tc.task01.entity;

public class TabletPC extends Appliance{
	// you may add your own code here
	private int batteryCapacity;
	private int displayInchs;
	private int memoryRom;
	private int flashMemoryCapacity;
	private  String colour;
	
	public TabletPC() {
		super();
	}
	public TabletPC(int batteryCapacity, int displayInchs, int memoryRom, int flashMemoryCapacity, String colour) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInchs = displayInchs;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.colour = colour;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + displayInchs;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryRom;
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInchs=" + displayInchs + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", colour=" + colour + "]";
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
