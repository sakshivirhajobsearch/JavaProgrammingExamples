package java_15B_collections_programs_list_interface_42;

//Java Program to Add Elements to a List
import java.util.ArrayList;
import java.util.List;

public class Java_001B_List_Interface {

	public static void main(String args[]) {

		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		// Custom elements
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "For");

		// Print all the elements inside the
		// List interface object
		System.out.println(al);
	}
}