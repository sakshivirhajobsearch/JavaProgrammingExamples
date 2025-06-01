package java_15B_collections_programs_list_interface_42;

//Java Program to Update Elements in a List
import java.util.ArrayList;
import java.util.List;

public class Java_001C_List_Interface {

	public static void main(String args[]) {

		// Creating an object of List interface
		List<String> al = new ArrayList<>();

		// Adding elements to object of List class
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "Geeks");

		// Display theinitial elements in List
		System.out.println("Initial ArrayList " + al);

		// Setting (updating) element at 1st index
		// using set() method
		al.set(1, "For");

		// Print and display the updated List
		System.out.println("Updated ArrayList " + al);
	}
}
