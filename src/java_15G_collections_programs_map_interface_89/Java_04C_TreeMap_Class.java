package java_15G_collections_programs_map_interface_89;

//Java Program to Demonstrate TreeMap
//using the Default Constructor
import java.util.TreeMap;

public class Java_04C_TreeMap_Class {

	// To show TreeMap constructor
	static void Constructor() {
		
		// Creating an empty TreeMap
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		// Mapping string values to int
		// keys using put() method
		tm.put(10, "Geeks");
		tm.put(15, "For");
		tm.put(20, "Geeks");

		// Printing the elements of TreeMap
		System.out.println("TreeMap: " + tm);
	}

	public static void main(String[] args) {
		
		System.out.println("TreeMap using TreeMap() constructor");

		// Calling constructor
		Constructor();
	}
}