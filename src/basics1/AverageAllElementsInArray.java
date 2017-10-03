package basics1;

public class AverageAllElementsInArray {

	public static void main(String[] args) {

		double[] numberList = { 1, 2, 3, 4 };
		double sum = 0;
		for (double number : numberList) {
			// sume += number: (short and nifty version)
			sum = sum + number;

		}
		double average;
		average = sum / numberList.length;
		System.out.println("The average of elements is " + average);
	}

}
