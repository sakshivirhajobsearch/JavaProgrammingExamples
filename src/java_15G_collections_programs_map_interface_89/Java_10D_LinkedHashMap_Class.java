package java_15G_collections_programs_map_interface_89;

//Removal of Elements from LinkedHashMap
import java.util.LinkedHashMap;

public class Java_10D_LinkedHashMap_Class {

	public static void main(String args[]) {

		// Initialization of a LinkedHashMap
		// using Generics
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		// Inserting the Elements
		// using put() method
		lhm.put(3, "Geeks");
		lhm.put(2, "Geeks");
		lhm.put(1, "Geeks");
		lhm.put(4, "For");

		// Printing the mappings to the console
		System.out.println("" + lhm);

		// Removing the mapping with Key 4
		lhm.remove(4);

		// Printing the updated map
		System.out.println("" + lhm);
	}
}