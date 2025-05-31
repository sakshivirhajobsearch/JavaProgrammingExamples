package java_15G_collections_programs_map_interface_89;

import java.util.Hashtable;

public class Java_11H_HashTable_Class {

	public static void main(String args[]) {

		// Initialization of a Hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		// Inserting the Elements
		ht.put(1, "Geeks");
		ht.put(2, "Geeks");
		ht.put(3, "Geeks");

		// print initial map to the console
		System.out.println("Initial Map " + ht);

		// Update the value at key 2
		ht.put(2, "For");

		// print the updated map
		System.out.println("Updated Map " + ht);
	}
}