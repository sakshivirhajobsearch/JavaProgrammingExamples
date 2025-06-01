package java_15B_collections_programs_list_interface_42;

import java.util.LinkedList;

public class Java_06I_Linkedlist_Class {

	public static void main(String args[]) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("LinkedList:" + list);
		System.out.println("The  remove first element is: " + list.removeFirst());
		// Displaying the final list
		System.out.println("Final LinkedList:" + list);
	}
}