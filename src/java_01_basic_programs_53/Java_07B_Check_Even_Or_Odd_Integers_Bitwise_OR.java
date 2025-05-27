package java_01_basic_programs_53;

//Main class
public class Java_07B_Check_Even_Or_Odd_Integers_Bitwise_OR {

	public static void main(String[] args) {

		// Declaring and initializing integer variable
		// to be checked
		int n = 100;

		// Condition check
		// if n|1 if greater than n then this number is even
		if ((n | 1) > n) {

			// Print statement
			System.out.println("Number is Even");
		} else {

			// Print statement
			System.out.println("Number is Odd");
		}
	}
}
