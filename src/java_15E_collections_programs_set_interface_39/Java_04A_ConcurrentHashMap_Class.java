package java_15E_collections_programs_set_interface_39;

//Java Program to demosntrates the 
//working of ConcurrentHashMap
import java.util.concurrent.ConcurrentHashMap;

public class Java_04A_ConcurrentHashMap_Class {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		// Adding elements to the map
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		System.out.println("Map size: " + map.size());

		// Getting values from the map
		System.out.println("Value of A: " + map.get("A"));

		// Removing elements from the map
		map.remove("B");
		System.out.println("After removal map size is: " + map.size());
	}
}
