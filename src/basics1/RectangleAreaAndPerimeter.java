package basics1;

import java.util.Scanner;

public class RectangleAreaAndPerimeter {

	static double calcRectangleArea(double height, double width) {
		return height * width;
	}

	static double calcRectanglePerimeter(double height, double width) {
		return (height + width) * 2;
	}

	// MAIN METHOD

	public static void main(String[] args) {
		System.out.println("Please enter height: ");
		double height = new Scanner(System.in).nextDouble();
		System.out.println("Please enter width: ");
		double width = new Scanner(System.in).nextDouble();

		// calls method called rectangleCircumference
		System.out.println("The area of your rectangle is: " + calcRectangleArea(height, width));

		// calls method called rectanglePerimeter
		System.out.println("The perimeter of your rectangle is: " + calcRectanglePerimeter(height, width));

	}
}
