package java_15F_collections_programs_sorted_set_interface_22;

// Java Program to demonstrate
// the working of SortedSet
import java.util.SortedSet;
import java.util.TreeSet;

public class Java_001D_SortedSet_Interface {

	public static void main(String[] args) {

		SortedSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");

		System.out.println("Sorted Set is: " + ts);

		String check = "D";

		// Check if the above string exists in
		// the SortedSet or not
		System.out.println("Contains: " + check + " " + ts.contains(check));

		// Print the first element in
		// the SortedSet
		System.out.println("First Value: " + ts.first());

		// Print the last element in
		// the SortedSet
		System.out.println("Last Value: " + ts.last());
	}
}