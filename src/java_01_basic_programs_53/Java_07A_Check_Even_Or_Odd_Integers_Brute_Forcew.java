package java_01_basic_programs_53;

//Main class
public class Java_07A_Check_Even_Or_Odd_Integers_Brute_Forcew {

	public static void main(String[] args) {

		// Declaring and initializing integer variable
		int num = 10;

		// Checking if number is even or odd number
		// via remainder
		if (num % 2 == 0) {

			// If remainder is zero then this number is even
			System.out.println("Entered Number is Even");
		}

		else {

			// If remainder is not zero then this number is
			// odd
			System.out.println("Entered Number is Odd");
		}
	}
}
