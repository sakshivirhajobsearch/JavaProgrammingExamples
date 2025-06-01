package java_15A_collections_programs_40;

//Java program to demonstrate the
//working of a LinkedHashSet
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Java_01I_Use_Different_Types_Of_Collection_Set_Interface_LinkedHashSet {

	// Main Method
	public static void main(String args[]) {

		// Creating LinkedHashSet and
		// adding elements
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("Geeks");
		lhs.add("For");
		lhs.add("Geeks");
		lhs.add("Is");
		lhs.add("Very helpful");

		// Traversing elements
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
