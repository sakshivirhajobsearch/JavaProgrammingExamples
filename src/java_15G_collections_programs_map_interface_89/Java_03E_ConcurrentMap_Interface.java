package java_15G_collections_programs_map_interface_89;

//Java Program to demonstrate accessing elements

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Java_03E_ConcurrentMap_Interface {

	public static void main(String[] args) {

		// Instantiate an object
		// Since ConcurrentMap
		// is an interface so We use
		// ConcurrentSkipListMap
		ConcurrentMap<Integer, String> map = new ConcurrentSkipListMap<Integer, String>();

		// insert mappings using put method
		map.put(100, "Geeks");
		map.put(101, "for");
		map.put(102, "Geeks");

		// Displaying the HashMap
		System.out.println("The Mappings are: ");
		System.out.println(map);

		// Display the value of 100
		System.out.println("The Value associated to " + "100 is : " + map.get(100));

		// Getting the value of 103
		System.out.println("The Value associated to " + "101 is : " + map.get(101));
	}
}