package java_15G_collections_programs_map_interface_89;

//Java Program to Demonstrate
//Working of Map interface

//Importing required classes

import java.util.HashMap;
import java.util.Map;

//Main class
public class Java_001B_Map_Interface {

	// Main driver method
	public static void main(String args[]) {

		// Creating an empty HashMap
		Map<String, Integer> hm = new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me : hm.entrySet()) {

			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
}