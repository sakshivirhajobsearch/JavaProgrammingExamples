package java_01_basic_programs_53;

public class Java_08A_Find_Largest_Among_3_Numbers_Approach_1 {

	// Function to find the biggest of three numbers
	static int biggestOfThree(int x, int y, int z) {

		return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
	}

	public static void main(String[] args) {

		// Declaring variables for 3 numbers
		int a, b, c;

		// Variable holding the largest number
		int largest;
		a = 5;
		b = 10;
		c = 3;
		// Calling the above function in main
		largest = biggestOfThree(a, b, c);

		// Printing the largest number
		System.out.println(largest + " is the largest number.");
	}
}