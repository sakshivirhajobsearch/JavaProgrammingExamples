package java_15G_collections_programs_map_interface_89;

//Java Program to Illustrate the LinkedHashmap Class

import java.util.LinkedHashMap;
import java.util.Map;

public class Java_001D_Map_Interface {

	public static void main(String[] args) {

		// Creating an empty LinkedHashMap
		Map<String, Integer> m = new LinkedHashMap<>();

		// Inserting pair entries in above Map
		// using put() method
		m.put("Sweta", 10);
		m.put("Amiya", 30);
		m.put("Gusly", 20);

		// Iterating over Map
		for (Map.Entry<String, Integer> e : m.entrySet())

			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());
	}
}