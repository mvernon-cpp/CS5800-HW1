package Q3;

public class Main {
	public static void main(String[] args) throws Exception {
		Instructor NDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
		Textbook CleanCode = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
		Course CS5800_01 = new Course("CS5800_01", NDavarpanah, CleanCode);

		Instructor[] instructors = { NDavarpanah,
				new Instructor("David", "Johansen", "8-13") };
		Textbook[] textbooks = { CleanCode,
				new Textbook("Design Patterns", "Erich Gamma", "Pearson") };
		Course CS5800_02 = new Course("CS5800_02", instructors, textbooks);

		System.out.println("Course(s) Information:");
		System.out.println(CS5800_01 + "\n");
		System.out.println(CS5800_02.print());
	}
}
