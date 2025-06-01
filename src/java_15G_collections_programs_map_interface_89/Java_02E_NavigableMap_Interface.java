package java_15G_collections_programs_map_interface_89;

//Java Program to demosntrates 
//how to access elemets in NavigableMap

import java.util.NavigableMap;
import java.util.TreeMap;

public class Java_02E_NavigableMap_Interface {

	public static void main(String[] args) {

		// Instantiate an object
		// Since NavigableMap is an interface
		// We use TreeMap

		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();

		// Add elements using put()
		map.put(3, "Third");
		map.put(2, "Second");
		map.put(1, "First");
		map.put(4, "Fourth");

		// Accessing the elements using get()
		// with key as a parameter
		System.out.println(map.get(1));
		System.out.println(map.get(3));

		System.out.println("NavigableMap: " + map.keySet());
	}
}