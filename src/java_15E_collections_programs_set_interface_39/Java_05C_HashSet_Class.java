package java_15E_collections_programs_set_interface_39;

//Removing Elements in HashSet
import java.util.HashSet;

public class Java_05C_HashSet_Class {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		// Adding elements to above Set
		// using add() method
		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");
		hs.add("A");
		hs.add("B");
		hs.add("Z");

		// Printing the elements of HashSet elements
		System.out.println("HashSet : " + hs);

		// Removing the element B
		hs.remove("B");

		// Printing the updated HashSet elements
		System.out.println("HashSet after removing element : " + hs);

		// Returns false if the element is not present
		System.out.println("B exists in Set : " + hs.remove("B"));
	}
}
