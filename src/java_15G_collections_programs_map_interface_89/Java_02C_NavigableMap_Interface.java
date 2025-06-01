package java_15G_collections_programs_map_interface_89;

//Java program for adding elements
//to a NavigableMap

import java.util.NavigableMap;
import java.util.TreeMap;

public class Java_02C_NavigableMap_Interface {

	public static void main(String args[]) {

		// Instantiate an object
		// Since NavigableMap is an interface
		// We use TreeMap
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();

		// Add elements using put()
		map.put(3, "Geeks");
		map.put(2, "For");
		map.put(1, "Geeks");

		System.out.println("NavigableMap: " + map);
	}
}