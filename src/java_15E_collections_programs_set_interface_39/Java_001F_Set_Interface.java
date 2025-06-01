package java_15E_collections_programs_set_interface_39;

//Java Program Demonstrating Working of Set by
//Removing Element/s from the Set

//Importing all utility classes
import java.util.HashSet;
import java.util.Set;

//Main class
public class Java_001F_Set_Interface {

	// Main driver method
	public static void main(String[] args) {
		
		// Declaring object of Set of type String
		Set<String> h = new HashSet<String>();

		// Elements are added
		// using add() method

		// Custom input elements
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("B");
		h.add("D");
		h.add("E");

		// Printing initial Set elements
		System.out.println("Initial HashSet " + h);

		// Removing custom element
		// using remove() method
		h.remove("B");

		// Printing Set elements after removing an element
		// and printing updated Set elements
		System.out.println("After removing element " + h);
	}
}
