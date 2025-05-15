package java_01_basic_programs_53;

//Java program to find factorial
//of given number

public class Java_16A_Find_Factorial_Of_A_Number_Approach_1 {

	// Method to find factorial
	// of given number
	static int factorial(int n) {

		int res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;
	}

	// main method
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(5));
	}
}
