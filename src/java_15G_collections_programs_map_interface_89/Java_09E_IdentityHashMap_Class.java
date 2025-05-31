package java_15G_collections_programs_map_interface_89;

//Java code to illustrate the accessing
//elements from IdentityHashMap
import java.util.IdentityHashMap;
import java.util.Map;

public class Java_09E_IdentityHashMap_Class {

	public static void main(String[] args) {

		// Creating an empty IdentityHashMap
		Map<Integer, String> identity_hash = new IdentityHashMap<Integer, String>();

		// Mapping string values to int keys
		identity_hash.put(10, "Geeks");
		identity_hash.put(15, "4");
		identity_hash.put(20, "Geeks");
		identity_hash.put(25, "Welcomes");
		identity_hash.put(30, "You");

		// Displaying the IdentityHashMap
		System.out.println("Initial Mappings are: " + identity_hash);

		// Getting the value of 25
		System.out.println("The Value is: " + identity_hash.get(25));

		// Getting the value of 10
		System.out.println("The Value is: " + identity_hash.get(10));

		// Using keySet() to get the set view of keys
		System.out.println("The set is: " + identity_hash.keySet());

		// Using entrySet() to get the set view
		System.out.println("The set is: " + identity_hash.entrySet());
	}
}
