package java_15G_collections_programs_map_interface_89;

//Java Program to remove an element from a TreeMap 
import java.util.TreeMap;

public class Java_04I_TreeMap_Class {

	public static void main(String args[]) {

		// Initialization of a TreeMap using Generics
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		// Inserting the elements using put() method
		tm.put(3, "Java");
		tm.put(2, "C++");
		tm.put(1, "Pyhton");
		tm.put(4, "JS");

		// Printing all elements of Map
		System.out.println(tm);

		// Removing the element corresponding to key
		tm.remove(4);

		// Printing updated TreeMap
		System.out.println(tm);
	}
}