package java_15G_collections_programs_map_interface_89;

//Java Program to illustrate the Hashmap Class

//Importing required classes

import java.util.HashMap;
import java.util.Map;

//Main class
public class Java_001C_Map_Interface {

	// Main driver method
	public static void main(String[] args) {

		// Creating an empty HashMap
		Map<String, Integer> m = new HashMap<>();

		// Inserting entries in the Map
		// using put() method
		m.put("Sweta", 10);
		m.put("Amiya", 30);
		m.put("Gudly", 20);

		// Iterating over Map
		for (Map.Entry<String, Integer> e : m.entrySet())

			System.out.println(e.getKey() + " " + e.getValue());
	}
}