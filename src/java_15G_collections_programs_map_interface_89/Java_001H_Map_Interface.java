package java_15G_collections_programs_map_interface_89;

//Java program to demonstrate
//the working of Map interface

import java.util.HashMap;
import java.util.Map;

public class Java_001H_Map_Interface {

	public static void main(String args[]) {

		// Initialization of a Map
		// using Generics
		Map<Integer, String> hm1 = new HashMap<Integer, String>();

		// Inserting the Elements
		hm1.put(new Integer(1), "Geeks");
		hm1.put(new Integer(2), "For");
		hm1.put(new Integer(3), "Geeks");
		hm1.put(new Integer(4), "For");

		System.out.println(hm1);

		hm1.remove(new Integer(4));

		System.out.println(hm1);
	}
}