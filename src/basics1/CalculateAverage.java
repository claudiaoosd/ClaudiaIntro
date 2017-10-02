package basics1;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter nunber1: ");
		int number1 = new Scanner(System.in).nextInt();
		System.out.println("Please enter nunber2: ");
		int number2 = new Scanner(System.in).nextInt();		
		System.out.println("Please enter nunber3: ");
		int number3 = new Scanner(System.in).nextInt();		
		System.out.println("Please enter nunber4: ");
		int number4 = new Scanner(System.in).nextInt();		
		System.out.println("Please enter nunber5: ");
		int number5 = new Scanner(System.in).nextInt();		
		System.out.println("Please enter nunber6: ");
		int number6 = new Scanner(System.in).nextInt();
		int average =((number1 + number2 + number3 + number4 + number5 + number6)/6);
		System.out.println(average + " is the average of" + number1 + number2 + number3 + number4 + number5 + number6);
	}

}
