package basics1;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		a = 78;
		b = 54;
		c = 6;
		if (a > c && a > b) {
			System.out.println(a + " is greater than " + b + " as well as " + c);

		}
		if (b > a && b > c) {
			System.out.println(b + " is greater than " + a + " as well as " + c);

		}
		{
			if (c > a && c > b)
				System.out.println(c + " is greather than both " + a + " as well as " + b);
		}
	}

}
