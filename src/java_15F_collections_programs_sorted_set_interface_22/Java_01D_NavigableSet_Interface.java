package java_15F_collections_programs_sorted_set_interface_22;

//Java program to demonstrates the 
//working of contains(), first() and last() method
import java.util.NavigableSet;
import java.util.TreeSet;

public class Java_01D_NavigableSet_Interface {

	public static void main(String[] args) {

		NavigableSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");

		System.out.println("NavigableSet: " + ts);

		String s = "D";

		// Check if the above string exists in
		// the NavigableSet or not
		System.out.println("D exists in the NavigableSet?: " + ts.contains(s));

		// Print the first element in
		// the NavigableSet
		System.out.println("First Element of NavigableSet: " + ts.first());

		// Print the last element in
		// the NavigableSet
		System.out.println("Last Element of NavigableSet: " + ts.last());
	}
}
