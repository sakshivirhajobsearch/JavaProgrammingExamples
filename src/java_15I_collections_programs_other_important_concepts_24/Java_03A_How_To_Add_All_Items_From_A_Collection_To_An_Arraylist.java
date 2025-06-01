package java_15I_collections_programs_other_important_concepts_24;

//Java Program to add all items
//from a collection to an ArrayList
//using addAll() method

import java.util.ArrayList;
import java.util.Collection;

public class Java_03A_How_To_Add_All_Items_From_A_Collection_To_An_Arraylist {

	public static void main(String[] args) {

		// Create a Collection
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("B");
		c.add("C");

		// Create an ArrayList
		ArrayList<String> al = new ArrayList<>();

		// Add all items from the collection
		// to the ArrayList
		al.addAll(c);

		// Print the ArrayList
		System.out.println(al);
	}
}
