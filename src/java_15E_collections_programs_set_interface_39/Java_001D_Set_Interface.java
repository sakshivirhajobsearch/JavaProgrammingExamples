package java_15E_collections_programs_set_interface_39;

//Java Program Demonstrating Working of Set by
//Adding elements using add() method 

//Importing all utility classes
import java.util.HashSet;
import java.util.Set;

//Main class
public class Java_001D_Set_Interface {

	// Main driver method
	public static void main(String[] args) {
		
		// Creating an object of Set and
		// declaring object of type String
		Set<String> s = new HashSet<String>();

		// Adding elements to above object
		// using add() method
		s.add("B");
		s.add("B");
		s.add("C");
		s.add("A");

		// Printing the elements inside the Set object
		System.out.println(s);
	}
}
