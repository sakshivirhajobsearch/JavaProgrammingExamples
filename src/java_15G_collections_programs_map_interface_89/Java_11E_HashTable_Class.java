package java_15G_collections_programs_map_interface_89;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Java_11E_HashTable_Class {

	public static void main(String args[]) {

		// No need to mention the
		// Generic type twice
		Map<Integer, String> hm = new HashMap<>();

		// Inserting the Elements
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);

		// Print mappings to the console

		System.out.println("Mappings of ht2 : " + ht2);
	}
}