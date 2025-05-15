package java_01_basic_programs_53;

//Java program to find factorial
//of given number

public class Java_16C_Find_Factorial_Of_A_Number_Approach_3 {

	// function to find factorial
	int factorial(int n) {

		// single line to find factorial
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}

	// main function
	public static void main(String args[]) {

		Java_16C_Find_Factorial_Of_A_Number_Approach_3 obj = new Java_16C_Find_Factorial_Of_A_Number_Approach_3();
		int num = 5;
		System.out.println("Factorial of " + num + " is " + obj.factorial(num));
	}
}