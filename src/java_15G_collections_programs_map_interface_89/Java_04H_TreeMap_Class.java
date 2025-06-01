package java_15G_collections_programs_map_interface_89;

//Java program to Illustrate Updation of Elements
//in TreeMap using put() Method
import java.util.TreeMap;

public class Java_04H_TreeMap_Class {

	public static void main(String args[]) {

		// Initialization of a TreeMap using Generics
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		// Inserting the elements in Map using put() method
		tm.put(3, "Geeks");
		tm.put(2, "Geeks");
		tm.put(1, "Geeks");

		// Print all current elements in map
		System.out.println(tm);

		// Inserting the element at specified corresponding
		// to specified key
		tm.put(2, "For");

		// Printing the updated elements of Map
		System.out.println(tm);
	}
}