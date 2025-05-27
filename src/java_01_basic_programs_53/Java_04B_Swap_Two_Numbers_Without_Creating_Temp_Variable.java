package java_01_basic_programs_53;

public class Java_04B_Swap_Two_Numbers_Without_Creating_Temp_Variable {

	// Function to swap values of two numbers
	// without creating temp variable
	static void swapValuesWithoutUsingThirdVariable(int[] values) {

		// Steps as listed in algorithm
		// Difference of 2nd from 1st
		// is stored in first variable
		values[0] = values[0] - values[1];
		// Sum is stored in second variable
		values[1] = values[0] + values[1];
		// Difference of 1st from 2nd
		// is replaced in first variable
		values[0] = values[1] - values[0];
	}

	public static void main(String[] args) {
		// Random numbers of integer type
		int[] values = { 9, 5 };

		// Above function is called in main
		// to swap values of numbers
		swapValuesWithoutUsingThirdVariable(values);

		// Print swapped values
		System.out.println("Value of m is " + values[0] + " and Value of n is " + values[1]);
	}
}