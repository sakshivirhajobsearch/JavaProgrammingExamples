package java_15B_collections_programs_list_interface_42;

//Java program to remove elements
//in a LinkedList
import java.util.LinkedList;

public class Java_06E_Linkedlist_Class {

	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");

		System.out.println("Initial LinkedList " + ll);

		// Function call
		ll.remove(1);

		System.out.println("After the Index Removal " + ll);

		ll.remove("Geeks");

		System.out.println("After the Object Removal " + ll);
	}
}