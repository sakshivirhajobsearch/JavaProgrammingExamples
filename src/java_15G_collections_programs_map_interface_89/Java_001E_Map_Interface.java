package java_15G_collections_programs_map_interface_89;

//Java Program to Illustrate TreeMap Class

//Importing required classes

import java.util.Map;
import java.util.TreeMap;

//Main class
public class Java_001E_Map_Interface {

	// Main driver method
	public static void main(String[] args) {

		// Creating an empty TreeMap
		Map<String, Integer> m = new TreeMap<>();

		// Inserting custom elements in the Map
		// using put() method
		m.put("Sweta", 10);
		m.put("Amiya", 30);
		m.put("Gudly", 20);

		// Iterating over Map using for each loop
		for (Map.Entry<String, Integer> e : m.entrySet())

			System.out.println(e.getKey() + " " + e.getValue());
	}
}
