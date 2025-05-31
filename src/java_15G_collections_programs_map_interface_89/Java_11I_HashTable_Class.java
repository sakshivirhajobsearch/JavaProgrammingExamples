package java_15G_collections_programs_map_interface_89;

import java.util.Hashtable;
import java.util.Map;

public class Java_11I_HashTable_Class {

	public static void main(String args[]) {

		// Initialization of a Hashtable
		Map<Integer, String> ht = new Hashtable<Integer, String>();

		// Inserting the Elements
		// using put method
		ht.put(1, "Geeks");
		ht.put(2, "For");
		ht.put(3, "Geeks");
		ht.put(4, "For");

		// Initial HashMap
		System.out.println("Initial map : " + ht);

		// Remove the map entry with key 4
		ht.remove(4);

		// Final Hashtable
		System.out.println("Updated map : " + ht);
	}
}