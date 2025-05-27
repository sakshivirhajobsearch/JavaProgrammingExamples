package java_01_basic_programs_53;

import java.time.Year;

//Class for leap-year dealing
public class Java_12D_Check_Leap_Year_Approach_4 {

	// Method to check leap year
	public static void isLeapYear(int year) {
		// flag to take a non-leap year by default
		boolean is_leap_year = false;

		Year checkyear = Year.of(year);

		is_leap_year = checkyear.isLeap();

		if (!is_leap_year)
			System.out.println(year + " : Non Leap-year");
		else
			System.out.println(year + " : Leap-year");
	}

	public static void main(String[] args) {

		// Calling our function by
		// passing century year not divisible by 400
		isLeapYear(2000);

		// Calling our function by
		// passing Non-century year
		isLeapYear(2002);
	}
}
