package java_15E_collections_programs_set_interface_39;

//Java Program to demonstrates 
//the working of put()
import java.util.concurrent.ConcurrentHashMap;

public class Java_04C_ConcurrentHashMap_Class {

	public static void main(String[] args) {

		// Create ConcurrentHashMap
		ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<>();

		// Add elements to map
		map1.put("1", "One");
		map1.put("2", "Two");
		map1.put("3", "Three");
		map1.put("4", "Four");
		map1.put("5", "Five");
		map1.put("6", "Six");

		// Print map1
		System.out.println("map1: " + map1);

		// Create a new map and copy all entries from map1
		ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<>(map1);

		// Print map2
		System.out.println("map2: " + map2);
	}
}