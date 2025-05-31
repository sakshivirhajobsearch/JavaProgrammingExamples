package java_15G_collections_programs_map_interface_89;

//Java Program Demonstrate accessing
//elements of ConcurrentHashMap
import java.util.concurrent.ConcurrentHashMap;

public class Java_06E_ConcurrentHashMap_Class {

	public static void main(String[] args) {

		// create an instance of ConcurrentHashMap
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();

		// insert mappings using put method
		m.put(100, "Geeks");
		m.put(101, "for");
		m.put(102, "Geeks");
		m.put(103, "Contribute");

		// Displaying the HashMap

		System.out.println("ConcurrentHashMap:" + m);

		// Display the value of 100
		System.out.println("The Value associated to " + "100 is : " + m.get(100));

		// Getting the value of 103
		System.out.println("The Value associated to " + "103 is : " + m.get(103));
	}
}