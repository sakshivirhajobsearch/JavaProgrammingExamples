package java_15A_collections_programs_40;

//Java program to demonstrate the
//working of a HashMap
import java.util.HashMap;
import java.util.Map;

public class Java_01K_Use_Different_Types_Of_Collection_Set_Interface_HashMap {

	// Main Method
	public static void main(String args[]) {

		// Creating HashMap and
		// adding elements
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");

		// Finding the value for a key
		System.out.println("Value for 1 is " + hm.get(1));

		// Traversing through the HashMap
		for (Map.Entry<Integer, String> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}
}