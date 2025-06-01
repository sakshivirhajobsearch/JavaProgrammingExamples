package java_15A_collections_programs_40;

//Java Program to Get the Size of Collection and 
// Verify that Collection is Empty 
// using ArrayList class

import java.util.ArrayList;
import java.util.Collection;

public class Java_04B_Get_The_Size_Of_The_Collection {

	public static void main(String[] args) {

		Collection<String> arraylist = new ArrayList<String>();

		arraylist.add("Geeks");
		arraylist.add("for");
		arraylist.add("geeks");

		// returns the size of the arraylist
		System.out.println("Size of the collection " + arraylist.size());

		// Check if list is empty using isEmpty() method
		System.out.println("Is the ArrayList empty: " + arraylist.isEmpty());
	}
}