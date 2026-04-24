package basics;

/*Condition 1: Divisible by 4
  BUT: If it is divisible by 100 → NOT a leap year
  EXCEPTION: If it is divisible by 400 → it IS a leap year
*/

public class LeapYear {

	public static void main(String[] args) {
		int year = 2024;
		
		if(year % 400 == 0) {
			System.out.println("Leap year");
		}
		else if(year % 100 == 0) {
			System.out.println("Not a leap year");
		}
		else if(year % 4 == 0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
