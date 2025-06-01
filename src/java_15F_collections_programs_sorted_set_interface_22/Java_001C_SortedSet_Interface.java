package java_15F_collections_programs_sorted_set_interface_22;

// Java code to demonstrate
// the working of SortedSet
import java.util.SortedSet;
import java.util.TreeSet;

public class Java_001C_SortedSet_Interface {

	public static void main(String[] args) {
		
		SortedSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");

		System.out.println(ts);
	}
}