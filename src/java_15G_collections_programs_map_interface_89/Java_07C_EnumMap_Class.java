package java_15G_collections_programs_map_interface_89;

//Java Program to create, perform basic operation
import java.util.EnumMap;

public class Java_07C_EnumMap_Class {

	// Defining an enum called GFG
	public enum GFG {

		CODE, CONTRIBUTE, QUIZ, MCQ
	}

	public static void main(String[] args) {

		// Creating an EnumMap where the key is
		// of type GFG and the value is a String
		EnumMap<GFG, String> e = new EnumMap<>(GFG.class);

		// Adding key-value pairs to the map
		e.put(GFG.CODE, "Start Coding with GFG");
		e.put(GFG.CONTRIBUTE, "Contribute for others");
		e.put(GFG.QUIZ, "Practice Quizzes");
		e.put(GFG.MCQ, "Test Speed with MCQs");

		// Printing the size of the EnumMap
		System.out.println("Size of EnumMap: " + e.size());

		// Printing the contents of the EnumMap
		// The map will print in the natural order of
		// enum keys (the order in which they are defined)
		System.out.println("EnumMap: " + e);

		// Retrieving a value from the EnumMap using a specific key
		System.out.println("Value for CODE: " + e.get(GFG.CODE));

		// Checking if the EnumMap contains a specific key
		System.out.println("Does gfgMap contain CONTRIBUTE? " + e.containsKey(GFG.CONTRIBUTE));

		// Checking if the EnumMap contains a specific value
		System.out.println("Does gfgMap contain the value 'Practice Quizzes'? " + e.containsValue("Practice Quizzes"));

		// Checking if the EnumMap contains a null value
		// (which is not present in this example)
		System.out.println("Does gfgMap contain a null value? " + e.containsValue(null));
	}
}
