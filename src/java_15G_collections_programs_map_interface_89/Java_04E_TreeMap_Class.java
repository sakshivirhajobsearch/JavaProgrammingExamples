package java_15G_collections_programs_map_interface_89;

//Java Program to Demonstrate TreeMap
//using the TreeMap(Map M) Constructor
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Java_04E_TreeMap_Class {

	// Method To illustrate constructor<Map>
	static void Constructor() {

		// Creating an empty HashMap
		Map<Integer, String> m = new HashMap<Integer, String>();

		// Mapping string values to int
		// keys using put() method
		m.put(10, "Geeks");
		m.put(20, "For");
		m.put(30, "Geeks");

		// Creating the TreeMap using the Map
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(m);

		// Printing the elements of TreeMap
		System.out.println("TreeMap: " + tm);
	}

	public static void main(String[] args) {
		
		System.out.println("TreeMap using TreeMap(Map) Constructor");
		Constructor();
	}
}