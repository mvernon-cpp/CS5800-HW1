package Q1;

public abstract class Employee {
	private String fname, lname, ssn;

	public Employee(String fname, String lname, String ssn) {
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
	}

	public String getFName() {
		return fname;
	}

	public String getLName() {
		return lname;
	}

	public String getSSN() {
		return ssn;
	}

	public void setFName(String fname) {
		this.fname = fname;
	}

	public void setLName(String lname) {
		this.lname = lname;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return String.format("%s %s: [SSN: %s]", getFName(), getLName(), getSSN());
	}
}
