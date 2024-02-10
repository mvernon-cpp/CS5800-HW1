package Q1;

public class BaseEmployee extends Employee {
	private double baseSalary;

	public BaseEmployee(String fname, String lname, String ssn, double baseSalary) {
		super(fname, lname, ssn);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return String.format("%s %s: [SSN: %s, Base Salary: $%,.2f]", getFName(), getLName(), getSSN(), getBaseSalary());
	}
}
