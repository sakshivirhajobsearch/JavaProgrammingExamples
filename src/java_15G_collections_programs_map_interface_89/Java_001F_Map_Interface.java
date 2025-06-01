package java_15G_collections_programs_map_interface_89;

//Java program to demonstrate
//the working of Map interface

import java.util.HashMap;
import java.util.Map;

public class Java_001F_Map_Interface {

	public static void main(String args[]) {

		// Default Initialization of a
		// Map
		Map<Integer, String> hm1 = new HashMap<>();

		// Initialization of a Map
		// using Generics
		Map<Integer, String> hm2 = new HashMap<Integer, String>();

		// Inserting the Elements
		hm1.put(1, "Geeks");
		hm1.put(2, "For");
		hm1.put(3, "Geeks");

		hm2.put(new Integer(1), "Geeks");
		hm2.put(new Integer(2), "For");
		hm2.put(new Integer(3), "Geeks");

		System.out.println(hm1);
		System.out.println(hm2);
	}
}