package java_15B_collections_programs_list_interface_42;

//Java Program to Check if an Element is Present in a List
import java.util.ArrayList;
import java.util.List;

public class Java_001G_List_Interface {

	public static void main(String args[]) {

		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		al.add("Geeks");
		al.add("For");
		al.add("Geeks");

		// Checking if element is present using contains()
		// method
		boolean isPresent = al.contains("Geeks");

		// Printing the result
		System.out.println("Is Geeks present in the list? " + isPresent);
	}
}
