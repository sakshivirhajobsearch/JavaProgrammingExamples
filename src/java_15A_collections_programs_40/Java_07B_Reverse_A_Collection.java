package java_15A_collections_programs_40;

//Java program to illustrate reverse() method
//of Collections class over LinkedList

//Importing utility classes
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Main class
public class Java_07B_Reverse_A_Collection {

	// main driver method
	public static void main(String[] args) {

		// Let us create a list of strings
		List<String> mylist = new LinkedList<String>();

		// Adding elements to the List
		// Custom input elements
		mylist.add("practice");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");

		// Print all elements originally
		System.out.println("Original List : " + mylist);

		// Using reverse() method to
		// reverse the element order of mylist
		Collections.reverse(mylist);

		// Print all elements of list in reverse order
		// using reverse() method
		System.out.println("Modified List: " + mylist);
	}
}