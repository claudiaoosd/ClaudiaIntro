package basics1;

// return the number of even ints in a given array
public class CountEvenNumbers {

	public static void main(String[] args) {
		
		int numberOfEvens = 0;
		double[] numberList = { 1, 2, 3, 4, 6, 7, 8, 9 };
		for (int i = 0; i < numberList.length -1; i++) {
			if (numberList[i] % 2 == 0) {
				numberOfEvens++;
			}
		}
		System.out.println("The number of even numbers in the array = " + numberOfEvens);
	}
}
