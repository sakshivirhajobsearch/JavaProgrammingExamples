package java_15G_collections_programs_map_interface_89;

import java.util.SortedMap;
import java.util.TreeMap;

public class Java_01E_SortedMap_Interface {

	public static void main(String args[]) {

		// Initialization of a SortedMap
		// using Generics
		SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

		// Inserting the Elements
		tm.put(3, "Geeks");
		tm.put(2, "Geeks");
		tm.put(1, "Geeks");
		tm.put(4, "For");

		System.out.println(tm);

		tm.remove(4);

		System.out.println(tm);
	}
}