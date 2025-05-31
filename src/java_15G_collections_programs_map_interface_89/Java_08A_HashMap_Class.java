package java_15G_collections_programs_map_interface_89;

import java.util.HashMap;

//Main class
//To add elements to HashMap
public class Java_08A_HashMap_Class {

	// Main driver method
	public static void main(String args[]) {

		// No need to mention the
		// Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();

		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		// Adding elements using put method
		// Custom input elements
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");

		// Print and display mapping of HashMap 1
		System.out.println("Mappings of HashMap hm1 are : " + hm1);

		// Print and display mapping of HashMap 2
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
	}
}