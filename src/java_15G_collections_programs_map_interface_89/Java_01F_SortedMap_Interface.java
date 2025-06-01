package java_15G_collections_programs_map_interface_89;

//Java program to iterate through SortedMap 

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Java_01F_SortedMap_Interface {

	public static void main(String args[]) {

		// Initialization of a SortedMap
		// using Generics
		SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

		// Inserting the Elements
		tm.put(3, "Geeks");
		tm.put(2, "For");
		tm.put(1, "Geeks");

		for (Map.Entry mapElement : tm.entrySet()) {
			int key = (int) mapElement.getKey();

			// Finding the value
			String value = (String) mapElement.getValue();

			System.out.println(key + " : " + value);
		}
	}
}
