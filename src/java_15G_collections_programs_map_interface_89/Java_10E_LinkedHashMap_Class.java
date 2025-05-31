package java_15G_collections_programs_map_interface_89;

//Iterating over LinkedHashMap
import java.util.LinkedHashMap;
import java.util.Map;

public class Java_10E_LinkedHashMap_Class {

	public static void main(String args[]) {

		// Initialization of a LinkedHashMap
		// using Generics
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		// Inserting elements into Map
		// using put() method
		lhm.put(3, "Geeks");
		lhm.put(2, "For");
		lhm.put(1, "Geeks");

		// For-each loop for traversal over Map
		for (Map.Entry<Integer, String> mapElement : lhm.entrySet()) {

			Integer k = mapElement.getKey();

			// Finding the value
			// using getValue() method
			String v = mapElement.getValue();

			// Printing the key-value pairs
			System.out.println(k + " : " + v);
		}
	}
}