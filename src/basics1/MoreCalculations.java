package basics1;

public class MoreCalculations {
	public static void main(String[] args) {
// declare variables		
		double calculateSum;
		double calculateProd;
		double calculateDiff; 
		double calculateQuo;
		double calculateQuo2;
// initialize variable
		double div1 = 33;
		double div2 = 4;
// define equations
		calculateSum=6+13+4;
		calculateProd=6*13*4;
		calculateDiff=13-4;
		calculateQuo=13.0/4.0;
		calculateQuo2=div1/div2;
		
// print equations		
		System.out.println("Sum: " + calculateSum);
		System.out.println("Product: " +calculateProd);
		System.out.println("Difference: " +calculateDiff);
		System.out.println("Quotient: " +calculateQuo);
		System.out.println("Quotient2: " +calculateQuo2);
//only gives the remainder of two numbers
		System.out.println("Remainder of " + "33/4: " +33%4);
// Pre and post incremental operators demo
		System.out.println("pre incremental Sum: " + calculateSum++);
		System.out.println("Value of Sum after printing pre incremental Sum: " + calculateSum);
		System.out.println("post incremental Sum: " + ++calculateSum);
	}

}
