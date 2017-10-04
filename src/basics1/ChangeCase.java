package basics1;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
	
		
		System.out.println("Enter your name: ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("In upper case: " + name.toUpperCase());
		System.out.println("In lower case: " + name.toLowerCase());
	}
	 
}
