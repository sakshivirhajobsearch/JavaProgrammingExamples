package java_15A_collections_programs_40;

//Java program to demonstrate the
//working of a HashSet
import java.util.HashSet;
import java.util.Iterator;

public class Java_01H_Use_Different_Types_Of_Collection_Set_Interface_HashSet {

	// Main Method
	public static void main(String args[]) {

		// Creating HashSet and
		// adding elements
		HashSet<String> hs = new HashSet<String>();

		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("Is");
		hs.add("Very helpful");

		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
