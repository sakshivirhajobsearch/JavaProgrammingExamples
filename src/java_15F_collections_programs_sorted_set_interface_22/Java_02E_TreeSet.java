package java_15F_collections_programs_sorted_set_interface_22;

//Java Program to Illustrate Working of TreeSet

//Importing utility classes
import java.util.Set;
import java.util.TreeSet;

//Main class
public class Java_02E_TreeSet {

	// Main driver method
	public static void main(String[] args) {

		// Creating an object of Set with reference to
		// TreeSet class

		// Note: You can refer above media if geek
		// is confused in programs why we are not
		// directly creating TreeSet object
		Set<String> ts = new TreeSet<>();

		// Adding elements in above object
		// using add() method
		ts.add("Geek");
		ts.add("For");
		ts.add("Geeks");
		ts.add("A");
		ts.add("B");
		ts.add("Z");

		// Now we will be using for each loop in order
		// to iterate through the TreeSet
		for (String value : ts)

			// Printing the values inside the object
			System.out.print(value + ", ");

		System.out.println();
	}
}