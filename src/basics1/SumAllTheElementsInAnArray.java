package basics1;

import java.util.stream.IntStream;

public class SumAllTheElementsInAnArray {

	public static void main(String[] args) {
	
			// Loop through array adding new value to myArrayValue while incrementing array position
int[] myArray = {15, 30, 45, 60};
		int sum = IntStream.of(myArray).sum();
		System.out.println("The sum is " + sum);
	
			
}
	}


//too difficult
//make it easier
//	int[] numberList = {2,3,4,5,6}
//for int num; numberList {
//sum - sum + sum;
// //sum += number; (short and nifty version)