package Q2;

public class CargoShip extends Ship{
	private int weightCapacity;

	public CargoShip(String name, int year, int weightCapacity) {
		super(name, year);
		this.weightCapacity = weightCapacity;
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

	@Override
	public String toString() {
		return String.format("The ship, %s, was built in %d and can hold up to %d tons.", getName(), getYear(),
				getWeightCapacity());
	}
}
