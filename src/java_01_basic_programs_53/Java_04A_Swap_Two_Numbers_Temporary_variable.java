package java_01_basic_programs_53;

public class Java_04A_Swap_Two_Numbers_Temporary_variable {

	// Function to swap two numbers
	// Using temporary variable
	static void swapValuesUsingThirdVariable(int m, int n) {

		// Swapping the values
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m + " and Value of n is " + n);
	}

	public static void main(String[] args) {
		// Random integer values
		int m = 9, n = 5;

		// Calling above function to
		// reverse the numbers
		swapValuesUsingThirdVariable(m, n);
	}
}