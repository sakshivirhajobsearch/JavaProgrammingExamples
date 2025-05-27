package java_01_basic_programs_53;

public class Java_20A_Find_The_Perimeter_Of_A_Rectangle {

	// Method to calculate the perimeter of the rectangle
	// with given length and breadth
	static void perimeter(int length, int breadth) {

		// Calculate the 'perimeter' using the formula
		int perimeter = 2 * (length + breadth);

		System.out.println("The perimeter of the given rectangle of length " + length + " and breadth " + breadth
				+ " = " + perimeter);
	}

	public static void main(String[] args) {

		// Initialize a variable length that stores length of
		// the given rectangle
		int length = 10;

		// Initialize a variable breadth that stores breadth
		// of the given rectangle
		int breadth = 20;

		// Call the perimeter method on these length and
		// breadth
		perimeter(length, breadth);
	}
}
