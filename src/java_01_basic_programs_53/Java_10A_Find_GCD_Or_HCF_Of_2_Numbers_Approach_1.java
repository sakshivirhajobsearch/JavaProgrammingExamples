package java_01_basic_programs_53;

//Java program to find GCD of two numbers 
public class Java_10A_Find_GCD_Or_HCF_Of_2_Numbers_Approach_1 {

	// Gcd of x and y using recursive function
	static int GCD(int x, int y) {

		// Everything is divisible by 0
		if (x == 0)
			return y;
		if (y == 0)
			return x;

		// Both the numbers are equal
		if (x == y)
			return x;

		// x is greater
		if (x > y)
			return GCD(x - y, y);
		return GCD(x, y - x);
	}

	public static void main(String[] args) {

		int x = 100, y = 88;
		System.out.println("GCD of " + x + " and " + y + " is " + GCD(x, y));
	}
}
