// Write a program that scans a number from the user (use scanner)
//and prints the corresponding day of the week
// example if user entered 1 print monday
// if user entered 2 print tuesday
// NOTE: solve this using Switch case
// 8 or more print invalid number
// no need for arrays

package basics1;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		System.out.println("Please enter number between 1 and 7 for day of week where 1 is for Monday, 2 is for Tuesday, et cetera: ");
		int dayNumber = new Scanner(System.in).nextInt();
		String dayString;
		switch (dayNumber) {
		case 1: dayString = "Monday"; 
		break;
		case 2: dayString = "Tuesday"; 
		break;
		case 3: dayString = "Wednesday"; 
		break;
		case 4: dayString = "Thursday"; 
		break;
		case 5: dayString = "Friday";
		break;
		case 6: dayString = "Saturday"; 
		break;
		case 7: dayString = "Sunday"; 
		break;
		default: dayString = "Invalid day of the week";
		break;
		}
		System.out.println(dayString);

	}

}
