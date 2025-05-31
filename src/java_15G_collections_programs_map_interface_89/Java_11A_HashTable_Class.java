package java_15G_collections_programs_map_interface_89;

import java.util.Hashtable;

public class Java_11A_HashTable_Class {

	public static void main(String args[]) {

		// Create a Hashtable of String
		// keys and Integer values
		Hashtable<String, Integer> ht = new Hashtable<>();

		// Adding elements to the Hashtable
		ht.put("One ", 1);
		ht.put("Two ", 2);
		ht.put("Three ", 3);

		// Displaying the Hashtable elements
		System.out.println("Hashtable Elements: " + ht);
	}
}