package basics1;

public class ContinueLoop {
	// Write a program that prints numbers from 10 to 1
	// and skips numbers 3, 4, and 6

	public static void main(String[] args) {

		// initialize, check condition, increment
		for (int i = 10; i > 0; i--) {
			{
				if (i == 3 || i == 4 || i == 6)
					continue;
			}
			System.out.println(i);
		}
	}

}
