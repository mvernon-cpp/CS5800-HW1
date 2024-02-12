package Q3;

public class Instructor {
	private String fname, lname, officeNum;

	public Instructor(String fname, String lname, String officeNum) {
		this.fname = fname;
		this.lname = lname;
		this.officeNum = officeNum;
	}

	public String getFirstName() {
		return fname;
	}

	public String getLastName() {
		return lname;
	}

	public String getOfficeNumber() {
		return officeNum;
	}

	public void setFirstName(String fname) {
		this.fname = fname;
	}

	public void setLastName(String lname) {
		this.lname = lname;
	}

	public void setOfficeNumber(String officeNum) {
		this.officeNum = officeNum;
	}

	@Override
	public String toString()
	{
		return String.format("[%s %s - Office Number: %s]", getFirstName(), getLastName(),
				getOfficeNumber());
	}
}
