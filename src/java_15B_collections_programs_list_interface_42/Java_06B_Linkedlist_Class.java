package java_15B_collections_programs_list_interface_42;

//Java Program to Demonstrate
//Implementation of LinkedList
//class
import java.util.LinkedList;

public class Java_06B_Linkedlist_Class {

	public static void main(String args[]) {

		// Creating object of the
		// class linked list
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}