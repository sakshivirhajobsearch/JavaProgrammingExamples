package java_15G_collections_programs_map_interface_89;

import java.util.Hashtable;

public class Java_11G_HashTable_Class {

	public static void main(String args[]) {

		// No need to mention the
		// Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>();

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

		// Inserting the Elements
		ht1.put(1, "Geeks");
		ht1.put(2, "For");
		ht1.put(3, "Geeks");

		ht2.put(1, "Geeks");
		ht2.put(2, "For");
		ht2.put(3, "Geeks");

		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}