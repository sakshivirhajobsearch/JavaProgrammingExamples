package java_15G_collections_programs_map_interface_89;

//Adding Elements to a LinkedHashMap
import java.util.LinkedHashMap;

public class Java_10B_LinkedHashMap_Class {

	public static void main(String args[]) {

		// Initialization of a LinkedHashMap
		// using Generics
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		// Add mappings to Map
		// using put() method
		lhm.put(3, "Geeks");
		lhm.put(2, "For");
		lhm.put(1, "Geeks");

		// Printing mappings to the console
		System.out.println("" + lhm);
	}
}
