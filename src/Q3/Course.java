package Q3;

public class Course {
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;

	public Course(String courseName, Instructor instructor, Textbook textbook) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.textbook = textbook;
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course Name:" + getCourseName() + "\n\tInstructor(s): " + instructor.toString() + "\n\tTextbook(s): "
				+ textbook.toString();
	}
}
