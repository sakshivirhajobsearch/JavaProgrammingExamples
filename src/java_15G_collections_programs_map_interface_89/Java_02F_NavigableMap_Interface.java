package java_15G_collections_programs_map_interface_89;

//Java Program to traverse a NavigableMap

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Java_02F_NavigableMap_Interface {

	public static void main(String args[]) {

		// Instantiate an object
		// Since NavigableMap is an interface
		// We use TreeMap
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();

		// Add elements using put()
		map.put(3, "Geeks");
		map.put(2, "For");
		map.put(1, "Geeks");

		// Create an Iterator over the
		// NavigableMap
		Iterator<NavigableMap.Entry<Integer, String>> itr = map.entrySet().iterator();

		System.out.println("Traversing using Iterator: ");

		// The hasNext() method is used to check if there is
		// a next element The next() method is used to
		// retrieve the next element
		while (itr.hasNext()) {
			NavigableMap.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("Traversing using for-each: ");

		// Iterate using for-each loop
		for (Map.Entry mapElement : map.entrySet()) {

			// get the key using getKey()
			int key = (int) mapElement.getKey();

			// Finding the value
			String value = (String) mapElement.getValue();

			System.out.println("Key = " + key + ", Value = " + value);
		}
	}
}