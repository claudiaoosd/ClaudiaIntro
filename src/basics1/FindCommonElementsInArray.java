// Write a program that finds the common elements in two arrays. (No input from user, just write the code in main method)
// Note: Create two int[](arrays) and find common elements between the two arrays

package basics1;

public class FindCommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[]{1,3,5,7,9};
		int[] array2 = new int[]{2,4,5,6,9};
		int positionInArray1;
		int positionInArray2 = 0;
		
		//outer loop
		for (positionInArray1 = 0; positionInArray1 < array1.length; positionInArray1++) {
			
		//inner loop
			for (positionInArray2 = 0; positionInArray2 < array2.length; positionInArray2++)
			{
				if (array1[positionInArray1] == array2[positionInArray2++])
					System.out.println(array1[positionInArray1] + " is in both arrays");
			}
		
	}
	}		
}
	
