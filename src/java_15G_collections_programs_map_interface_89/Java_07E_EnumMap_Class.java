package java_15G_collections_programs_map_interface_89;

//Java Program to Access the Elements of EnumMap
import java.util.EnumMap;

public class Java_07E_EnumMap_Class {

	// Enum
	enum Color {
		RED, GREEN, BLUE, WHITE
	}

	public static void main(String[] args) {

		// Creating an EnumMap of the Color enum
		EnumMap<Color, Integer> e = new EnumMap<>(Color.class);

		// Inserting elements using put() method
		e.put(Color.RED, 1);
		e.put(Color.GREEN, 2);
		e.put(Color.BLUE, 3);
		e.put(Color.WHITE, 4);

		System.out.println("EnumMap: " + e);

		// Using the entrySet() method
		System.out.println("Key-Value mappings: " + e.entrySet());

		// Using the keySet() method
		System.out.println("Keys: " + e.keySet());

		// Using the values() method
		System.out.println("Values: " + e.values());

		// Using the get() method
		System.out.println("Value of RED : " + e.get(Color.RED));
	}
}