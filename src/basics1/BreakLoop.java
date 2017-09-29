package basics1;

public class BreakLoop {

	
// write another program that prints a list of 
// names[Tracy, Doe, Bob, Joe, Sam]
// and stops printing when it finds the name joe
	
	public static void main(String[] args) {
		

// String tells types, square brackets mean array, populate individual names or strings with double quotes
		
		String[] listOfNames = {"Tracy", "Doe", "Cat", "Bob", "Joe", "Sam"};
		
		for (String name : listOfNames) 
			{
				if (name.equals ("Joe")) {
					break;
			}
		System.out.println(name); 
		}
	}

}
