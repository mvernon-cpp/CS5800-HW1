package Q3;

public class Course {
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;

	private Instructor[] instructors;
	private Textbook[] textbooks;

	public Course(String courseName, Instructor instructor, Textbook textbook) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.textbook = textbook;
	}

	public Course(String courseName, Instructor[] instructors, Textbook[] textbooks) {
		this.courseName = courseName;
		this.instructors = instructors;
		this.textbooks = textbooks;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course Name: " + getCourseName() + "\n\tInstructor:\t" + instructor.toString() + "\n\tTextbook:\t"
				+ textbook.toString();
	}

	public String print() {
		String output = "Course Name: " + getCourseName() + "\n\tInstructor(s):\t";

		for (Instructor instructor : instructors) {
			output += instructor.toString() + "\t";
		}

		output += "\n\tTextbook(s):\t";
		for (Textbook textbook : textbooks) {
			output += textbook.toString() + "\t";
		}

		return output;
	}
}
