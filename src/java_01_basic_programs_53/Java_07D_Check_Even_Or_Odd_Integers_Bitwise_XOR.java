package java_01_basic_programs_53;

//Main class
public class Java_07D_Check_Even_Or_Odd_Integers_Bitwise_XOR {

	public static void main(String[] args) {

		// Declare and initializing integer variable
		int num = 99;

		// Condition Check
		// if number^1 increments by 1 then its even number,
		// else odd
		if ((num ^ 1) == num + 1) {

			// Print statement
			System.out.println("Number is Even");
		} else {

			// Print statement
			System.out.println("Number is Odd");
		}
	}
}
