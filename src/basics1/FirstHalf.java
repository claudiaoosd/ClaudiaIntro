package basics1;

public class FirstHalf {

	public static void main(String[] args) {
	
String EvenLengthString = "Bigger";
int StringLength = EvenLengthString.length();
int HalfWord = (StringLength/2);
System.out.println("First half of word is: " + EvenLengthString.substring(0, HalfWord));

	}

}
