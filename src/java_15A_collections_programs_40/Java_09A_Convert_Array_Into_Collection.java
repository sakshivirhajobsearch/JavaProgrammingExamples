package java_15A_collections_programs_40;

//Convert an Array into Collection in Java

//import java util library
import java.util.Arrays;
import java.util.List;

//class for writing logic of the problem

public class Java_09A_Convert_Array_Into_Collection {

	public static void main(String args[]) {

		// array input
		String playersArray[] = { "Virat", "Sachin", "Rohit", "Bumrah" };

		// printing input elements for comparison
		System.out.println("Array input: " + Arrays.toString(playersArray));

		// converting array into Collection
		// with asList() function
		List playersList = Arrays.asList(playersArray);

		// print converted elements
		System.out.println("Converted elements: " + playersList);
	}
}