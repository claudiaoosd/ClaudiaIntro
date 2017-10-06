package basics1;

public class TemperaturesIcyHot {

	// given two temperatures, return true if one is less than 0 and the other is
	// greater than 100
	// icyHot(120, -1) returns true
	// icyHot(-1, 120 returns true
	// icyHot(2,120) returns false

	public static void main(String[] args) {

		int firstTemp = 154;
		int secondTemp = -54;
		
		System.out.println(checkTemp(firstTemp, secondTemp));

	}

	static boolean checkTemp(int firstTemp, int secondTemp) {

		if (firstTemp > 100 && secondTemp < 0) {
			return true;
		} else if (firstTemp < 100 && secondTemp > 0) {
			return true;
		} else {
			return false;
		}

	}

}
