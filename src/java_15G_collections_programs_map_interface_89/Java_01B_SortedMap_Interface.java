package java_15G_collections_programs_map_interface_89;

//Java Program to demonstrates 
//how to use a SortedMap

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Java_01B_SortedMap_Interface {

	public static void main(String[] args) {

		// Create a SortedMap using TreeMap
		SortedMap<Integer, String> sm = new TreeMap<>();

		// Adding key-value pairs to the SortedMap
		sm.put(2, "Java");
		sm.put(3, "C++");
		sm.put(1, "Python");
		sm.put(4, "Js");

		// Get entry set
		Set<Map.Entry<Integer, String>> s = sm.entrySet();

		// Using iterator to traverse the SortedMap
		Iterator<Map.Entry<Integer, String>> i = s.iterator();

		// Traversing the map (sorted by keys)
		while (i.hasNext()) {
			Map.Entry<Integer, String> entry = i.next();
			int k = entry.getKey();
			String v = entry.getValue();

			System.out.println("Key: " + k + " value: " + v);
		}
	}
}