package by.epam.tr.main;

public class Bees {
	private int honey;
	private int mead;

	public Bees() {
		honey = 1;
		mead = 1;
	}

	public Bees(int _honey, int _mead) {
		honey = _honey;
		mead = _mead;
	}
	
	public int addition() {
		return honey + mead;
	}
	
	public int compare() {
		if (honey > mead) {
			return honey;
		}
		return mead;
	}

	public int getHoney() {
		return honey;
	}

	public void setHoney(int honey) {
		this.honey = honey;
	}

	public int getMead() {
		return mead;
	}

	public void setMead(int mead) {
		this.mead = mead;
	}
}
