// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
// Return true if we are in trouble.
// parrotTrouble(true, 6) → true
// parrotTrouble(true, 7) → false
// parrotTrouble(false, 6) → false

package basics1;

public class LoudTalkingParrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int hour =10;
if (hour < 7 || hour >=20) {
	System.out.println("You are in so much trouble");
	//return true;
}
	else 
		System.out.println("You can rest easy");
//return false;
	
}
	}


