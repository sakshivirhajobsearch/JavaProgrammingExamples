package java_15A_collections_programs_40;

//Java program to Illustrate Reversal of Array
//using reverse() method of Collections class

//Importing utility classes
import java.util.Arrays;
import java.util.Collections;

//Main class
public class Java_07C_Reverse_A_Collection {

	// Main driver method
	public static void main(String[] args) {

		// Creating input integer array
		Integer arr[] = { 10, 20, 30, 40, 50 };

		// Print elements of array
		System.out.println("Original Array : " + Arrays.toString(arr));

		// Reversing elements of array using reverse()
		// method of Collections class and fetching as
		// list via asList()
		Collections.reverse(Arrays.asList(arr));

		// Print and display reverse updated array
		System.out.println("Modified Array : " + Arrays.toString(arr));
	}
}