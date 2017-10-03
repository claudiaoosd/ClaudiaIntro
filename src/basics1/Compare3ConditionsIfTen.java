// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
// makes10(9, 10) → true
// makes10(9, 9) → false
// makes10(1, 9) → true

package basics1;

public class Compare3ConditionsIfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 8;
		int number2 = 10;
		if (number1 == 10 || number2 == 10) {
			System.out.println("This is true");
		}
			else if (number1 + number2 == 10) {
				System.out.println("This is true");
			}
				else {
					System.out.println("FALSE");
				}
		
		}

}

