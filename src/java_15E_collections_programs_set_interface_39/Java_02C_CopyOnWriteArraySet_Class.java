package java_15E_collections_programs_set_interface_39;

//Iterate over a CopyOnWriteArraySet 
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class Java_02C_CopyOnWriteArraySet_Class {

	public static void main(String[] args) {

		// Creating an instance of CopyOnWriteArraySet
		CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

		// Adding elements using add() method
		s.add("GeeksforGeeks");

		// Creating an iterator after adding the elements
		Iterator<String> i = s.iterator();

		// Display message
		System.out.println("Set contains:");

		// Printing the contents of the set to the console
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Re-initialize the iterator
		// to start iteration again
		i = s.iterator();

		System.out.println("Set contains after re-iteration:");

		// Printing the elements to the console
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}