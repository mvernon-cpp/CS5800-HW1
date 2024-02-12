package Q3;

public class Main {
	public static void main(String[] args) throws Exception {
		Instructor NDavarpanah = new Instructor("Nima", "Davarpanah", "8-15");
		Textbook CleanCode = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
		Course CS5800 = new Course("CS5800", NDavarpanah, CleanCode);

		System.out.println("Course(s) Information:");

		System.out.println(CS5800);
	}
}
