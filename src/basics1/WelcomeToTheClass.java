package basics1;

public class WelcomeToTheClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listOfNames = { "AJ", "Ramone", "Leslie" };
		welcomeStudents(listOfNames);
	}

	public static void welcomeStudents(String[] listOfNames) {

		for (String name : listOfNames) {
			System.out.println(name.concat(" - Welome to the class"));

		}
	}
}
