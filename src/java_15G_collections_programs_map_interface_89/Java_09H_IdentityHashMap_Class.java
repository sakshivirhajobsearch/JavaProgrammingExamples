package java_15G_collections_programs_map_interface_89;

import java.util.IdentityHashMap;

public class Java_09H_IdentityHashMap_Class {

	public static void main(String[] args) {

		IdentityHashMap<String, Integer> map = new IdentityHashMap<>();

		// Add key-value pairs to the map
		String key1 = new String("key");
		String key2 = new String("key");
		map.put(key1, 1);
		map.put(key2, 2);

		// Get values from the map using the same and different keys
		System.out.println(map.get(key1)); // Output: 1
		System.out.println(map.get(key2)); // Output: 2
		System.out.println(map.get(new String("key"))); // Output: null
	}
}