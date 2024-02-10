package Q1;

public class CommisionEmployee extends Employee {
	private double commRate;
	private double grossSalary;

	public CommisionEmployee(String fname, String lname, String ssn, double commRate, double grossSalary) {
		super(fname, lname, ssn);
		this.commRate = commRate;
		this.grossSalary = grossSalary;
	}

	public double getCommissionRate() {
		return commRate;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setCommissionRate(double commRate) {
		this.commRate = commRate;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public String toString() {
		return String.format("%s %s: [SSN: %s, Commision Rate: %.0f%% Gross Salary: $%,.2f]", getFName(), getLName(), getSSN(), getCommissionRate(), getGrossSalary());
	}
}
