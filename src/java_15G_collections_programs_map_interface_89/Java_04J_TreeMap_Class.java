package java_15G_collections_programs_map_interface_89;

//Java Program to demonstrates the use of for-each loop to
//iterate over the elements of a TreeMap
import java.util.Map;
import java.util.TreeMap;

public class Java_04J_TreeMap_Class {

	public static void main(String args[]) {

		// Initialization of TreeMap
		TreeMap<Integer, String> tm = new TreeMap<>();

		// Inserting elements
		tm.put(3, "Geeks");
		tm.put(2, "For");
		tm.put(1, "Geeks");

		// For-each loop for traversal over entrySet()
		for (Map.Entry<Integer, String> e : tm.entrySet()) {
			int k = e.getKey();
			String v = e.getValue();

			// Printing the key and value
			System.out.println(k + " : " + v);
		}
	}
}