package java_01_basic_programs_53;

//Java program to find GCD of two 
//numbers using Euclidean algorithm 
public class Java_10B_Find_GCD_Or_HCF_Of_2_Numbers_Approach_2 {

	// Function to return gcd of x and y
	// recursively
	static int GCD(int x, int y) {
		
		if (y == 0)
			return x;
		return GCD(y, x % y);
	}

	public static void main(String[] args) {
		
		int x = 47, y = 91;
		System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y));
	}
}
