package java_01_basic_programs_53;

//Java program to find factorial
//of given number

public class Java_16B_Find_Factorial_Of_A_Number_Approach_2 {

	// method to find factorial
	// of given number
	static int factorial(int n) {

		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	// main method
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(5));
	}
}