package java_15B_collections_programs_list_interface_42;

//Java program to add elements
//to a LinkedList
import java.util.LinkedList;

public class Java_06C_Linkedlist_Class {

	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");

		System.out.println(ll);
	}
}
