package basics1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CircleAreaCircumference {
	// Calculate Area using given radius
	static double calculateArea(double radius) {	
		return Math.PI * radius * radius;
	}

	// Calculate circumference using given radius
	static double calculateCircumference(double radius) {		
		return Math.PI * 2 * radius;
	}

	// Create main
	public static void main(String[] args) {
		System.out.println("Please enter the radius: ");
		double radius = new Scanner(System.in).nextDouble();
		// calls method called calculateArea
		System.out.println("The area of a circle with a radius of " + radius + " is: " + calculateArea(radius));
		// calls method called calculateCircumference
		System.out.println("The circumference of " + radius + " is: " + calculateCircumference(radius));
		
	}

}
