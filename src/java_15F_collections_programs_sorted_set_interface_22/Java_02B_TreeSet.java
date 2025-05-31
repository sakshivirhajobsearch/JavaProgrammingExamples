package java_15F_collections_programs_sorted_set_interface_22;

//Java code to Illustrate Addition of Elements to TreeSet

//Importing utility classes
import java.util.Set;
import java.util.TreeSet;

//Main class
public class Java_02B_TreeSet {

	// Main driver method
	public static void main(String[] args) {

		// Creating a Set interface with
		// reference to TreeSet class
		// Declaring object of string type
		Set<String> ts = new TreeSet<>();

		// Elements are added using add() method
		ts.add("Geek");
		ts.add("For");
		ts.add("Geeks");

		// Print all elements inside object
		System.out.println(ts);
	}
}