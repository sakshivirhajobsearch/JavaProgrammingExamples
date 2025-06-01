package java_15E_collections_programs_set_interface_39;

//Java code to demonstrate Working of Set by
//Accessing the Elements of the Set object

//Importing all utility classes
import java.util.HashSet;
import java.util.Set;

//Main class
public class Java_001E_Set_Interface {

	// Main driver method
	public static void main(String[] args) {
		
		// Creating an object of Set and
		// declaring object of type String
		Set<String> h = new HashSet<String>();

		// Elements are added using add() method
		// Later onwards we will show accessing the same

		// Custom input elements
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("A");

		// Print the Set object elements
		System.out.println("Set is " + h);

		// Declaring a string
		String s = "D";

		// Check if the above string exists in
		// the SortedSet or not
		// using contains() method
		System.out.println("Contains " + s + " " + h.contains(s));
	}
}
