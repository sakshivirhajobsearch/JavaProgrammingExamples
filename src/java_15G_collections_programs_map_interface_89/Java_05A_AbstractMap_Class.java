package java_15G_collections_programs_map_interface_89;

//Java Program to demonstrate adding
//elements to the AbstractMap
import java.util.AbstractMap;
import java.util.HashMap;

public class Java_05A_AbstractMap_Class {

	public static void main(String[] args) {

		// Since AbstractMap is an abstract class
		// create object using HashMap
		AbstractMap<Integer, String> absMap = new HashMap<Integer, String>();

		// Adding values to the AbstractMap
		// Note that we do not create an object of
		// AbstractMap
		absMap.put(1, "This");
		absMap.put(2, "is");
		absMap.put(3, "an");
		absMap.put(4, "AbstractMap");

		// Displaying the mappings using
		// entrySet() to get the set view
		System.out.println("The Set view of the mappings:");
		System.out.println(absMap.entrySet());
	}
}