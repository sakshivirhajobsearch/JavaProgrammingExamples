package java_15F_collections_programs_sorted_set_interface_22;

//Java Program to demonstrates the working of add()
import java.util.NavigableSet;
import java.util.TreeSet;

public class Java_01C_NavigableSet_Interface {

	public static void main(String[] args) {

		NavigableSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");

		System.out.println("NavigableSet: " + ts);
	}
}