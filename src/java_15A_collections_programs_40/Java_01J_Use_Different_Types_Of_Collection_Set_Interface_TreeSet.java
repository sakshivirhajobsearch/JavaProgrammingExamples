package java_15A_collections_programs_40;

//Java program to demonstrate the
//working of a TreeSet
import java.util.Iterator;
import java.util.TreeSet;

public class Java_01J_Use_Different_Types_Of_Collection_Set_Interface_TreeSet {

	// Main Method
	public static void main(String args[]) {

		// Creating TreeSet and
		// adding elements
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Geeks");
		ts.add("For");
		ts.add("Geeks");
		ts.add("Is");
		ts.add("Very helpful");

		// Traversing elements
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}