package java_15F_collections_programs_sorted_set_interface_22;

//Java Program to iterate through NavigableSet
import java.util.NavigableSet;
import java.util.TreeSet;

public class Java_01F_NavigableSet_Interface {

	public static void main(String[] args) {

		NavigableSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("A");
		ts.add("B");
		ts.add("Z");

		// Iterating though the NavigableSet
		for (String i : ts)
			System.out.print(i + ", ");
	}
}