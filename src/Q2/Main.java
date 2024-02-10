package Q2;

public class Main {
	public static void main(String[] args) throws Exception {
		Ship[] ships = { new Ship("OG Ship", 2000), new CruiseShip("The Great Traveller", 2002, 500),
				new CargoShip("Grand Transporter", 2004, 100) };
		
		System.out.println("Ships:");
		for(Ship ship: ships)
			System.out.println(ship);
	}
}
