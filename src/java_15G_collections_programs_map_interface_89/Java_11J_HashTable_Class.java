package java_15G_collections_programs_map_interface_89;

//Traversing the Hashtable

import java.util.Hashtable;
import java.util.Map;

public class Java_11J_HashTable_Class {

	public static void main(String[] args) {

		// Create an instance of Hashtable
		Hashtable<String, Integer> ht = new Hashtable<>();

		// Adding elements using put method
		ht.put("vishal", 10);
		ht.put("sachin", 30);
		ht.put("vaibhav", 20);

		// Iterating using enhanced for loop
		for (Map.Entry<String, Integer> e : ht.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}
}