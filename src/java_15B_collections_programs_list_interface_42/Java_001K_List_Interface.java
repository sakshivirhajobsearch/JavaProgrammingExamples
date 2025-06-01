package java_15B_collections_programs_list_interface_42;

import java.util.List;
import java.util.Stack;

public class Java_001K_List_Interface {

	public static void main(String[] args) {

		// Size of the stack
		int n = 5;

		// Declaring the List
		List<Integer> s = new Stack<Integer>();

		// Appending the new elements
		// at the end of the list
		for (int i = 1; i <= n; i++)
			s.add(i);

		// Printing elements
		System.out.println(s);

		// Remove element at index 3
		s.remove(3);

		// Displaying the list after deletion
		System.out.println(s);

		// Printing elements one by one
		for (int i = 0; i < s.size(); i++)
			System.out.print(s.get(i) + " ");
	}
}
