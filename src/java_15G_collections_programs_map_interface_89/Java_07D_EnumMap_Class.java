package java_15G_collections_programs_map_interface_89;

//Java Program to add elements to an EnumMap
import java.util.EnumMap;

public class Java_07D_EnumMap_Class {

	enum Color {
		RED, GREEN, BLUE, WHITE
	}

	public static void main(String[] args) {
		
		// Creating an EnumMap of the Color enum
		EnumMap<Color, Integer> e = new EnumMap<>(Color.class);

		// Insert elements in Map
		// using put() method
		e.put(Color.RED, 1);
		e.put(Color.GREEN, 2);

		// Printing mappings to the console
		System.out.println("EnumMap colors1: " + e);

		// Creating an EnumMap of the Color Enum
		EnumMap<Color, Integer> e1 = new EnumMap<>(Color.class);

		// Adding elements using the putAll() method
		e1.putAll(e);
		e1.put(Color.BLUE, 3);

		// Printing mappings to the console
		System.out.println("EnumMap colors2: " + e1);
	}
}