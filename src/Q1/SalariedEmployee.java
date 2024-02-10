package Q1;

public class SalariedEmployee extends Employee {
	private double wSalary;

	public SalariedEmployee(String fname, String lname, String ssn, double wSalary) {
		super(fname, lname, ssn);
		this.wSalary = wSalary;
	}

	public double getWeeklySalary() {
		return wSalary;
	}

	public void setWeeklySalary(double wSalary) {
		this.wSalary = wSalary;
	}

	@Override
	public String toString() {
		return String.format("%s %s: [SSN: %s, Weekly Salary: $%,.2f]", getFName(), getLName(), getSSN(), getWeeklySalary());
	}
}
