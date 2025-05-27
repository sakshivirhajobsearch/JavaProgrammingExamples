package java_01_basic_programs_53;

public class Java_14A_Check_Whether_The_Input_Number_Is_A_Neon_Number_Approach_1 {

	// Method to check whether number is neon or not
	// Boolean type
	public static boolean checkNeon(int n) {
		// squaring the number to be checked
		int square = n * n;

		// Initializing current sum to 0
		int sum = 0;

		// If product is positive
		while (square > 0) {

			// Step 1: Find remainder
			int r = square % 10;

			// Add remainder to the current sum
			sum += r;

			// Drop last digit of the product
			// and store the number
			square = square / 10;
		}

		// Condition check
		// Sum of digits of number obtained is
		// equal to original number
		if (sum == n)

			// number is neon
			return true;
		else

			// number is not neon
			return false;
	}

	public static void main(String[] args) {

		// Custom input
		int n = 9;

		// Calling above function to check custom number or
		// if user entered number via Scanner class
		if (checkNeon(n))

			// Print number considered is neon
			System.out.println("Given number " + n + " is Neon number");
		else

			// Print number considered is not neon
			System.out.println("Given number " + n + " is not a Neon number");
	}
}
