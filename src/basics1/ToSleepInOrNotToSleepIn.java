package basics1;

// To Sleep in means TRUE, To NOT Sleep In is false
public class ToSleepInOrNotToSleepIn {
	

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	// Boolean
	// weekday and vacation then sleepin <== only if weekend is true or vacation is true
	// CheckIfISleepIn(true, false) -> false
	// CheckIfSleepIn(false, false) -> True
	// CheckIfSleepIn(true, true) -> true
	// CheckIfIsSleepIn(false, true( -> true
	//  another option: static boolean sleepIn(boolean weekday, boolean vacation ) {
	
	public static void main(String[] args) {
		System.out.println(sleepIn(true, false));
	}
	public static boolean sleepIn( boolean weekday, boolean vacation) {
	
// If weekday is false or vacation is true then SLEEPIN
		if (weekday == false || vacation == true) {
//			System.out.println("Sleep In!!!  No need to get up early");
			return true;
		}
		else	
//		System.out.println("Time to get out of bed");
		return false;
	}

}


