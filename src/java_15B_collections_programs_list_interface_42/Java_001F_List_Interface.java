package java_15B_collections_programs_list_interface_42;

//Java Program to Access Elements of a List
import java.util.ArrayList;
import java.util.List;

public class Java_001F_List_Interface {

	public static void main(String args[]) {

		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		al.add("Geeks");
		al.add("For");
		al.add("Geeks");

		// Accessing elements using get() method
		String first = al.get(0);
		String second = al.get(1);
		String third = al.get(2);

		// Printing all the elements inside the
		// List interface object
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(al);
	}
}
