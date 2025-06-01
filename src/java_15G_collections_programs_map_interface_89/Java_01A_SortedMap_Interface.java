package java_15G_collections_programs_map_interface_89;

//Java program to demonstartes 
//basic operations on SortedMap

import java.util.SortedMap;
import java.util.TreeMap;

public class Java_01A_SortedMap_Interface {

	public static void main(String[] args) {

		SortedMap<String, Integer> s = new TreeMap<>();

		// Adding elements to the sorted map
		s.put("A", 1);
		s.put("C", 3);
		s.put("B", 2);

		System.out.println("SortedMap: " + s);

		// Getting values from the sorted map
		int ans = s.get("A");
		System.out.println("Value of A: " + ans);

		// Removing elements from the sorted map
		s.remove("B");

		System.out.println("Updated SortedMap After removal:" + s);
	}
}
