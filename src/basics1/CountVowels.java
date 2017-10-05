package basics1;
// count the number of vowels in a string
public class CountVowels {

	public static void main(String[] args) {
		String myWord = "nowisthebesttimeofyourlife";
		int vowelCount = 0;
		for (int i = 0; i < myWord.length(); i++)
		{
				if (myWord.charAt(i) == 'a' 
						|| myWord.charAt(i) == 'e' 
						|| myWord.charAt(i) == 'i' 
						|| myWord.charAt(i) == 'o' 
						|| myWord.charAt(i) == 'u')
		{
			++ vowelCount;
		}
			
	} 
		System.out.println("Vowel Count is: " + vowelCount);
	}
}

