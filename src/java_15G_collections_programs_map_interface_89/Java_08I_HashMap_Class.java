package java_15G_collections_programs_map_interface_89;

//Java program to traversal a
//Java.util.HashMap

import java.util.HashMap;
import java.util.Map;

public class Java_08I_HashMap_Class {

	public static void main(String[] args) {

		// initialize a HashMap
		HashMap<String, Integer> map = new HashMap<>();

		// Add elements using put method
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Iterate the map using
		// for-each loop
		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
	}
}