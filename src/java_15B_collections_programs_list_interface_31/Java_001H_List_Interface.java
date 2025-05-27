package java_15B_collections_programs_list_interface_31;

//Java program to Iterate the Elements
//in an List
import java.util.ArrayList;
import java.util.List;

public class Java_001H_List_Interface {

	public static void main(String args[]) {
		
		// Creating an empty Arraylist of string type
		List<String> al = new ArrayList<>();

		// Adding elements to above object of ArrayList
		al.add("Geeks");
		al.add("Geeks");

		// Adding element at specified position
		// inside list object
		al.add(1, "For");

		// Using for loop for iteration
		for (int i = 0; i < al.size(); i++) {

			// Using get() method to
			// access particular element
			System.out.print(al.get(i) + " ");
		}

		// New line for better readability
		System.out.println();

		// Using for-each loop for iteration
		for (String str : al)

			// Printing all the elements
			// which was inside object
			System.out.print(str + " ");
	}
}
