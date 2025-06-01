package java_15G_collections_programs_map_interface_89;

//Java Program Implementing HashMap

import java.util.HashMap;
import java.util.Map;

public class Java_001A_Map_Interface {

	public static void main(String[] args) {

		// Create a Map using HashMap
		Map<String, Integer> m = new HashMap<>();

		// Adding key-value pairs to the map
		m.put("Geek1", 1);
		m.put("Geek2", 2);
		m.put("Geek3", 3);

		System.out.println("Map elements: " + m);
	}
}
