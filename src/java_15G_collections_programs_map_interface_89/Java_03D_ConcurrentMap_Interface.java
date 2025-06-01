package java_15G_collections_programs_map_interface_89;

//Java Program to demonstrates 
//the working of ConcurrentMap

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Java_03D_ConcurrentMap_Interface {

	public static void main(String[] args) {

		// Create a ConcurrentMap instance using
		// ConcurrentHashMap
		ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();

		// Adding key-value pairs using put()
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C++");

		System.out.println("ConcurrentMap: " + map);

		// Remove element with key 2
		map.remove(2);

		// Print the map contents after removal
		System.out.println("ConcurrentMap contents after removal: " + map);
	}
}
