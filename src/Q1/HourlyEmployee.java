package Q1;

public class HourlyEmployee extends Employee {
	private double wage;
	private int hoursWorked;

	public HourlyEmployee(String fname, String lname, String ssn, double wage, int hoursWorked) {
		super(fname, lname, ssn);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return String.format("%s %s: [SSN: %s, Wage: $%.2f, Hours Worked: %d]", getFName(), getLName(), getSSN(), getWage(),
				getHoursWorked());
	}
}
