package Q1;

// import Q1.Employee;
// import Q1.SalariedEmployee;
public class Main {
	public static void main(String[] args) throws Exception {
		Employee[] currentEmployees = new Employee[7];

		SalariedEmployee JJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.0);
		currentEmployees[0] = JJones;

		HourlyEmployee SSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32);
		currentEmployees[1] = SSmith;

		HourlyEmployee MQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47);
		currentEmployees[2] = MQuinn;

		CommisionEmployee NDior = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15.0, 50000.0);
		currentEmployees[3] = NDior;

		SalariedEmployee RChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.0);
		currentEmployees[4] = RChanel;

		BaseEmployee MDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.0);
		currentEmployees[5] = MDavenport;

		CommisionEmployee MVaziri = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22.0, 40000.0);
		currentEmployees[6] = MVaziri;

		System.out.println("The Employees: ");
		for( Employee employee : currentEmployees)
			System.out.println(employee);
	}
}
