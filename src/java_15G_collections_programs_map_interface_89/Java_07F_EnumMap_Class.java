package java_15G_collections_programs_map_interface_89;

//Java program to Remove Elements of EnumMap
import java.util.EnumMap;

public class Java_07F_EnumMap_Class {

	enum Color {

		// Custom elements
		RED, GREEN, BLUE, WHITE
	}

	public static void main(String[] args) {

		// Creating an EnumMap of the Color enum
		EnumMap<Color, Integer> e = new EnumMap<>(Color.class);

		// Inserting elements in the Map
		// using put() method
		e.put(Color.RED, 1);
		e.put(Color.GREEN, 2);
		e.put(Color.BLUE, 3);
		e.put(Color.WHITE, 4);

		// Printing e in the EnumMap
		System.out.println("EnumMap e : " + e);

		// Removing a mapping
		// using remove() Method
		int i = e.remove(Color.WHITE);

		// Displaying the removed value
		System.out.println("Removed Value: " + i);

		// Removing specific color and storing boolean
		// if removed or not
		boolean b = e.remove(Color.RED, 1);

		// Printing the boolean result whether removed or
		// not
		System.out.println("Is the entry {RED=1} removed? " + b);

		// Printing the updated Map to the console
		System.out.println("Updated EnumMap: " + e);
	}
}