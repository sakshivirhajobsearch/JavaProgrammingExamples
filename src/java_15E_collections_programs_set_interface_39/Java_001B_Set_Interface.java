package java_15E_collections_programs_set_interface_39;

//Java program Illustrating Set Interface

//Importing utility classes
import java.util.HashSet;
import java.util.Set;

//Main class 
public class Java_001B_Set_Interface {

	// Main driver method
	public static void main(String[] args) {
		
		// Demonstrating Set using HashSet
		// Declaring object of type String
		Set<String> s = new HashSet<String>();

		// Adding elements to the Set
		// using add() method
		s.add("Geeks");
		s.add("For");
		s.add("Geeks");
		s.add("Example");
		s.add("Set");

		// Printing elements of HashSet object
		System.out.println(s);
	}
}