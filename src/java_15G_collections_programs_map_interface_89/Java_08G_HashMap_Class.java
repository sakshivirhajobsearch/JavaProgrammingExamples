package java_15G_collections_programs_map_interface_89;

import java.util.HashMap;
import java.util.Map;

public class Java_08G_HashMap_Class {

	public static void main(String args[]) {

		// Initialization of a HashMap
		Map<Integer, String> hm = new HashMap<Integer, String>();

		// Add elements using put method
		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");
		hm.put(4, "For");

		// Initial HashMap
		System.out.println("Mappings of HashMap are : " + hm);

		// remove element with a key
		// using remove method
		hm.remove(4);

		// Final HashMap
		System.out.println("Mappings after removal are : " + hm);
	}
}