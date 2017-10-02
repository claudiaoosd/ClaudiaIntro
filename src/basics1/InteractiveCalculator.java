package basics1;

import java.util.Scanner;

public class InteractiveCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the digits for the first number");
		double number1 = new Scanner(System.in).nextInt();
		System.out.println("Enter the digits for the second number");
		double number2 = new Scanner(System.in).nextInt();
		System.out.println("Enter the operator /(what function do you want to perform/)");
		String operation = new Scanner(System.in).next();
		// next line calls Method called calculate and performs the operation
		calculate(number1, number2, operation);
	}

	private static void calculate(double number1, double number2, String operation) {
		double result;
		if(operation.equals("+")) {
			result = number1 + number2;
			System.out.println("The sum is: " + result);
		}
		else if(operation.equals("-")) {
			result = number1 - number2;
			System.out.println("The difference is: " + result);
		}
		else if(operation.equals("*")) {
			result = number1 * number2;
			System.out.println("The product is: " + result);
		}
		else if(operation.equals("/")) {
			result = number1 / number2;
			System.out.println("The quotient is: " + result);
		}
		}
	}
	

