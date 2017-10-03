// Given two int values, return their sum. Unless the two values are the same, then return double their sum.
// sumDouble(1, 2) → 3
// sumDouble(3, 2) → 5
// sumDouble(2, 2) → 8


package basics1;

public class TestTwoValuesSumOrDoubleSum {

	public static void main(String[] args) {
		
		int sumDoubleA = 2;
		int sumDoubleB = 2;
		
		
		if (sumDoubleA == sumDoubleB) {
			System.out.println(sumDoubleA * 2);
		}
		else {
			System.out.println(sumDoubleA + sumDoubleB);
		}
	}

}
