package Q2;

public class CruiseShip extends Ship {
	private int passangerCapacity;

	public CruiseShip(String name, int year, int passangerCapacity) {
		super(name, year);
		this.passangerCapacity = passangerCapacity;
	}

	public int getPassangerCapacity() {
		return passangerCapacity;
	}

	public void setPassengerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
	}

	@Override
	public String toString() {
		return String.format("The ship, %s, was built in %d and can hold up to %d passengers.", getName(), getYear(),
				getPassangerCapacity());
	}

}
